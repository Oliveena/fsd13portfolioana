/**
 * This is the concrete class Car.
 * It is a subclass of Vehicle class.
 * It implements the interface CarbonFootprint.
 *
 * @see CarbonFootprint.Vehicle
 * @see CarbonFootprint.CarbonFootprint
 * @throws IllegalArgumentException if amount of axles is less than 1
 */

package CarbonFootprint;

public class Truck extends Vehicle {

    /**
     * fields (data members) specific to the Truck objects.
     */
    int numberOfAxles;
    double fuelConsumption;
    double distanceTravelled;

    /**
     * parametrized constructor for concrete class Truck objects
     *
     * @param model
     * @param amountOfWheels
     */
    public Truck(String model, int amountOfWheels, String make, int numberOfAxles, double fuelConsumption, double distanceTravelled) {
        super(model, make, amountOfWheels, fuelConsumption, distanceTravelled);
        this.numberOfAxles = numberOfAxles;
        //this.engineType = engineType;
    }

    /**
     * getter for amount of axles
     * @return number of truck axles
     */
    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    /**
     * setter for amount of axles
     * @param numberOfAxles
     * @throws IllegalArgumentException if amount of axles is less than 1
     * and more than 3
     */
    public void setNumberOfAxles(int numberOfAxles) {
        try {
            if (numberOfAxles < 1 || numberOfAxles > 3) {
                throw new IllegalArgumentException("Number of axles must be between 0 and 3");
            }
            this.numberOfAxles = numberOfAxles;
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * overriding the interface method for getting the carbon footprint of the Truck.
     * Mathematically, we perform:
     * distanceTraveled (km) * getFuelConsumption (L/km) * 3.5 kgCO2/L
     * because trucks consume more than cars
     * Answer will be in units of kgCO2
     * @return carbonFootprint
     */
    @Override
    public double getCarbonFootprint() {
        return Math.round(getDistanceTravelled() * getFuelConsumption() * 3.5);
    }

    /**
     * overriding the interface method for printing out the info of the Truck
     * @return toString
     */
    @Override
    public String toString() {
        return String.format("%s : The %s %s generated %s kg CO2 after driving %s kilometers. \n", getClass().getSimpleName(), getModel(), getMake(), getCarbonFootprint(), getDistanceTravelled());
    }

}
