package rest;

import personDirectory.GeneratePerson;
import personDirectory.ManagePerson;
import personDirectory.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.List;

@Path("persons")
public class RestPerson {

    ManagePerson managePerson = new ManagePerson();

//    @GET
//    @Path("/getallpersons")
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getAllPersons() {
//
//        List<Person> list = managePerson.getAllPersons();
//        return list.toString();
//    }

    @GET
    @Path("/getallpersons")
    @Produces(MediaType.APPLICATION_JSON)
    public List <Person> getAllPersons() {

        List<Person> list = managePerson.getAllPersons();
        return list;
    }

    @GET
    @Path("findbyid/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person findUserById(@PathParam("id") int id)
    {
       return managePerson.findPersonByID(id);
    }

    @DELETE
    @Path("deletebyid/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response deleteUser(@PathParam("id") int id)
    {
        managePerson.deletePersonById(id);
        return Response.ok("Usunieto").build();
    }

    @DELETE
    @Path("deleteall")
    @Produces(MediaType.TEXT_PLAIN)
    public Response deleteAllPersons()
    {
        managePerson.deleteAllPersons();
        return Response.ok("Usunieto wszystkich").build();
    }

    @GET
    @Path("/findbylastname/{lastname}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPersonByLastName(@PathParam("lastname") String lastName)
    {
        return managePerson.findbySurname(lastName);
    }


    @POST
    @Path("/adduser")
    public Response addUser(
            @FormParam("firstName") String firstName,
            @FormParam("lastName") String lastName,
            @FormParam("personalIdentityNumber") long personalIdentityNumber,
            @FormParam("province") String province,
            @FormParam("street") String street,
            @FormParam("city") String city,
            @FormParam("yearOfBirth") int yearOfBirth)
    {
        managePerson.addPerson(new Person(firstName,lastName,city,province,street,personalIdentityNumber,yearOfBirth));
        return Response.ok("Dodano").build();
    }

    @POST
    @Path("/generatepersons")
    public Response generatePersons(@FormParam("numberOfPersons") int numberOfPersons) throws IOException {
        GeneratePerson generatePerson = new GeneratePerson();
        List<Person> personList = generatePerson.generatePerson(numberOfPersons);
        for (Person p: personList)
        {
            managePerson.addPerson(p);
        }

        return Response.ok("Wygenerowano").build();
    }



}
