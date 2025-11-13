package main.Lambok;

public class User_Without_Lambok_Test {
    public static void main(String[] args) {
        User_Without_Lambok user1 = new User_Without_Lambok("Test1", "001", "Male");
//        Printing user Details:
        System.out.println(user1);
//        Updating User Details:
        user1.setGender("Female");
        user1.setId("002");
        user1.setName("Test2");
//        Fetching User Details:
        System.out.println("Name : "+user1.getName());
        System.out.println("Id : "+user1.getId());
        System.out.println("Gender : "+user1.getGender());
    }
}
