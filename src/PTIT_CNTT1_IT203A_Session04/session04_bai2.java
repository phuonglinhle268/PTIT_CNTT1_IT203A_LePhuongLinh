package PTIT_CNTT1_IT203A_Session04;

public class session04_bai2 {
    public static void main(String[] args) {
        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";

        int index = description.indexOf("Kệ:");

        if(index != -1){
            int start = index + "Kệ".length();
            int descriptionAfter = description.indexOf(",", start);

            String bookPlace;
            if(descriptionAfter != -1){
                bookPlace = description.substring(start, descriptionAfter).trim();
            } else {
                bookPlace = description.substring(start).trim();
            }
            System.out.println("Vị trí tìm thấy" + bookPlace);

            description = description.replace("Kệ:", "Vị trí lưu trữ:");
        }
        System.out.print("Mô tả mới: ");
        System.out.print(description);
    }
}
