/*
 * Things we gotta review as per project instructions:
 * - are there default constructors for every class? (bottom of page 8/10)
 *
 * - "Provide a getter method only if you want the data field to be readable, and provide a setter method only if you want the data to be updatable"
 * We have provided getters/setters for everything (top of page 9/10)
 *
 * - "Do not declare a data field that can be derived from other data fields. E.g. age can be derived from dateOfBirth, so it should not be declared in a separate data field.:"
 * We have declared EVERYTHING. (middle of page 9/10)
 *
 * - customise classes thru properties and methods (middle of page 9/10)
 *
 * - "Always reference static variables and methods using the class name (e.g. Class.getterOfSomeSortBlaBla() ) rather than by reference variable" (middle of page 9/10)
 *
 * - modeling stuff as per Inheritance vs Aggregation (end of page 9/10)
 * */
package MedicalClinicSystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuTester {
    /// Scanner static, for use by all classes
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n===== Receptionist Menu =====");

        /// associating user choice and menu value

        // print menu options
        for (MenuOption option : MenuOption.values()) {
            System.out.println(option.getValue() + ". " + option.getDescription());

        }//
        boolean control = false;
        int choice = 0;

        do {// get user input
            try {
                System.out.print("\nPlease choose an action: ");
                choice = scanner.nextInt();
                while (choice < 1 || choice > 8) {
                    System.out.println("Invalid option. Please try again");
                    choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 8) {
                        control = true;
                        break;
                    }
                }
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Invalid option. Please try again");
            }
        } while (control);
        MenuOption selectedOption = MenuOption.fromInt(choice);


        // use enhanced switch
        switch (selectedOption) {
            case ADD_DOCTOR -> {
                // sout Enter fist doctor or -1 to stop
                // sout How many doctors to add
                // for ()
                //while choice != -1 ,
                System.out.println("Add a new Doctor...");
                // call to Doctor methods
                Doctor doctor = new Doctor();
                doctor.addDoctor();
                doctor.displayDoctors(doctor.getListOfDoctors());
            }
            case ADD_PATIENT -> System.out.println("Add a new Patient...");
            case VIEW_DOCTOR_DETAILS -> System.out.println("Display Doctor Info...");
            case VIEW_PATIENT_DETAILS -> System.out.println("Display Patient Info...");
            case ADD_TREATMENT -> System.out.println("Add a new Treatment...");
            case VIEW_TREATMENT_DETAILS -> System.out.println("View Treatment Details...");
            case ADD_APPOINTMENT -> System.out.println("Add a new Appointment...");
            case EXIT ->
                    System.out.println("Exiting the Medical Clinic System...");        //  call method Exit() down below
        }
    }

    // Optional: add options modify & delete an appointment

    // method for option 7, Exit()
    public static void Exit(Scanner scanner) {
        System.out.println("""
                
                Would you like to exit?
                
                1 -> Exit;
                2 -> Return to main page;
                """);
        int exit = scanner.nextInt();
        switch (exit) {
            case 1:
                System.out.println("Thank you for using our address book. Goodbye!");
                scanner.close();
                return;

            case 2:
                System.out.println("Coming back to the main menu: ");
                // return to Main menu
                break;
            default:
                System.out.println("Please choose one of the options above.");
                //continue;

        }
    }
}
