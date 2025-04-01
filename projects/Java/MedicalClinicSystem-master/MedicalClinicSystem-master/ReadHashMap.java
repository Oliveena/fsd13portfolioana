package MedicalClinicSystem;

import java.io.*;
import java.util.*;

public class ReadHashMap {
    final static String outputFilePath
            = "C:\\Users\\anata\\Documents\\GitHub\\MedicalClinicSystem\\MedicalClinicSystem\\Treatment.txt";  // Changed to a simpler path for testing

    public void addDoctorHashMap() {
        // create new HashMap with unique keys (full name as key)
        HashMap<String, String> doctors = new HashMap<>();


        // Use full name or a unique identifier as the key
        doctors.put("Drapeau", "02090");
        doctors.put("Tu", "79552");
        doctors.put("Benoit", "14318");
        doctors.put("Nguegno", "10002");
        doctors.put("Pearl", "63321");
        doctors.put("Yatsevska", "19460");
        doctors.put("Tremblay", "08555");
        doctors.put("Tremblay", "96318");


        // print map contents for debugging
        doctors.forEach((name, prescriberID) -> System.out.println("Dr. " + name + " - PrescriberID: " + prescriberID));

        // write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            doctors.forEach((name, prescriberID) -> {
                try {
                    writer.write("Dr. " + name + " - PrescriberID: " + prescriberID);
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            System.out.println("File written successfully to: " + new File(outputFilePath).getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
