public class Library {
    // Main class to test everything
        public static void main(String[] args) {

            // Create 2 regular books
            Book book1 = new Book("C++", "liam", 100);
            Book book2 = new Book("Programming", "Omar", 40);
            // Create 1 textbook
            Textbook textbook1 = new Textbook("chapter1","liam",20,"english",4);

            // Test borrowing and returning
            System.out.println("----Borrowing C++ book:---- ");
            book1.borrowBook();
            System.out.println("---Return book: ----");
            book1.returnBook();

            // Display information for all books
            System.out.println("----Book 1 Info : ----");
            book1.displayInfo();
            System.out.println("----Book 2 Info: ----- ");
            book2.displayInfo();
            System.out.println("----Textbook 1 Info :---- ");
            textbook1.displayInfo();
        }

}
