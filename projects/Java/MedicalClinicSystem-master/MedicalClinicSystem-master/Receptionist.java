//package MedicalClinicSystem;
//
//import java.io.*;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.HashMap;
//import java.util.Scanner;
//
///// subclass of Person
//public class Receptionist extends Person implements Schedulable {
//    Date date = new Date();
//    private Scanner scanner = new Scanner(System.in);
//    //HashMap<Strin>
//
//    /// made the default constructor private, bc we don't want the user to create new Receptionists (see Instructions end of page 8)
//    private Receptionist() {
//    }
//
//    // REQUIREMENT 11: SAVE AND LOAD INFORMATION ABOUT DOCTORS, PATIENTS, AND TREATMENT TO/FROM A FILE
//    //----------- https://beginnersbook.com/2014/01/how-to-append-to-a-file-in-java/ -------------------
//    // TODO: addTreatment()
//
//    /// method to add a new doctor to the list of listOfDoctors associated with the clinic
//    public void addDoctor() {
//        // Prompting user for inputs
//        System.out.print("Enter doctor's first name: ");
//        String firstName = scanner.nextLine();
//        System.out.print("Enter doctor's last name: ");
//        String lastName = scanner.nextLine();
//
//        System.out.println("Enter doctor's date of birth (dd/MM/yyyy): ");
//        String dateOfBirth = scanner.nextLine();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate birthDate = LocalDate.parse(dateOfBirth, formatter);
//
//        System.out.println("Enter doctor's gender: ");
//        String gender = scanner.nextLine();
//        System.out.print("Enter doctor's specialty: ");
//        String speciality = scanner.nextLine();
//        System.out.print("Enter doctor's prescriber ID: ");
//        String prescriberID = scanner.nextLine();
//
//
//        Doctor doctor = new Doctor(firstName, lastName, birthDate, gender, speciality, prescriberID);
//        String doctorInfo = "\n" + doctor.getFirstName() + " " + doctor.getLastName() + " - Date of Birth: " + doctor.getDateOfBirth() + " - Gender: " + gender +
//                " - Specialty: " + doctor.getSpeciality() + " - Prescriber ID: " + doctor.getPrescriberID();
//
//
//
//        public void writeToFile() {
//            /// adding user-entered data into text file
//            try {
//                // constructs a FileWriter object which allow a file to be opened for writing by only one FileWriter
//                FileWriter fileWriter = new FileWriter("C:\\Users\\anata\\Documents\\GitHub\\MedicalClinicSystem\\MedicalClinicSystem\\Doctor.txt", true);       // boolean true: data will be appended to the end of the existing file (false: override)
//                PrintWriter printWriter = new PrintWriter(fileWriter);                                                                            // print into the same file
//                printWriter.write(doctorInfo);                                                                                                    // write into printWriter String doctorInfo
//                printWriter.close();                                                                                                              // close
//                System.out.println("Doctor added successfully!");
//            } catch (
//                    IOException e) {                                                                                                             // throws exception when directory different than a regular file, does not exist but cannot be created, or cannot be open
//                System.out.println("Error: Unable to add doctor.");
//            }
//        }
//    }
//
//    /// similar method to add patient
//    public void addPatient() {
//        // prompt user for input
//        System.out.print("Enter patient's first name: ");
//        String firstName = scanner.nextLine();
//        System.out.print("Enter patient's last name: ");
//        String lastName = scanner.nextLine();
//        System.out.print("Enter patient's gender: ");
//        String gender = scanner.nextLine();
//
//        System.out.println("Enter patient's date of birth (dd/MM/yyyy): ");
//        String dateOfBirth = scanner.nextLine();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        LocalDate birthDate = LocalDate.parse(dateOfBirth, formatter);
//        System.out.print("Enter patient's ID: ");
//        String patientID = scanner.nextLine();
//        System.out.print("Enter patient's age: ");
//        int patientAge = scanner.nextInt();
//
//        // create patient object
//        Patient patient = new Patient(firstName, lastName, gender, birthDate, patientID, patientAge);
//        String patientInfo = "\n" + patient.getFirstName() + " " + patient.getLastName() + " - Gender: " + patient.getGender() + " - Date of Birth: " + patient.getDateOfBirth() +
//                " - Patient ID: " + patient.getPatientID() + " - Age: " + date.calculateAge();
//
//        // add info into text file
//        try {
//            FileWriter fileWriter = new FileWriter("C:\\Users\\anata\\Documents\\GitHub\\MedicalClinicSystem\\MedicalClinicSystem\\Patient.txt", true);
//            PrintWriter printWriter = new PrintWriter(fileWriter);
//            printWriter.write(patientInfo);
//            printWriter.close();
//            System.out.println("Patient added successfully!");
//        } catch (IOException e) {
//            System.out.println("Error: Unable to add patient.");
//        }
//    }
//
//    /// displaying the doctor list from Doctor.txt
//    public void doctorList() {
//        System.out.println("Doctor list: ");
//        try {
//            FileReader file = new FileReader("C:\\Users\\anata\\Documents\\GitHub\\MedicalClinicSystem\\MedicalClinicSystem\\Doctor.txt");
//            Scanner fileScanner = new Scanner(file);
//
//            while (fileScanner.hasNextLine()) {             // returns true if there is another line in the input of this scanner
//                System.out.println(fileScanner.nextLine()); // print out that line
//            }
//
//            fileScanner.close();                            // close when loop is done
//        } catch (FileNotFoundException e) {                 // if no line found, catch exception
//            System.out.println("Error: Doctor list file not found.");
//        }
//    }
//
//    /// displaying the patient list from Patient.txt
//    public void patientList() {
//        System.out.println("Patient list: ");
//        try {
//            FileReader file = new FileReader("C:\\Users\\anata\\Documents\\GitHub\\MedicalClinicSystem\\MedicalClinicSystem\\Patient.txt");
//            Scanner fileScanner = new Scanner(file);
//
//            while (fileScanner.hasNextLine()) {
//                System.out.println(fileScanner.nextLine());
//            }
//
//            fileScanner.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("Error: Patient list file not found.");
//        }
//    }
//
//    @Override
//    public void scheduleAppointment() {
//    }
//}
//
//
//}
