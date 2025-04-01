/**
 * This is the concrete class Car.
 * It is a subclass of Vehicle class.
 * It implements the interface CarbonFootprint.
 *
 * @see CarbonFootprint.Vehicle
 * @see CarbonFootprint.CarbonFootprint
 * @throws IllegalArgumentException if drivetrain is null
 */

package CarbonFootprint;

public class Car extends Vehicle {
    /**
     * fields (data members) specific to the Car objects.
     */
    String drivetrain;
    String engineType;

    /**
     * parametrized constructor for concrete class Car objects
     *
     * @param model
     * @param amountOfWheels
     */
    public Car(String model, int amountOfWheels, String make, String drivetrain, String engineType, double fuelConsumption, double distanceTravelled) {
        super(model, make, amountOfWheels, fuelConsumption, distanceTravelled);
        this.drivetrain = drivetrain;
        this.engineType = engineType;
    }

    // override superclass methods to return proper results

    /**
     * getter for String drivetrain
     * @return
     */
    public String getDrivetrain() {
        return drivetrain;
    }

    /**
     * setter for String drivetrain
     * @param drivetrain
     * @throws IllegalArgumentException if drivetrain is null
     */
    public void setDrivetrain(String drivetrain) {
        if (drivetrain == null) {
            throw new IllegalArgumentException("Drivetrain cannot be null. Suggestions are: AWD, FWD, RWD, 4WD.");
        }
        this.drivetrain = drivetrain;
    }

    /**
     * getter for getEngineType()
     * @return
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * setter for a Car's engine type
     * @param engineType what fuel type does a building use
     * @throws IllegalArgumentException if fuel type is null
     */
    public void setEngineType(String engineType) {
        System.out.println("Please select the type of engine used by your car: gas, diesel, electric or hybrid.");
        try {
            if (engineType == null) {
                throw new IllegalArgumentException("Engine type cannot be null");
            } else if (engineType.equals("gas")) {
                this.engineType = engineType;
            } else if (engineType.equals("diesel")) {
                this.engineType = engineType;
            } else if (engineType.equals("electric")) {
                this.engineType = engineType;
            } else if (engineType.equals("hybrid")) {
                this.engineType = engineType;
            } else {
                System.out.println("Invalid engine type. Please choose between: gas, diesel, electric or hybrid.");
            }
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * overriding the interface method for getting the carbon footprint.
     * Mathematically, we perform:
     * distanceTraveled (km) * getFuelConsumption (L/km) * 2.3 kgCO2/L
     * Answer will be in units of kgCO2
     *
     * I added different multiplications of carbon footprint, according to the car engine type.
     * Not the most elegant method, I could have used a switch case, or probably even something better.
     *
     * @return carbonFootprint
     */
    @Override
    public double getCarbonFootprint() {
        try {
            if (engineType.equals("gas")) {
                return Math.round(getDistanceTravelled() * getFuelConsumption() * 2.3 * 1.2);
            } else if (engineType.equals("diesel")) {
                return Math.round(getDistanceTravelled() * getFuelConsumption() * 2.3 * 1.6);
            } else if (engineType.equals("electric")) {
                return Math.round(getDistanceTravelled() * getFuelConsumption() * 2.3 * 0.4);
            } else if (engineType.equals("hybrid")) {
                return Math.round(getDistanceTravelled() * getFuelConsumption() * 2.3 * 0.8);
            } else {
                throw new RuntimeException("Oops! Something went wrong. Please restart the program.");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return String.format("%s : The %s %s generated %s kg CO2 after driving %s kilometers. \n", getClass().getSimpleName(), getModel(), getMake(), getCarbonFootprint(), getDistanceTravelled());
    }

}
