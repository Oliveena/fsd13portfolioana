/**
 * Child class of Vehicle parent class.
 * Implements CarbonFootprint interface.
 *
 * @see CarbonFootprint.CarbonFootprint
 * @see CarbonFootprint.Vehicle
 * @throws IllegalArgumentException if type of bicycle is null
 */
package CarbonFootprint;

public class Bicycle extends Vehicle {
    /**
     * the only new field I decided to associate with Bicycle class
     */
    String typeOfBicycle;

    /**
     * parametrized constructor for the Bicycle class
     * @param model
     * @param make
     * @param amountOfWheels
     * @param typeOfBicycle
     * @param fuelConsumption
     * @param distanceTravelled
     */
    public Bicycle(String model, String make, int amountOfWheels, String typeOfBicycle, double fuelConsumption, double distanceTravelled) {
        super(model, make, amountOfWheels, fuelConsumption, distanceTravelled);
        this.typeOfBicycle = typeOfBicycle;
    }

    /**
     * getter for type of Bicycle
     * @return typeOfBicycle
     */
    public String getTypeOfBicycle() {
        return typeOfBicycle;
    }

    /**
     *
     * @param typeOfBicycle
     * @throws IllegalArgumentException if type of bicycle is null
     */
    public void setTypeOfBicycle(String typeOfBicycle) {
        try {
            if (typeOfBicycle == null) {
                throw new IllegalArgumentException("Please state the type of bicycle: urban, BMX, competitive, ...");
            }
            this.typeOfBicycle = typeOfBicycle;
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }

    // a bicycle consumes 0 fuel
    @Override
    public double getFuelConsumption() {
        return 0;
    }

    /**
     * overriding the interface method for getting the carbon footprint.
     * Mathematically, we perform:
     * distanceTraveled (km) * getFuelConsumption (L/km) * 2.3 kgCO2/L
     * Answer will be in units of kgCO2
     *
     * @return
     */
    @Override
    public double getCarbonFootprint() {
        return Math.round(getDistanceTravelled() * getFuelConsumption() * 0);
    }

    @Override
    public String toString() {
        return String.format("%s : The %s %s generated %s kg CO2 after driving %s kilometers. \n", getClass().getSimpleName(), getModel(), getMake(), getCarbonFootprint(), getDistanceTravelled());
    }
}
