package PTIT_CNTT1_IT203A_Session07;

public class session07_bai6 {
    public static void main(String[] args) {
        User user1 = new User(1, "dev_a", "123456");
        User user2 = new User(2, "dev_b", "234567");
        User user3 = new User(3, "dev_c", "345678");

        UserManager.addUser(user1);
        UserManager.addUser(user2);
        UserManager.addUser(user3);

        System.out.println(">> Đã thêm 3 user vào hệ thống.");
        System.out.println("Danh sách hiện tại:");

        // In danh sách user
        int index = 1;
        for (User u : UserManager.users) {
            System.out.println(index + ". " + u.toString());
            index++;
        }

        System.out.println("\n>> Kiểm tra đăng nhập:");
        boolean result1 = UserManager.checkLogin("dev_a", "123456");
        System.out.println("- Login (\"dev_a\", \"123456\"): " + (result1 ? "Thành công" : "Thất bại"));

        boolean result2 = UserManager.checkLogin("dev_b", "abc");
        System.out.println("- Login (\"dev_b\", \"abc\"): " + (result2 ? "Thành công" : "Thất bại"));

        boolean result3 = UserManager.checkLogin("dev_c", "abc");
        System.out.println("- Login (\"dev_c\", \"abc\"): " + (result3 ? "Thành công" : "Thất bại"));

    }
}
