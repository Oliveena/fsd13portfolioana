package payroll_system;

/**
 * This is a subclass of Employee class.
 * @throws IllegalArgumentException if hours worked are less than 0 or more than 60
 */
public class HourlyEmployee extends Employee {
    // data members (instances variables)
    private double wage;    // wage per hour
    private double hours;   // hours worked per week


    /**
     * parametrized constructor for hourly employee class
     *
     * @param firstName            returns first name of the employee
     * @param lastName             returns last name of the employee
     * @param socialSecurityNumber returns the SSN
     * @param wage                 returns the wage of the employee
     * @param hours                returns the hours worked by the employee
     * @throws IllegalArgumentException if hours worked are less than 0 or more than 60
     */
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        // validate wage
        setWage(wage);
        // validate hours
        setHours(hours);
    } // end constructor

    /**
     * set the hourly wage of hourly employee
     *
     * @param wage
     * @throws IllegalArgumentException if hourly wage is less than 15.95
     */
    public void setWage(double wage) {
        // validate wage
        if (wage < 15.95) {
            // validate wage
            throw new IllegalArgumentException("Hourly wage must be greater than or equal to 15.95");
        }
        this.wage = wage;
    }

    public double getWage() {
        return this.wage;
    }

    /**
     * setter for hours worked
     *
     * @param hours
     * @throws IllegalArgumentException if hours worked are less than 0 or more than 60
     */
    public void setHours(double hours) {
        // validate hours worked
        if ((hours < 0.0) || (hours > 60.00)) {
            throw new IllegalArgumentException("Hours worked must be greater than zero but less than 60.");
        }
        this.hours = hours;
    }

    /**
     * getter for hours worked
     *
     * @return hours
     */
    public double getHours() {
        return this.hours;
    }

    /**
     * overriding the superclass method getEarnings()
     *
     * @return earnings of the worker
     */
    @Override
    public double getEarnings() {
        if (getHours() <= 40) {
            // no overtime
            return getWage() * getHours();
        } else {
            // with overtime
            return 40 * getWage() + ((getHours() - 40) * getHours() * 1.5);
        }
    } // end method getEarnings

    // return string representation of the HourlyEmployee object

    /**
     * overriding the toString() method to print out the employee details to the console
     *
     * @return employee details to console
     */
    @Override
    public String toString() {
        return String.format("Hourly Employee: %s %n %s: $%,.2f; %n %s: %,.2f",
                super.toString(), "Hourly wage", getWage(), "Hours worked", getHours());
    } // end method toString
}
