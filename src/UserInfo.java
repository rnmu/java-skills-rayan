package src;
public class UserInfo {
    private String name;
    private int age;
    private String email;
    private boolean isActive;

    // Constructor
    public UserInfo(String name, int age , String email, boolean isActive) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.isActive= isActive;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public boolean getIsActive() {
        return isActive;
    }

    public void displayInfo(){
        System.out.println("User details");
        System.out.println("Name:   " + name);
        System.out.println("Age:    " + age);
        System.out.println("Email:   " + email);
        System.out.println("isActive:  " + isActive);
    }


}
