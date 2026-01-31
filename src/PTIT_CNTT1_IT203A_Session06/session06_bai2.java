package PTIT_CNTT1_IT203A_Session06;

public class session06_bai2 {
    public static void main(String[] args) {
        Account userAccount = new Account("Nguyen Van A", "123@", "nva@gmail.com");

        System.out.println("Thông tin người dùng");
        userAccount.userInfo();

        userAccount.changePassword("abcd");
        userAccount.userInfo();
    }
}
