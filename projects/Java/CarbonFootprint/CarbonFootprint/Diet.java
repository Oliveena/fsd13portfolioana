/**
 * Diet class implements the interface CarbonFootprint.
 * It is unrelated to vehicles or buildings.
 * If there was more time for this assignment, subclasses for specific diets could have been created:
 * e.g. Proletarian, Omnivore, Vegetarian, Vegan, Dairy-Free, etc.
 * Potential data members for subclasses could have been amount of daily meals (1, 2, 3...), provenance of food
 * (locally sourced or imported), utilisation of food banks, etc.
 *
 * For the moment, let's keep this class as simple as possible.
 *
 *
 */

package CarbonFootprint;

public class Diet implements CarbonFootprint {

    /**
     * fields (data members) for VDiet class
     */
    private Boolean meatConsumption;
    private Boolean dairyConsumption;
    // again, these could be divided into types of meat (lamb, beef, pork, poultry,...) and 
    // types of dairy consumed. Let's keep it simple for today.
    private double energyConsumption;
    // there's probably a better, more "SOLID" way than reusing the parameter from Building class...it's 10pm, I'll think about it tomorrow

    /**
     * parametrized constructor for Vehicle class
     * @param meatConsumption if the diet contains meat
     * @param dairyConsumption if the diet contains dairy
     */
    public Diet(Boolean meatConsumption, Boolean dairyConsumption) {
        this.meatConsumption = meatConsumption;
        this.dairyConsumption = dairyConsumption;
        this.energyConsumption = energyConsumption;
    }

    /**
     * getter for a meat-based diet
     * it increases (somewhat) the energy consumption
     * @return meatConsumption
     */
    // increase consumption if has pool
    public Boolean getMeatConsumption() {
        return meatConsumption;
    }

    /**
     * setter for a meat-based diet
     * @param meatConsumption determines a meat-based diet
     */
    public void setMeatConsumption(Boolean meatConsumption) {
        try {
            if (meatConsumption) {
                this.meatConsumption = meatConsumption;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * getter for a dairy-based diet
     * it increases (slightly) the energy consumption
     * @return dairyConsumption
     */
    public Boolean getDairyConsumption() {
        return dairyConsumption;
    }

    /**
     * setter for presence of a pool in a building
     * @param dairyConsumption determines if a building has a pool
     */
    public void setDairyConsumption(Boolean dairyConsumption) {
        try {
            if (dairyConsumption) {
                this.dairyConsumption = dairyConsumption;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * getter for the energy consumption to grow the foods of a certain diet
     * @return energyConsumption
     */
    public double getEnergyConsumption() {
        return energyConsumption;
    }

    /**
     * setter for the energy consumption to grow the foods of a certain diet
     * @param energyConsumption  the energy consumption to grow the foods of a certain diet
     */
    public void setEnergyConsumption(double energyConsumption) {
        energyConsumption = 10;
        // I'd normally link it with the SUM of energy consumption in other classes of this package.
        // 10 is a convenient number.
        try {
            if (meatConsumption) {
                energyConsumption *= 1.4;
            } else if (dairyConsumption) {
                energyConsumption *= 1.2;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * implementing the getCarbonFootprint() for the interface CarbonFootprint
     *
     * @return carbon foot print
     */
    @Override
    public double getCarbonFootprint() {
        return energyConsumption;
    }

    /**
     * return String representation of Vehicle object
     * @return toString
     */
    @Override
    public String toString() {
        return String.format("%s: A diet that has a %s consumption of meat and a %s consumption of dairy generates %s kg of C02 per X period of time.\n",
                getClass().getSimpleName(), getMeatConsumption(), getDairyConsumption(), getCarbonFootprint());
    }

}
