package src;

public class ShoppingCart {

    // Calculate total price with discounts
    public static double calculateTotal(double[] prices, String customerType) {
        double total = 0;
        // First, calculate sum of all prices using a loop
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        switch (customerType){
            case "REGULAR":
                // No discount
                return total;
            case "PREMIUM":
                // 10 percent discount
                return total - (total * 0.1);
            case "VIP":
               // 20 percent discount
                return total - (total * 0.2);
            default:
                System.out.println("Invalid Customer type");
                return 0;
        }

    }
    // Find most expensive item
    public static double findMostExpensive(double[] prices) {

        double highestPrice = 0.0;
        // Handle empty array
        for ( int i =0 ; i < prices.length; i++){
            if( prices[i]> highestPrice){
                highestPrice = prices[i];
            }
        }
        return highestPrice;
    }
    // Count items above a certain price
    public static int countExpensiveItems(double[] prices, double threshold)
    {
        int countItems = 0;
        for ( int i =0 ; i < prices.length; i++){
            if( prices[i] > threshold){
               countItems++;
            }
        }
        return  countItems;

    }
    public static void main(String[] args) {
        double[] cart = {25.99, 45.50, 12.99, 89.99, 15.75};
        // Test with different customer types

        // Test with different customer types
        System.out.println("Regular customer total: $" + calculateTotal(cart,
                "REGULAR"));
        System.out.println("Premium customer total: $" + calculateTotal(cart,
                "PREMIUM"));
        System.out.println("VIP customer total: $" + calculateTotal(cart,
                "VIP"));

        // Find most expensive item
        System.out.println("Most Expensive item :" +findMostExpensive(cart));

        // Count items over $30
        System.out.println("Items over $30 :" + countExpensiveItems(cart,30));
    }
}
