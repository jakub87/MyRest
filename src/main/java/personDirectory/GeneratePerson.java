package personDirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratePerson {

    private String firstName;
    private String lastName;
    private String city;
    private String province;
    private String street;
    private long personalIdentityNumber;
    private int yearOfBirth;

    private List<String> maleNames;
    private List<String> femaleNames;
    private List<String> surnames;
    private List<String> citiesAndProvince;
    private List<String> streets;

    private Random random;

    public GeneratePerson() throws IOException {

        random = new Random();
        maleNames = Files.readAllLines(Paths.get("C:/Users/A593191/Desktop/REST API/MyRest/imiona_meskie.txt"));
        femaleNames = Files.readAllLines(Paths.get("C:/Users/A593191/Desktop/REST API/MyRest/imiona_zenskie.txt"));
        surnames = Files.readAllLines(Paths.get("C:/Users/A593191/Desktop/REST API/MyRest/nazwiska.txt"));
        citiesAndProvince = Files.readAllLines(Paths.get("C:/Users/A593191/Desktop/REST API/MyRest/miasto_wojewodztwo.txt"));
        streets = Files.readAllLines(Paths.get("C:/Users/A593191/Desktop/REST API/MyRest/ulice.txt"));
    }

    public List<Person> generatePerson(int numberOfPersons)
    {
        List <Person> personList = new ArrayList<>();
        for (int i = 0 ; i < numberOfPersons ; i++)
        {
            int type = random.nextInt((1) + 1);
            if (type == 0) // to men
            {
                firstName = maleNames.get(random.nextInt((maleNames.size() - 1) + 1));
            }
            else  //to woman
            {
                firstName = femaleNames.get(random.nextInt((femaleNames.size() - 1) + 1));
            }

            lastName = surnames.get(random.nextInt((surnames.size() - 1) + 1));
            int cityAndProvinceNumber = random.nextInt((citiesAndProvince.size() - 1) + 1);
            String[] split = citiesAndProvince.get(cityAndProvinceNumber).split(";");
            city = split[0];
            province = split[1];
            street = streets.get(random.nextInt((streets.size() - 1) + 1));
            personalIdentityNumber = 10000000000L + (long) (random.nextDouble() * 99999999999L);
            yearOfBirth = random.nextInt((2005 - 1950) + 1) + 1950;
            personList.add(new Person(firstName, lastName, city, province, street, personalIdentityNumber, yearOfBirth));
        }

        return personList;
    }


    public void showListOfPersons(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person);
        }

    }



}
