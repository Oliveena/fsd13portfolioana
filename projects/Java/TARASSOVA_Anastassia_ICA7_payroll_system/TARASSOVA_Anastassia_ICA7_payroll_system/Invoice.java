package payroll_system;

/**
 * Purpose: The Invoice class represents an invoice containing billing information
 * for a single kind of part. It implements the Payable interface and calculates
 * the payment amount based on quantity and price per item.
 *
 * @author Khattar Daou
 * @version 1.0
 * @see Payable
 * @since 2024-11-11
 */
public class Invoice implements Payable {
    // data members (instance variables)
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    /**
     * Constructs an Invoice object with specified part number, part description,
     * quantity, and price per item. This constructor also validates the quantity
     * and price per item before assigning them.
     *
     * @param partNumber      the part number of the invoice
     * @param partDescription the description of the part
     * @param quantity        the quantity of the item
     * @param pricePerItem    the price per item
     */
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        // validate quantity
        setQuantity(quantity);

        // validate price
        setPricePerItem(pricePerItem);
    } // end constructor

    /**
     * Sets the quantity of the item. Throws an exception if the quantity is less than 0.
     *
     * @param quantity the quantity of the part
     * @throws IllegalArgumentException if quantity is less than 0.
     */
    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }
        this.quantity = quantity;
    } // end method setQuantity

    /**
     * Sets the price per item. Throws an exception if the price is less than or equal to 0.
     *
     * @param pricePerItem the price per item
     * @throws IllegalArgumentException if price is less than or equal to 0.
     */
    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0) {
            throw new IllegalArgumentException("Price per item must be greater than zero.");
        }
        this.pricePerItem = pricePerItem;
    } // end method setPricePerItem

    /**
     * Returns the part number of the invoice
     *
     * @return the part number
     */
    public String getPartNumber() {
        return partNumber;
    } // end method getPartNumber

    /**
     * Returns the part description of the invoice.
     *
     * @return the part description
     */
    public String getPartDescription() {
        return partDescription;
    } // end method getPartDescription


    /**
     * Returns the quantity of items on the invoice.
     *
     * @return The quantity of items on the invoice
     */
    public int getQuantity() {
        return quantity;
    } // end method getQuantity

    /**
     * Returns the price per item on the invoice.
     *
     * @return the price per item
     */
    public double getPricePerItem() {
        return this.pricePerItem;
    } // end method getPricePerItem

    // implement the method getPaymentAmount
    // method required to carry out contract with interface Payable
    @Override
    public double getPaymentAmount() {
        // to tal payment to pay the invoice
        return getQuantity() * getPricePerItem(); // total invoice amount
    }

    // return string representation of invoice object
    @Override
    public String toString() {
        return String.format("%s %n %s: %s (%s) %n %s: %d %n %s: $%,.2f",
                "Invoice", "Part Number", getPartNumber(), getPartDescription(),
                "Quantity", getQuantity(), "Price Per Item", getPricePerItem());
    }
}
