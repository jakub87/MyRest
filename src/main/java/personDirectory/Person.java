package personDirectory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String city;
    private String province;
    private String street;
    private long personalIdentityNumber;
    private int yearOfBirth;

    public Person() {
    }

    public Person(String firstName, String lastName, String city, String province, String street, long personalIdentityNumber, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.province = province;
        this.street = street;
        this.personalIdentityNumber = personalIdentityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getStreet() {
        return street;
    }

    public long getPersonalIdentityNumber() {
        return personalIdentityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPersonalIdentityNumber(int personalIdentityNumber) {
        this.personalIdentityNumber = personalIdentityNumber;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", street='" + street + '\'' +
                ", personalIdentityNumber=" + personalIdentityNumber +
                ", yearOfBirth=" + yearOfBirth;
    }
}