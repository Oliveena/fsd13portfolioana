package payroll_system;

/**
 * Employee abstract superclass that implements Payable interface.
 * It has four subclasses:
 * @see CommissionEmployee
 * @see BasePlusCommissionEmployee
 * @see HourlyEmployee
 * @see SalariedEmployee
 * @throws IllegalArgumentException if first name is empty
 * @throws IllegalArgumentException if first name has more than 30 characters
 * @throws IllegalArgumentException if last name is empty
 * @throws IllegalArgumentException if last name has more than 30 characters
 *
 *
 * @author Khattar Daou
 * @version 1.1
 * @since 2024-11-08
 *
 */
public abstract class Employee implements Payable {
    // data members (fields or instance variables)
    // declare firstName, lastName, and socialSecurityNumber
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    /**
     * parametrized constructor for the superclass Employee
     *
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     */
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * getter for first name
     *
     * @return first name of employee
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * setter for first name
     *
     * @param firstName
     * @throws IllegalArgumentException if first name is empty
     * @throws IllegalArgumentException if first name has more than 30 characters
     */
    public void setFirstName(String firstName) {
        if (firstName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty");
        } else if (firstName.length() > 30) {
            throw new IllegalArgumentException("Wow! Long name! First name cannot be longer than 30 characters");
        }
        this.firstName = firstName;
    }


    /**
     * getter for employee's last name
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * setter for employee's last name
     *
     * @param lastName
     * @throws IllegalArgumentException if last name is empty
     * @throws IllegalArgumentException if last name has more than 30 characters
     */
    public void setLastName(String lastName) {
        if (lastName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty");
        } else if (lastName.length() > 30) {
            throw new IllegalArgumentException("Wow! Long name! First name cannot be longer than 30 characters");
        }
        this.lastName = lastName;
    }

    /**
     * getter for SSN
     *
     * @return social security number
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * setter for social security number
     *
     * @param socialSecurityNumber
     * @throws IllegalArgumentException if the SSN is empty
     * @throws IllegalArgumentException if the SSN is not equal to 9 characters
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        if (socialSecurityNumber.isEmpty()) {
            throw new IllegalArgumentException("A Social Security Number cannot be empty");
        } else if (socialSecurityNumber.length() != 9) {
            throw new IllegalArgumentException("A Social Security Number must have 9 characters");
        }
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * return string representation of employee object
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("%s %s %n Social Security Number: %s", getFirstName(),
                getLastName(), getSocialSecurityNumber());
    }

    /**
     * abstract method must be overridden by concrete subclass: SalariedEmployee, PartTimeEmployee
     *
     * @return earnings
     */
    public abstract double getEarnings(); // no implementation here

    /**
     * implementing method getPaymentAmount for the entire Employee
     *
     * @return payment amount
     */
    @Override
    public double getPaymentAmount() {
        return getEarnings();
    }
}
