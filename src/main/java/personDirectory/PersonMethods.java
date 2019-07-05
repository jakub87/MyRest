package personDirectory;

import java.util.List;

public interface PersonMethods
{
    List<Person> getAllPersons();
    Person findPersonByID(int id);
    List <Person> findbySurname(String lastName);
    void addPerson(Person person);
    void deletePersonById(int id);
    void deleteAllPersons();
}
