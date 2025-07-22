public class PayrollCalculator {

// Method to calculate weekly pay based on employee type and hours
public static double calculateWeeklyPay(String employeeType, double
        hoursWorked, double hourlyRate) {
    double overtime;

    switch (employeeType) {
        case "FULL_TIME":
            System.out.println(" Regular pay for 40 hours, overtime (1.5x) for hours  40");
            if (hoursWorked > 40) {
                overtime = hoursWorked - 40;
                return (40 * hourlyRate) + (overtime * 1.5 * hourlyRate);
            }else{
                return hourlyRate * hoursWorked;
            }
        case "PART_TIME":
            if (hoursWorked > 25) {
                System.out.println("Regular pay, no overtime, max 25 hours");
                return (25 * hourlyRate);
            }else{
                return hourlyRate * hoursWorked;
            }
        case "CONTRACTOR":
            System.out.println("Flat rate, no overtime rules");
            return hourlyRate * hoursWorked;

        case "INTERN":
            System.out.println("20% discount from hourly rate, max 20 hours");
            if (hoursWorked > 20) {
                hoursWorked= 20;
            }
            hourlyRate -= (hourlyRate * 0.2); // 20 percent discount
            return hourlyRate * hoursWorked;

        default:
            System.out.println("Invalid employee type");
            return 0;
    }
}

    // Method to calculate tax deduction based on pay brackets
    public static double calculateTaxDeduction(double grossPay, boolean
            hasHealthInsurance) {
        double tax;
        double amount;
        if (grossPay >= 0 && grossPay <= 500) {
            System.out.println("$0-500: 10% tax");
            tax = 0.1;
        } else if (grossPay <= 1000) {
            System.out.println("$501-1000: 15% tax");
            tax = 0.15;
        } else if (grossPay <= 2000) {
            System.out.println("$1001-2000: 20% tax");
            tax = 0.2;
        } else {
            System.out.println("$Above $2000: 25% tax");
            tax = 0.25;
        }
        amount = grossPay * tax;

        // If hasHealthInsurance is true, reduce tax by $50
        if (hasHealthInsurance) {
            amount -= 50;
        }
        // Return total tax amount
        return  amount;
    }


// to test
    public static void main(String[] args) {
        //Test data:
        String[] types = {"FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN",
                "FULL_TIME"};
        double[] hours = {45, 20, 35, 15, 50};
        double[] rates = {25.0, 18.0, 40.0, 12.0, 30.0};
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};

        // Test weekly pay 
        double rate = calculateWeeklyPay("CONTRACTOR", 40,5);
        System.out.println("weekly pay: "+ rate);

        
        double taxDeduction = calculateTaxDeduction(501,false);
        System.out.println("tax reduction: " + taxDeduction);

    }

}
