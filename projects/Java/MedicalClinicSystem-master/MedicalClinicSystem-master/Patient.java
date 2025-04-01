package MedicalClinicSystem;

import java.time.LocalDate;
import MedicalClinicSystem.Date;

/// class Person is the superclass of classes Patient, Doctor and Receptionist
public abstract class Person {

    /// declaring fields reserved to superclass Person
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    // Address
    // Phone No
    // Email

    /// default constructor for Person class
    public Person () {
    }

    /// parametrized constructor for Person class
    public Person(LocalDate dateOfBirth, String firstName, String lastName, String gender) {
        this.firstName = "FirstName";
        this.lastName = "LastName";
        this.dateOfBirth = dateOfBirth;
        this.gender = "Gender";
    }

//    public Person(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }

    public void setFirstName(String firstName) {
        if (firstName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty");
        } else if (firstName.length() > 30) {
            throw new IllegalArgumentException("Wow! Long name! First name cannot be longer than 30 characters");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty");
        } else if (lastName.length() > 30) {
            throw new IllegalArgumentException("Wow! Long name! First name cannot be longer than 30 characters");
        }
        this.lastName = lastName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        setDateOfBirth(dateOfBirth);
    }

    public void setGender(String gender) {

        this.gender = gender;
    }
    // OPTIONAL: woman, man, X

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void displayPerson(){
        System.out.println("Person : " + firstName + " " + lastName);
        System.out.println("Date of Birth : " + dateOfBirth);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + dateOfBirth + " " + gender;
    }

    public String fullNametoString() {return firstName + " " + lastName;}
}
