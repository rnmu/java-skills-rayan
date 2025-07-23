package src;
public class Textbook extends Book {

    private String subject;
    private int edition;

    // Constructor that calls parent constructor
    public Textbook(String title, String author, int pages, String subject,
                    int edition) {
        super(title,author,pages);
        this.edition = edition;
        this.subject = subject;

    }
    // Override the displayInfo method
    @Override
    public void displayInfo() {
        // Call parent's displayInfo using super.displayInfo()
        super.displayInfo();
        // Then add subject and edition information
        System.out.println("Subject: " + subject);
        System.out.println("Edition: " + edition);

    }
// Add getter methods for subject and edition
public  String getSubject() {
    return subject;
}
    public  int getEdition(){
        return edition;
    }
}
