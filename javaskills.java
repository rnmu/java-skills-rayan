public class javaskills {

    public static void main( String [] args){

        // 3 different variables

        UserInfo user1 = new UserInfo("Rayan",22,"abc@gmail.com",true);
        UserInfo user2 = new UserInfo("Noor",20,"mb3@gmail.com",false);
        UserInfo user3 = new UserInfo("Ahmed",15,"ah23@gmail.com",true);

//      //Displays user information
        System.out.println("Displays User information:  ");
        System.out.println("User 1 : ");
        user1.displayInfo();
        System.out.println("User 2 : ");
        user2.displayInfo();
        System.out.println("User 3 : ");
        user3.displayInfo();

        //Test get and set
        System.out.println(user1.getAge());

        //





    }
}
