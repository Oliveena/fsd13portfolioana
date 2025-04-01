/**
 * The class Building for creating building-type Objects.
 *  Unrelated to Vehicle class and its subclasses.
 *  Implements CarbonFootprint interface.
 *
 * @see CarbonFootprint.CarbonFootprint
 * @throws IllegalArgumentException if square footage is null
 * @throws IllegalArgumentException if square footage is weird in any way
 * @throws IllegalArgumentException if fuel type is null
 */

package CarbonFootprint;

public class Building implements CarbonFootprint {

    /**
     * fields for Building clas
     */
    Boolean hasOutdoorPool;
    Boolean hasAirConditioning;
    String fuelType;
    double squareFootage;
    double energyConsumption;

    /**
     * parameterized constructor for Building class
     * I assume all buildings to be residential for simplicity's sake
     * @param hasOutdoorPool
     * @param hasAirConditioning
     * @param fuelType
     * @param squareFootage
     * @param energyConsumption
     */
    public Building(Boolean hasOutdoorPool, Boolean hasAirConditioning, String fuelType, double squareFootage, double energyConsumption) {
        this.hasOutdoorPool = hasOutdoorPool;
        this.hasAirConditioning = hasAirConditioning;
        this.fuelType = fuelType;
        this.squareFootage = squareFootage;
        this.energyConsumption = energyConsumption;
    }

    /**
     * getter for presence of a pool in a building
     * it increases the energy consumption
     * @return hasOutdoorPool
     */
    // increase consumption if has pool
    public Boolean getHasOutdoorPool() {
        if (hasOutdoorPool) {
            energyConsumption *= 1.2;
        }
        return hasOutdoorPool;
    }

    /**
     * setter for presence of a pool in a building
     * @param hasOutdoorPool determines if a building has a pool
     */
    public void setHasOutdoorPool(Boolean hasOutdoorPool) {
        this.hasOutdoorPool = hasOutdoorPool;
    }

    /**
     * getter for presence of an AC in a building
     * @return hasAirConditioning
     */
    // increase consumption if has AC
    public Boolean getHasAirConditioning() {
        if (hasAirConditioning) {
            energyConsumption *= 1.1;
        }
        return hasAirConditioning;
    }

    /**
     * setter for presence of an AC in a building
     * @param hasAirConditioning determines if a building has an AC
     */
    public void setHasAirConditioning(Boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    /**
     * getter for type of fuel used for heating a building
     * @return fuelType
     */
    // allowed fuel types: propane, diesel, electric, geothermic, solar
    public String getFuelType() {
        return fuelType;
    }

    /**
     * setter for type of fuel used for heating a building
     * @param fuelType what fuel type does a building use
     * @throws IllegalArgumentException if fuel type is null
     */
    public void setFuelType(String fuelType) {
        System.out.println("Please select the type of fuel used by your building: propane, diesel, electric, geothermic or solar.");
        try {
            if (fuelType == null) {
                throw new IllegalArgumentException("fuelType cannot be null");
            } else if (fuelType.equals("propane")) {
                energyConsumption *= 1.2;
            } else if (fuelType.equals("diesel")) {
                energyConsumption *= 1.7;
            } else if (fuelType.equals("electric")) {
                energyConsumption *= 0.3;
            } else if (fuelType.equals("geothermic")) {
                energyConsumption *= 0.2;}
             else if (fuelType.equals("solar")) {
                 energyConsumption *= 0.9;
            } else {
                System.out.println("Invalid fuel type. We'll just pretend it doesn't impact your energy consumption.");
            }
            this.fuelType = fuelType;
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * getter for square footage
     * @return squareFootage
     * @throws IllegalArgumentException if square footage is null
     * @throws IllegalArgumentException if square footage is weird in any way
     */
    // energy consumption proportionate to square footage
    public double getSquareFootage() {
        try {
            if (squareFootage <= 0.0) {
                throw new IllegalArgumentException("Square footage of a building cannot be null.");
            } else if (squareFootage <= 100) {
                energyConsumption *= 1.2;
            } else if (squareFootage <= 500) {
                energyConsumption *= 1.4;
            } else if (squareFootage <= 1000) {
                energyConsumption *= 1.6;
            } else if (squareFootage <= 1500) {
                energyConsumption *= 1.8;
            } else if (squareFootage > 1500) {
                energyConsumption *= 2.0;
            } else {
                throw new IllegalArgumentException("Please enter appropriate square footage of your dwelling. ");
            }
            return squareFootage;
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * setter for square footage
     * @param squareFootage of a building
     */
    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    /**
     * getter for energy consumption of a dwelling
     * @return energy consumption of a dwelling over X period of time
     */
    public double getEnergyConsumption() {
        return energyConsumption;
    }

    /**
     * setter for the setEnergyConsumption method
     * @param energyConsumption of a dwelling over X period of time
     */
    public void setEnergyConsumption(double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    /**
     * Overriding the getCarbonFootprint() method of the interface
     * I estimate that per units of energy consumed by a house over X period of time,
     * we attribute 0.4kg CO2
     *
     * I allow the value to be negative, an energy of excess can be possible
     * e.g. tiny house, no pool, no AC, uses electric heating
     * @return carbonFootprint
     */
    @Override
    public double getCarbonFootprint() {
        return energyConsumption * 0.4;
    }

    /**
     * ToString() method to output the energy consumption onto the console
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("%s : The building with a square footage of %s and %s has \nan energy consumption of %s, generating %skg of C02 per X period of time.\n", getClass().getSimpleName(), getSquareFootage(), getFuelType(), getEnergyConsumption(), getCarbonFootprint());
    }
}
