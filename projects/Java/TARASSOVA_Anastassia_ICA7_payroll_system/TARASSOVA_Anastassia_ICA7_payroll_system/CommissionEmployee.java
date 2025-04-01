/**
 * This is a subclass of Employee class.
 * @see Employee
 * @param commissionRate
 * @throws IllegalArgumentException if commission rate is less than 0 or more than 1
 * @param grossSales
 * @throws IllegalArgumentException if gross sales are less than 5000.00
 */

package payroll_system;

public class CommissionEmployee extends Employee {

    // add specific data members
    private double grossSales;  // double weekly sales
    private double commissionRate;

    /**
     * parametrized constructor for Commission Employee class
     * @param firstName returns first name
     * @param lastName returns last name
     * @param socialSecurityNumber returns SSN
     * @param grossSales returns gross sales by the employee
     * @param commissionRate return commission rate for an employee
     */
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        // call method setCommissionRate
        setCommissionRate(commissionRate);

        // call method setGrossSales
        setGrossSales(grossSales);
    } // end constructor

    /**
     * setter for the commission rate
     * @param commissionRate
     * @throws IllegalArgumentException if commission rate is less than 0 or more than 1
     */
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be between 0 and 1.");
        }
        this.commissionRate = commissionRate;
    } // end method setCommissionRate

    // set the gross sales amount

    /**
     * setter for gross sales of an employee
     * @param grossSales
     * @throws IllegalArgumentException if gross sales are less than 5000.00
     */
    public void setGrossSales(double grossSales) {
        // validate gross sales
        if (grossSales <= 5000.00) {
            throw new IllegalArgumentException("Gross Sales must be greater than or equal to 5000.00");
        }
        this.grossSales = grossSales;
    } // end method setGrossSales

    // get the gross sales amount

    /**
     * getter for gross sales of an Employee
     * @return gross sales
     */
    public double getGrossSales() {
        return this.grossSales;
    }

    // get the commission rage

    /**
     * getter for commission rate
     * @return commission rate
     */
    public double getCommissionRate() {
        return this.commissionRate;
    }

    // calculate earnings - override the abstract method getEarnings in class Employee

    /**
     * overriding the superclass method getEarnings()
     *
     * @return earnings of the worker
     */
    @Override
    public double getEarnings() {
        return getGrossSales() * getCommissionRate();
    }

    // return string representation of CommissionEmployee object
    /**
     * overriding the toString() method to print out the employee details to the console
     *
     * @return employee details to console
     */
    @Override
    public String toString() {
        return String.format("%s: %s %n %s: $%,.2f; %n %s: %.2f", "Commission Employee",
                super.toString(),
                "Gross Sales ", getGrossSales(),
                "Commission Rate", getCommissionRate());
    }

}
