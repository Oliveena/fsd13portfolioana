/// https://stackoverflow.com/questions/5486402/disabling-inherited-method-on-derived-class

package MedicalClinicSystem;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/// importing the scanner for user data entry
import static MedicalClinicSystem.MainA.scanner;

public class Appointment implements Schedulable {
    // add 3edits related to interface S
    Random random = new Random();
    /// declaring the data members specific to class Appointment
    private String appointmentID;
    private LocalDate appointmentDate;
    private Patient patient;
    private Doctor doctor;

    /// default constructor for class Appointment
    public Appointment() {
    }

    /// parametrized constructor for class Appointment
    public Appointment(String appointmentID, LocalDate appointmentDate, Patient patient, Doctor doctor) {
        this.appointmentID = appointmentID;
        this.appointmentDate = appointmentDate;
        this.patient = patient;
        this.doctor = doctor;
    }

    // appointmentDate = date.setDate();
    //

    /// setter for unique ID for each appointment
    public String setAppointmentID(String firstNameDoctor, String lastNameDoctor) {
        this.appointmentID = firstNameDoctor.charAt(0) + lastNameDoctor.charAt(0) + String.valueOf(random.nextInt(100000, 999999));
        return appointmentID;
    }

    public String getAppointmentID() {
        return appointmentID;
    }


    public void setAppointmentDate(LocalDate appointmentDate) {
        //this.appointmentDate = appointmentDate;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }


    /// scheduling an appointment using Scanner input
    @Override
    public void scheduleAppointment() {

        // prompt user for appointment date
        System.out.println("Enter appointment date (dd/MM/yyyy): ");
        String appointmentDay = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate appointmentDate = LocalDate.parse(appointmentDay, formatter);

        // prompt user for Doctor input
        System.out.print("Enter doctor's first name: ");
        String firstName1 = scanner.nextLine();
        System.out.print("Enter doctor's last name: ");
        String lastName1 = scanner.nextLine();
        System.out.print("Enter doctor's prescriber ID: ");
        String prescriberID = scanner.nextLine();

        Doctor doctor = new Doctor(firstName1, lastName1, prescriberID);

        // prompt user for Patient input
        System.out.print("Enter patient's first name: ");
        String firstName2 = scanner.nextLine();
        System.out.print("Enter patient's last name: ");
        String lastName2 = scanner.nextLine();
        System.out.print("Enter patient's ID: ");
        String patientID = scanner.nextLine();

//        Patient patient = new Patient(firstName2, lastName2, patientID);

        //create an appointment
        Appointment appointment = new Appointment(appointmentID, appointmentDate, patient, doctor);
        System.out.println("\nAppointment successfully scheduled.");
        System.out.println(appointment);

        try {
            FileWriter fileWriter = new FileWriter("Appointment.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.write(this.toString());
            printWriter.close();
            System.out.println("Appointment added successfully!");
        } catch (IOException e) {
            System.out.println("Error. Please try again.");
        }
    }


    // display appointment details
    @Override
    public String toString() {
        return "\nAppointment ID: " + setAppointmentID(doctor.getFirstName(), doctor.getLastName()) + "\n"
                + "Appointment Date: " + appointmentDate + "\n"
                + "Patient: " + patient.getFirstName() + " " + patient.getLastName() + " - ID: " + patient.getPatientID() + "\n"
                + "Doctor: " + doctor.getFirstName() + " " + doctor.getLastName() + " - Prescriber ID: " + doctor.getPrescriberID();
    }
}

 /* OPTIONAL:

    // method to modify appointment
    public void modifyAppointment() {
        // determine which element of the appointment we want to modify
    }

    // method to cancel an appointment
    public void cancelAppointment() {
        // remove appointment from the Collection that stores appointments
    }
*/

