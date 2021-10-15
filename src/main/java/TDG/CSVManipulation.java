package TDG;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CSVManipulation
{
    private String CSV_FILE;

    public void getCSVFile(int indexFile)
   {
      this.CSV_FILE = "K:\\"+indexFile+"test.csv";
   }

    public void writeCSVFile()
            throws IOException
        {
            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(CSV_FILE));
                 CSVPrinter csvPrinter = new CSVPrinter(writer,CSVFormat.EXCEL);
                 )
            {
                csvPrinter.printRecord("firstname", "lastname","email","group_name");

                for(int index =0; index<10; index++)
                {
                    Person newPerson = new Person();
                    csvPrinter.printRecord(newPerson.getRandomFirstName(), newPerson.getRandomLastName(), newPerson.getRandomEmailAddress(), newPerson.getGroupName());
                }
                csvPrinter.flush();
            }
        }

}
