package PTIT_CNTT1_IT203A_Session06;


// bài 6
public class User {
    private String userID;
    private String username;
    private String password;
    private String email;

    public User(String userID, String username, String password, String email) {
        this.userID = userID;
        this.username = username;
        setEmail(email);
        setPassword(password);  // dùng setter để ktra
        // để như cũ thì truyền vào có sai → vẫn chấp nhận
        // Hàm main không cần gọi setter nữa
        //Vì đối tượng đã được kiểm tra ngay từ lúc tạo.
    }

    public String getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        if (password != null && !password.trim().isEmpty()){
            this.password = password;
        } else {
            System.out.println("Mật khẩu không được để trống");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@gmail.com")){
            this.email = email;
        } else {
            System.out.println("Email không hợp lệ");
        }
    }

    public void userInfo() {
        String hidenPassword = "*".repeat(password != null ? password.length() : 0);
        System.out.println("ID: " + userID);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: " + hidenPassword);
    }
}
