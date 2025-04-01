package MedicalClinicSystem;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import static MedicalClinicSystem.MainA.scanner;

    public class Date {
         /// declaring fields of Date
        private LocalDate dateOfBirth;
        private LocalDate startDate;
        // optional:  private LocalDate endDate; for when a doctor or receptionist leaves the clinic
        private int yearsOfExperience;
        private LocalDate appointmentDate;
        private LocalDate startOfTreatment;
        private LocalDate endOfTreatment;
        // to eliminate those below


        /// non-parametrized constructor
        public Date(){
        }

        /// parametrized constructor for fields of Date
        public Date(LocalDate dateOfBirth, LocalDate startDate, int yearsOfExperience, LocalDate appointmentDate, LocalDate startOfTreatment, LocalDate endOfTreatment,  int day, int month, int year) {
            this.dateOfBirth = dateOfBirth;
            this.startDate = startDate;
            this.yearsOfExperience = yearsOfExperience;
            this.appointmentDate = appointmentDate;
            this.startOfTreatment = startOfTreatment;
            this.endOfTreatment = endOfTreatment;

        }

        /// method for displaying month options
        public void displayMonth(){
            System.out.println("""
                \t1 -> January 31
                \t2 -> February 28
                \t3 -> March 31
                \t4 -> April 30
                \t5 -> May 31
                \t6 -> June 30
                \t7 -> July 31
                \t8 -> August 31
                \t9 -> September 30
                \t10 -> October 31
                \t11 -> November 30
                \t12 -> December 31
                """);
        }

        /// setter for date of birth (split into Day, Month and Year)
        public void setDate() {
            int age, day, month, year;
            boolean validDay = false;
            System.out.println("Enter your Year of Birth: ");
            year = scanner.nextInt();
            while(year < 1900 || year > 2024){
                System.out.println("Enter values between 1900 and 2024");
                year = scanner.nextInt();
            }
            displayMonth();
            System.out.println("Enter your Month of Birth (1-12 ): ");
            month = scanner.nextInt();
            while (month < 1 || month > 12){
                System.out.println("Enter values between 1 and 12");
                month = scanner.nextInt();
            }
            System.out.println("Enter your Day of birth: ");
            day = scanner.nextInt();
            while (!validDay){
                switch(month){
                    case 1, 3, 5, 7, 8, 10, 12:
                        while(day <= 0 || day > 31) {
                            System.out.println(Month.of(month) + " has 31 days.");
                            System.out.println("Input value between 1 and 31 only: ");
                            day = scanner.nextInt();
                        }
                        validDay = true;
                        break;

                    case 4, 6, 9, 11:
                        while(day <= 0 || day > 30) {
                            System.out.println(Month.of(month) + " has 30 days.");
                            System.out.println("Input value between 1 and 30 only: ");
                            day = scanner.nextInt();
                        }
                        validDay = true;
                        break;

                    case 2:
                        while(day <= 0 || day > 28) {
                            System.out.println(Month.of(month) + " has 28 days.");
                            System.out.println("Input value between 1 and 28 only: ");
                            day = scanner.nextInt();
                        }
                        validDay = true;
                        break;
                } // switch
            } // loop
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        /*
        /// getter method for Year
        //public int getYear(){
            return year;
        }

        /// getter method for Month
        //public int getMonth(){
            return month;
        }

        /// getter method for Day
        public int getDay(){
            return day;
        }*/

        /// method for calculating age, where (age) = (current date) - (dateOfBirth)
        public int calculateAge() {
            // tutorial found here
            // https://www.geeksforgeeks.org/how-to-calculate-age-from-a-birthdate-using-java-date-time/

            // get a date of birth from values above
 //       LocalDate dateOfBirth = LocalDate.of(this.year, this.month, this.day);

            // get today's date
//        LocalDate currentDate = LocalDate.now();

            // calculating time elapsed between dateOfBirth and today
            Period period = Period.between(LocalDate.now(), this.dateOfBirth);
            // removing the negative from the number
            return Math.abs(period.getYears());
        }

        /// getter for age (in years)


        /// getter for the entire dateOfBirth date
        public String getdateOfBirth() {
            return dateOfBirth.toString();
        }

        /// method to print out the dateOfBirth as specific elements of year, month, day as a String


        /// setter for an Employee`s start date at the clinic
        public void setStartDate(LocalDate startDate) {
            this.startDate = startDate;
        }

        /// getter for an Employee`s start date at the clinic
        public LocalDate getStartDate() {
            return startDate;
        }

        /// setter for years of experience of an employee at the clinic
        private int setYearsOfExperience() {
            Period period = Period.between(LocalDate.now(), this.startDate);
            return Math.abs(period.getYears());
        }

        /// getter for years of experience of an employee at the clinic
        public int getYearsOfExperience() {
            return yearsOfExperience;
        }

        /// getter for the appointment date
        public LocalDate getAppointmentDate() {
            return appointmentDate;
        }

        /// setter for the appointment date
        public void setAppointmentDate(LocalDate appointmentDate) {
            this.appointmentDate = appointmentDate;
        }

        /// setter for the treatment start date
        public void setStartOfTreatment(LocalDate startOfTreatment) {
            this.startOfTreatment = startOfTreatment;
        }

        /// getter for the treatment start date
        public LocalDate getStartOfTreatment() {
            return startOfTreatment;
        }

        /// setter for the treatment end date
        // tutorial: https://stackoverflow.com/questions/37161525/checking-if-difference-between-two-dates-in-greater-than-a-year-java
        // tutorial: https://www.geeksforgeeks.org/period-isnegative-method-in-java-with-examples/
        public void setEndOfTreatment(LocalDate endOfTreatment) {
            Period durationOfTreatment= Period.between(this.startOfTreatment, LocalDate.now());
            if (durationOfTreatment.isNegative()) {
                System.out.println("End of prescription cannot come before the start of prescription! Please try again. ");
            }
            else if (LocalDate.now().isAfter(startOfTreatment.plusYears(1))) {
                System.out.println("Warning! Void prescription. A prescription can be valid for a maximum of a year.\n Please schedule an appointment with the treating physician for a  prescription renewal, if necessary. ");
            } else {
                this.endOfTreatment = endOfTreatment;  // will return a date
            }
        }
        // OPTIONAL:
        // prescription validity can range from 1 day to 1 year for non-pharmacological treatments
        // and 1 day to 3 months for most pharmacological treatments
        // reevaluation recommended and re-prescription required beyond those periods

        /// getter for the treatment end date
        public LocalDate getEndOfTreatment() {
            return endOfTreatment;
        }

    }


