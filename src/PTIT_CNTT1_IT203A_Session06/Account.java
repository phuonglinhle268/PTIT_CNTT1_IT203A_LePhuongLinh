package PTIT_CNTT1_IT203A_Session06;

// bài 2
public class Account {
    public String username;
    private String password;
    private String email;

    public Account(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword){
        this.password = newPassword;
        System.out.println("Đổi mật khẩu thành công");
    }

    public void userInfo(){
        String hidePassword = "*".repeat(password.length());
        System.out.println("Tên người dùng: " + username);
        //System.out.println("Mật khẩu: " + password);
        System.out.println("Mật khẩu: " + hidePassword);
        System.out.println("Email: " + email);
    }
}
