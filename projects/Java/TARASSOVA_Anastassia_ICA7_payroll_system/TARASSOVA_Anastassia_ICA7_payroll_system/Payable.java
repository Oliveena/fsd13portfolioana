package payroll_system;

/**
 * The Payable interface defines a contract for objects that can be paid.
 * Classes that implement this interface must provide an implementation of the
 * 'getPaymentAmount' method, which calculates the payment amount.
 */
public interface Payable {

    /**
     * Calculate the payment amount for the implementing (concrete) class.
     * This method should return the payment amount for the specific object
     * that implements this interface
     *
     * @return the payment amount for the object
     */
    public double getPaymentAmount(); // no implementation
}
