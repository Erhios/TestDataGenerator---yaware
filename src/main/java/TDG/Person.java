package TDG;



import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Person
{
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String groupName;

    String lexicon = "ABCDEFGHIKLMNOPQRSTVXYZ";
    String lexiconEmail = "ABCDEFGHIKLMNOPQRSTVXYZ1234567890_";

    public String getRandomFirstName()
    {
         int firstNameLength =(int)( 5+Math.random()*5);
         StringBuffer firstname = new StringBuffer();

        for (int i = 0; i < firstNameLength; i++)
        {
            firstname.append(lexicon.charAt(new Random().nextInt(lexicon.length())));
        }

        return this.firstName = firstname.toString();
    }

    public String getRandomEmailAddress()
    {
        int emailAddressLength =(int)( 5+Math.random()*15);
        StringBuffer emailAddress = new StringBuffer();

        for (int i = 0; i < emailAddressLength; i++)
        {
            emailAddress.append(lexiconEmail.charAt(new Random().nextInt(lexiconEmail.length())));
        }

        return this.emailAddress = emailAddress +"@gmail.com";
    }

    public String getRandomLastName()
    {
        int lastNameLength =(int)( 5+Math.random()*5);
        StringBuffer lastName = new StringBuffer();

        for (int i = 0; i < lastNameLength; i++)
        {
            lastName.append(lexicon.charAt(new Random().nextInt(lexicon.length())));
        }

        return this.lastName = lastName.toString();
    }

    public String getGroupName()
    {
        List<String> GroupName = Arrays.asList("bookkeeping group","marketing group","dev group","management group");

        return this.groupName = GroupName.get(new Random().nextInt(GroupName.size()));
    }


}
