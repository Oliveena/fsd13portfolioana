/**
 * This is the Main class of our program to calculate different carbon footprints.
 *
 *
 * @see CarbonFootprint.CarbonFootprint
 * @see CarbonFootprint.Vehicle
 * @see CarbonFootprint.Car;
 * @see CarbonFootprint.Truck;
 * @see CarbonFootprint.Bicycle;
 * @see CarbonFootprint.Building;
 * @see CarbonFootprint.Diet
 */

import CarbonFootprint.CarbonFootprint;
import CarbonFootprint.Car;
import CarbonFootprint.Truck;
import CarbonFootprint.Bicycle;
import CarbonFootprint.Building;
import CarbonFootprint.Diet;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

/**
 *  creating an ArrayList to store all of the generated Objects of different classes
 */
// for SOLID principles, this should be a method. Why I'm not doing it? It's 11pm. I still have yesterday's homework to refactor.
        ArrayList<CarbonFootprint> carbonFootprints = new ArrayList<>();

/**
 * creating new instances of Car objects
 */
        Car car1 = new Car(
                "Toyota", 4, "Corolla", "FWD", "hybrid", 10.0, 200.0);

        Truck truck1 = new Truck("Peterbilt", 8, "381", 2,
                32.00, 775.00);

        Bicycle bicycle1 = new Bicycle("Mongoose", "Grendel", 2, "urban", 0, 25.5);

        Building building1 = new Building(false, true, "electric heating", 600.00, 100000);

        Diet diet1 = new Diet(false,true);

/**
 * placing all Objects into the ArrayList above
 */
        carbonFootprints.add(car1);
        carbonFootprints.add(truck1);
        carbonFootprints.add(bicycle1);
        carbonFootprints.add(building1);
        carbonFootprints.add(diet1);

        printingOutTheArray(carbonFootprints);
    } // end of Main method


    /**
     * this method allows printing out an ArrayList
     * here we print out our ArrayList of carbon footprints collected from various classes in this package.
     * @param carbonFootprints the cntents of the Carbon Footpring containing ArrayList
     */
    public static void printingOutTheArray(ArrayList<CarbonFootprint> carbonFootprints) {
        System.out.println("\n\t\t\t\tList of carbon footprints");
        System.out.println("================================================================================");
        /**
         * loop to iterate through the ArrayList containing all of the Objects above
         */
        try {
            for (CarbonFootprint currentCarbonFootprint : carbonFootprints) {
                System.out.println(currentCarbonFootprint);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        // testing each type of Object individually
//        System.out.println(car1.toString());
//        System.out.println(truck1.toString());
//        System.out.println(bicycle1.toString());
//        System.out.println(building1.toString());
    }
}
