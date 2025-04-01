/**
 * This is the Main class that performs the tests required for validation other classes.
 *
 * @author Khattar Daou
 * @version 1.2
 * @see payroll_system.BasePlusCommissionEmployee
 * @see payroll_system.CommissionEmployee
 * @see payroll_system.Employee
 * @see payroll_system.HourlyEmployee
 * @see payroll_system.Invoice
 * @see payroll_system.Payable
 * @see payroll_system.SalariedEmployee
 */

package payroll_system;

public class PayrollSystemTester {
    public static void main(String[] args) {
        /**
         * created various instances of class testers
         */
        Payable[] payables = new Payable[]{
                new Invoice("01234", "seat", 2, 375.50),
                new Invoice("56789", "tire", 4, 125.95),
                new SalariedEmployee("John", "Smith", "111-11-1111", 2500),
                new SalariedEmployee("Lisa", "Barnes", "555-55-5555", 3200),
                new CommissionEmployee("Roberta", "Swanson", "999-999-999", 6500.00, 0.05),
                new CommissionEmployee("Sandrine", "Foucault-Tilly", "888-888-888", 5800.00, 0.03),
                new BasePlusCommissionEmployee("Ivan I.", "Demidov", "777-777-777", 6250.00, 0.04, 1200),
                new BasePlusCommissionEmployee("Antoinette", "Joseph", "666-666-6666", 7300.00, 0.05, 1200),
                new HourlyEmployee("Khalil", "El Khoury", "555-555-555", 26.80, 42.00),
                new HourlyEmployee("Alicia M.", "Perez", "444-444-444", 26.80, 37.5)
        };

        System.out.println("Invoices and Employees processed polymorphically: ");
        System.out.println("=================================================");

        /**
         * iteration through the items contained in payables array
         */
        for (Payable currentPayable : payables) {
            // output currentPayable and its appropriate payment amount
            System.out.printf("%n %s %n Payement Due: $%,.2f %n",
                    currentPayable.toString(),
                    currentPayable.getPaymentAmount());
        }
    }
}
