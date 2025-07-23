package src;
import java.util.Arrays;
public class PayrollCalculator {

// Method to calculate weekly pay based on employee type and hours
public static double calculateWeeklyPay(String employeeType, double
        hoursWorked, double hourlyRate) {
    double overtime;

    switch (employeeType) {
        case "FULL_TIME":
            //System.out.println(" Regular pay for 40 hours, overtime (1.5x) for hours  40");
            if (hoursWorked > 40) {
                overtime = hoursWorked - 40;
                return (40 * hourlyRate) + (overtime * 1.5 * hourlyRate);
            }else{
                return hourlyRate * hoursWorked;
            }
        case "PART_TIME":
            if (hoursWorked > 25) {
                //System.out.println("Regular pay, no overtime, max 25 hours");
                return (25 * hourlyRate);
            }else{
                return hourlyRate * hoursWorked;
            }
        case "CONTRACTOR":
            //System.out.println("Flat rate, no overtime rules");
            return hourlyRate * hoursWorked;

        case "INTERN":
            //System.out.println("20% discount from hourly rate, max 20 hours");
            if (hoursWorked > 20) {
                hoursWorked= 20;
            }
            hourlyRate -= (hourlyRate * 0.2); // 20 percent discount
            return hourlyRate * hoursWorked;

        default:
            //System.out.println("Invalid employee type");
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
    // Method to process multiple employees and find statistics
    public static void processPayroll(String[] employeeTypes, double[] hours,
                                      double[] rates, String[] names) {
        //Calculate pay for each employee
        int sizeOfArray = names.length;
        double[] pay;
        pay = new double[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            pay[i] = calculateWeeklyPay(employeeTypes[i], hours[i], rates[i]);
        }

        //Find: highest paid employee, lowest paid employee, average pay
        double lowestPaid = pay[0];
        int indexLowest =0;
        double highestPaid = pay[0];
        int indexHighest=0;
        double sumofpay = 0;
        for (int i = 0; i < pay.length; i++) {
            if (pay[i] < lowestPaid) {
                lowestPaid = pay[i];
                indexLowest = i;
            }
            if (pay[i] > highestPaid) {
                highestPaid = pay[i];
                indexHighest = i;
            }
            sumofpay += pay[i];
        }
        double averagePay = sumofpay / (sizeOfArray);

        // Count how many employees worked overtime (>40 hours)
        int count = 0;
        for (double i : hours) {
            if (i > 40) {
                count += 1;
            }
        }

        // Display results in a formatted table
        System.out.printf("%-15s %-15s %-15s %-15s %s %n", "Name", "employeeTypes", "hours", "rates", "pay");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.printf("%-15s %-15s %-15s %-15s %s %n", names[i], employeeTypes[i], hours[i], rates[i], pay[i]);
        }
        System.out.println("Lowest paid employee : " + names[indexLowest]+ " , " + lowestPaid);
        System.out.println("Highest paid employee : "  + names[indexHighest]+ " , "+ highestPaid);
        System.out.println("Average pay : " + averagePay);
        System.out.println("Number of employees  who worked overtime : " + count);

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
        System.out.println("calculateWeeklyPay test:");
        double rate = calculateWeeklyPay("CONTRACTOR", 40,5);
        System.out.println("weekly pay: "+ rate);

        // Test tex deduction
        System.out.println("calculateTaxDeduction test:");
        double taxDeduction = calculateTaxDeduction(501,false);
        System.out.println("tax reduction: " + taxDeduction);

        // process the entire payroll
        System.out.println("Payroll:");
        processPayroll(types,hours,rates,names);

    }

}
