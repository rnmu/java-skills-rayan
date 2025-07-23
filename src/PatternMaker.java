package src;

public class PatternMaker {
    // Print a number triangle
    public static void printNumberTriangle(int rows) {
        for(int i = 1 ; i<= rows ;i++) {
            for (int j = 1 ; j<=i ;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    // Print multiplication table
    public static void printMultiplicationTable(int number, int limit) {
            for(int i = 1 ; i<= limit ;i++) {
                    System.out.println(number + " x "  + i + " = "+  (i * number));
            }

    }
    public static void main(String[] args) {
        printNumberTriangle(4);
        System.out.println();
        printMultiplicationTable(7, 10);
    }
}

