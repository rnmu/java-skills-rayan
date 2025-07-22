public class PayrollCalculator {

    // Method to calculate weekly pay based on employee type and hours
    public static double calculateWeeklyPay(String employeeType, double
            hoursWorked, double hourlyRate) {

        switch (employeeType) {
            case "FULL_TIME":
                System.out.println(" Regular pay for 40 hours, overtime (1.5x) for hours  40");
                if(hoursWorked > 40){
                    hourlyRate *= 1.5;
                }
                break;
            case "PART_TIME":
                if(hoursWorked > 25){
                    System.out.println("Regular pay, no overtime, max 25 hours");
                }
                break;
            case "CONSTRACTOR":
                System.out.println("Flat rate, no overtime rules");
                break;
            case "INTERN":
                if(hourlyRate <21) {
                    System.out.println("20% discount from hourly rate, max 20 hours");
                    hourlyRate -= (hourlyRate * (20/100));
                }
                break;
            default:
                System.out.println("Invalid employee type");
        }
        return hoursWorked * hourlyRate;
    }

// to test
    public static void main(String[] args) {
        double rate = calculateWeeklyPay("PART_TIME", 30,5);
        System.out.println(rate);
    }
    
}
