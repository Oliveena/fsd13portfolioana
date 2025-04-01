/**
 * This program calculates the CarbonFootprint.
 *
 * @author: Anasstassia Tarassova
 * @version: 1.0
 * @since 2024-11-13
 *
 * @see CarbonFootprint.Vehicle
 * @see CarbonFootprint.Car;
 * @see CarbonFootprint.Truck;
 * @see CarbonFootprint.Bicycle;
 * @see CarbonFootprint.Building;
 * @see CarbonFootprint.Diet;
 * */

package CarbonFootprint;

public interface CarbonFootprint {

    /**
     * Calculate the carbon footprint for the implementing (concrete) class.
     * This method should return the carbon footprint t for the specific object
     * that implements this interface
     * @return the carbon footprint
     */
    public double getCarbonFootprint();

}
