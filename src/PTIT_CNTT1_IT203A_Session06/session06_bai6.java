package PTIT_CNTT1_IT203A_Session06;

public class session06_bai6 {
    public static void main(String[] args) {
        User user1 = new User("001", "user 1", "123456", "user1@gmail.com");
        user1.userInfo();
        System.out.println(" ");

        User user2 = new User("002", "user 2", "abcdef", "u2");
        user2.userInfo();
        System.out.println(" ");

        User user3 = new User("003", "user 3", "", "user3@mail.com");
        user3.userInfo();
        System.out.println(" ");

        //Test setter password/email sai
        user1.setPassword("");
        user1.setEmail("test");
        user1.userInfo();
    }
}
