/**
 * Vehicle abstract superclass that implements CarbonFootprint interface.
 * It is the superclass for Car, Truck and Bicycle.
 * @see CarbonFootprint.Car
 * @see CarbonFootprint.Truck
 * @see CarbonFootprint.Bicycle
 * @see CarbonFootprint.Building
 * @see CarbonFootprint.Diet
 * @param model
 * @param make
 * @param amountOfWheels
 * @param fuelConsumption
 * @param distanceTravelled
 * @throws IllegalArgumentException if model name is empty
 * @throws IllegalArgumentException if model name has more than 16 characters
 * @throws IllegalArgumentException if vehicle make is empty
 * @throws IllegalArgumentException if vehicle name is more than 16 characters
 * @throws IllegalArgumentException if amount of wheels is zero
 * @throws IllegalArgumentException if amount of wheels has more than 28 characters
 * @throws IllegalArgumentException if fuel consumption is negative
 * @throws IllegalArgumentException if distance traveled is negative
 *
 */

package CarbonFootprint;

public abstract class Vehicle implements CarbonFootprint {
    /**
     * fields (data members) for Vehicle superclass
     */
    private String model;
    private String make;
    private int amountOfWheels;
    private double fuelConsumption;
    private double distanceTravelled;
    // optional: private String: color

    /**
     * parametrized constructor for Vehicle class
     * @param model
     * @param make
     * @param amountOfWheels
     * @param fuelConsumption
     * @param distanceTravelled
     */
    public Vehicle(String model, String make, int amountOfWheels, double fuelConsumption, double distanceTravelled) {
        this.model = model;
        this.make = make;
        this.amountOfWheels = amountOfWheels;
        this.fuelConsumption = fuelConsumption;
        this.distanceTravelled = distanceTravelled;
    }

    /**
     * setter for Vehicle model
     * @param model
     * @throws IllegalArgumentException if model name is empty
     * @throws IllegalArgumentException if model name has more than 16 characters
     */
    public void setModel(String model) {
        try {
            if (model.isEmpty()) {
                throw new IllegalArgumentException("Please enter the name of the vehicle model.");
            } else if (model.length() > 16) {
                throw new IllegalArgumentException("Wow! Long model name! Please keep it under 16 characters.");
            }
            this.model = model;
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * getter for Vehicle model
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * setter for Vehicle make
     * @return make
     * @throws IllegalArgumentException if vehicle make is empty
     * @throws IllegalArgumentException if vehicle name is more than 16 characters
     */
    public String getMake() {
        try {
            if (make.isEmpty()) {
                throw new IllegalArgumentException("Please enter the make of the vehicle model.");
            } else if (make.length() > 16) {
                throw new IllegalArgumentException("Wow! Long make name! Please keep it under 16 characters.");
            }
            return make;
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * getter for Vehicle make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * setter for amount of wheels
     *
     * @param amountOfWheels describing the amount of wheels of a vehicle
     * @throws IllegalArgumentException if amount of wheels is zero
     * @throws IllegalArgumentException if amount of wheels has more than 28 characters
     */
    public void setAmountOfWheels(int amountOfWheels) {
        try {
            if (amountOfWheels == 0) {
                throw new IllegalArgumentException("Zero wheels? Tank and Snowmobile classes haven't been created yet." +
                        " Please enter the amount of wheels of your vehicle. ");
            } else if (amountOfWheels > 28) {
                throw new IllegalArgumentException("Wow! So many wheels. Please keep it under 28.");
            }
            this.amountOfWheels = amountOfWheels;
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * setter for amountOfWheel in Vehicle
     * @return amountOfWheels
     */
    public int getAmountOfWheels() {
        return amountOfWheels;
    }

    /**
     * getter for fuel consumption in Vehicle
     * @return fuelConsumption
     */
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    /**
     * setter for fuel consumption in Vehicle
     * @throws IllegalArgumentException if fuel consumption is negative
     */
    public void setFuelConsumption(double fuelConsumption) {
        try {
            if (fuelConsumption < 0) {
                throw new IllegalArgumentException("Fuel consumption cannot be negative.");
            }
            this.fuelConsumption = fuelConsumption;
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * getter for distance traveled by Vehicle
     * @return distanceTravelled
     */
    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    /**
     * setter for distance traveled by Vehicle
     * @throws IllegalArgumentException if distance traveled is negative
     */
    public void setDistanceTravelled(double distanceTravelled) {
        try {
            if (distanceTravelled < 0) {
                throw new IllegalArgumentException("Distance travelled cannot be negative.");
            }
            this.distanceTravelled = distanceTravelled;
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * return String representation of Vehicle object
     * @return toString
     */
    @Override
    public String toString() {
        return String.format("The %s %s has %s wheels. It has consumed %s liters of fuel by driving %skm. \n",
                getModel(), getMake(), getAmountOfWheels(), getFuelConsumption(), getDistanceTravelled());
    }

    /**
     * implementing the getCarbonFootprint() for the interface CarbonFootprint
     *
     * @return carbon foot print
     */
    @Override
    public double getCarbonFootprint() {
        return getCarbonFootprint();
    }

    // any other additional methods might go here

}
