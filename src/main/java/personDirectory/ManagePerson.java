package personDirectory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ManagePerson implements PersonMethods {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("opel");
    private EntityManager em = emf.createEntityManager();

    @Override
    public List<Person> getAllPersons()
    {
        Query personAllList = em.createQuery("select p from Person p");
        List <Person> result = personAllList.getResultList();
        return result;
    }

    @Override
    public Person findPersonByID(int id)
    {
        return em.find(Person.class, id);
    }

    @Override
    public List<Person> findbySurname(String lastName)
    {
        return em.createQuery("select p from Person p where p.lastName = ?1",Person.class).setParameter(1,lastName).getResultList();
    }

    @Override
    public void addPerson(Person person)
    {
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
    }

    @Override
    public void deletePersonById(int id) {
        em.getTransaction().begin();
        em.remove(em.find(Person.class,id));
        em.getTransaction().commit();
    }

    @Override
    public void deleteAllPersons() {
        em.getTransaction().begin();
        em.createQuery("delete from Person p").executeUpdate();
        em.getTransaction().commit();
    }


}
