/**
 * This is a subclass of Employee class.
 * @see Employee
 */

package payroll_system;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    // declare a data member
    private double baseSalary;  // base salary per week

    // constructor with parameters
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        // call setBaseSalary
        setBaseSalary(baseSalary);
    } // end constructor

    // set base salary
    public void setBaseSalary(double baseSalary) {
        // validate base salary
        if (baseSalary < 500.00) {
            throw new IllegalArgumentException("Base salary must be greater than 500.00");
        }
        this.baseSalary = baseSalary;
    } // end method setBaseSalary

    // return base salary
    public double getBaseSalary() {
        return this.baseSalary;
    }

    // calculate earnings for the base plus commission employee
    @Override
    public double getEarnings() {
        return super.getEarnings() + getBaseSalary();
    } // end method getEarnings

    // return string representation of BasePlusCommissionEmployee object
    @Override
    public String toString() {
        return String.format("%s %n %s; %n %s: $%,.2f", "Base Plus Commission",
                super.toString(),
                "Base Salary", getBaseSalary());
    } // end method toString
}
