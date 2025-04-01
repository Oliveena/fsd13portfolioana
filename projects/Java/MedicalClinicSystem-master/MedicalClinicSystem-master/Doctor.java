package MedicalClinicSystem;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static MedicalClinicSystem.MenuTester.scanner;

public class Doctor extends Person implements Treatable, Schedulable{


    /*

// OPTIONAL:  print out out list of ALL the listOfDoctors
e.g. use it in Treatment class to output Dr ID and Dr name
        listOfDoctors.forEach((lastName, prescriberID) ->
                System.out.println(lastName + " " + prescriberID));
*/

     ArrayList<String> listOfDoctors = new ArrayList<>();

    /// fields specific to Doctor class
    private String speciality;
    private String prescriberID;

    /// default constructor for Doctor class
    public Doctor(){}

    /// parametrized constructor for Doctor class
    public Doctor(String firstName, String lastName, LocalDate dateOfBirth, String gender, String speciality, String prescriberID) {
        super(dateOfBirth, firstName, lastName, gender);
        this.speciality = speciality;
        this.prescriberID = prescriberID;
    }

    /// new Doctor class constructor with parameters
    public Doctor(String firstName, String lastName, String prescriberID) {
        super(firstName, lastName);
        this.prescriberID = prescriberID;
    }

    //OPTIONAL: Set Doctor as a Superclass and have subclasses such as Doctor Specialty : Surgeon, Family Doctor, Cardiologist, ect
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    public void addDoctor() {
        // Prompting user for inputs
        System.out.print("Enter doctor's first name: ");
        scanner.nextLine();
        String firstName = scanner.nextLine();
        super.setFirstName(firstName);
        //scanner.nextLine();
        System.out.print("Enter doctor's last name: ");
        String lastName = scanner.nextLine();
        super.setLastName(lastName);
        System.out.println("Enter doctor's date of birth (dd/MM/yyyy): ");
        String dateOfBirth = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(dateOfBirth, formatter);

        System.out.println("Enter doctor's gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter doctor's specialty: ");
        String speciality = scanner.nextLine();
        System.out.print("Enter doctor's prescriber ID: ");
        String prescriberID = scanner.nextLine();

        Doctor doctor = new Doctor(firstName, lastName, birthDate, gender, speciality, prescriberID);
        String doctorInfo = "\n" + doctor.getFirstName() + " " + doctor.getLastName() + " - Date of Birth: " + doctor.getDateOfBirth() + " - Gender: " + gender +
                " - Specialty: " + doctor.getSpeciality() + " - Prescriber ID: " + doctor.getPrescriberID();
        listOfDoctors.add(doctorInfo);
        System.out.println("New doctor successfully added to list of Doctors.");

    }

    /// method to display all of the doctors employed at the clinic
    public void displayDoctors(ArrayList<String> listOfDoctors) {
       // listOfDoctors.forEach((String name, String prescriberID) ->
               // System.out.println(doctor.fullName.toString() + " " + prescriberID));
        for (int i = 0; i < listOfDoctors.size(); i++)  {
            System.out.println("Doctor " + (i+1) + ": " + listOfDoctors.get(i));
        }
    }

    public ArrayList<String> getListOfDoctors() {
        return listOfDoctors;
    }

    public String getSpeciality() {
        return speciality; }

    public String getPrescriberID() {
        return prescriberID;
    }

    // only for testing
    public void setPrescriberID(String prescriberID){
        this.prescriberID = prescriberID;
    }

    public void setPrescriberID() {
            System.out.println("Enter the Prescribers ID (4-9 digits) : ");
            prescriberID = scanner.nextLine();
            // regex tutorial https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html
            while (prescriberID.isEmpty() || !prescriberID.matches("\\d{0,9}") || (prescriberID.length() < 5) || prescriberID.length() > 9) {
                System.out.println("Prescriber ID can't be empty and must be between 4 and 9 digits : ");
                prescriberID = scanner.nextLine();
            }
    }

    // link with the interface Treatable and Pt class. Dr can perform treatment on a Pt.
    @Override
    public void performTreatment(){
        boolean accepted = false;
    }

    @Override
    public void scheduleAppointment() {

    }
}
// OPTIONAL: Billing class
// methods specific to Doctor class, to implement once Billing is created

// can be also applied to optional class Nurse
// public void prescribeTreatment() {
//        if (treatment = pharmacologicalTreatment) {
//            bill = 150;
//        } else if (treatment = nonPharmacologicalTreatment) {
//            bill = 100;
//        }
//    }
//
//    public void performMinorSurgery() {
//        bill += 350;
//    }
//
//    public void performExamination() {
//        bill += 200;
//    }
//
//  /// OPTIONAL: restrict performObstetricExamination() to Doctors who are Obstetricians only
//    public void performObstetricExamination() {
//        bill += 950;
//    }
//
//    public void signInsurancePapers() {
//        bill += 75;
//    }
//
//    public void signAnAbsenceNote() {
//        bill += 20;
//    }

