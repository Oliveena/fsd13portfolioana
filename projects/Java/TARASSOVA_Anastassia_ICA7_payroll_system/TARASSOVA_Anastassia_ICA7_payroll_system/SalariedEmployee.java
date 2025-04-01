/**
 * This is a subclass of Employee class.
 * @throws IllegalArgumentException if price is less than 0
 */
package payroll_system;

public class SalariedEmployee extends Employee {
    // data members weeklySalary
    private double weeklySalary;


    /**
     * parametrized constructor for SalariedEmployee Objects
     *
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     * @param weeklySalary
     */
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        // check if weeklySalary is a positive value
        this.weeklySalary = weeklySalary;
    }

    /**
     * @param weeklySalary
     * @throws IllegalArgumentException if price is less than 0
     */
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary <= 0) {
            throw new IllegalArgumentException("Weekly salary cannot be negative");
        }
        this.weeklySalary = weeklySalary;
    }

    /**
     * return the weekly salary
     *
     * @return weeklySalary
     */
    public double getWeeklySalary() {
        return weeklySalary;
    }

    /**
     * calculate earnings: override the abstract method in the abstract class Employee
     *
     * @return getEarnings
     */
    @Override
    public double getEarnings() {
        return getWeeklySalary();
    }

    /**
     * implement the method getPaymentAmount
     *
     * @return getWeeklySalary
     */
    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

    /**
     * return string representation of the salariedEmployee object
     *
     * @return toString
     */
    @Override
    public String toString() {
        return String.format("Salaried Employees: %s %n %s: $%.2f", super.toString(),
                "Weekly salary", getWeeklySalary());
    }
}
