package modelnova;

import java.io.Serializable;
import java.time.LocalDate;

public class Person
{
    // Generate unique easy to read ids for people
    // Static count will incriminate with each creation of
    // a Person obj
    private static int count = 0;

    private int id;
    private String firstName;
    private String lastName;
    private LocalDate arrivalDate = LocalDate.now();
    private String passportNumber;

    // No need to be private
    public Priority priority;

    public Person(String firstName, String lastName, String passportNumber ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.id = count;
        count++;
    }

    /* GETTERS */

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Priority getPriority() {
        return priority; }


    /*
    *  SETTERS
    *  Should only ever be able to override these attributes, all others remain
    *  unchanged.
    * */

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setPassportNumber(String passportNumber) {

        this.passportNumber = passportNumber;
    }
}
