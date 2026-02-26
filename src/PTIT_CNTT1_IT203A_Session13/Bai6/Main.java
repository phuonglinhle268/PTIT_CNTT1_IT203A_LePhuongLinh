package PTIT_CNTT1_IT203A_Session13.Bai6;

import PTIT_CNTT1_IT203A_Session13.Bai6.Medicine;

import java.util.*;

public class Main {
    public static ArrayList<Medicine> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm thuốc vào đơn");
            System.out.println("2. Điều chỉnh số lượng");
            System.out.println("3. Xóa thuốc");
            System.out.println("4. In hóa đơn");
            System.out.println("5. Tìm thuốc giá rẻ");
            System.out.println("6. Thoát");
            System.out.print("Chọn lựa chọn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    addMedicine();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    deleteMedicine();
                    break;
                case 4:
                    displayMedicine();
                    break;
                case 5:
                    findMedicine();
                    break;
                case 6:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }

    // thêm
    public static void addMedicine(){
        System.out.print("Nhập mã thuốc: ");
        String id = scanner.nextLine();

        for (Medicine m : list){
            if (m.getDrugId().equals(id)){
                System.out.println("Thuốc đã có, nhập số lượng thêm: ");
                int addmore = Integer.parseInt(scanner.nextLine());
                m.addQuantity(addmore);
                System.out.println("Thêm số lượng thành công");
                return;
            }
        }
        System.out.print("Nhập tên thuốc: ");
        String name = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số lượng: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        list.add(new Medicine(id, name, price,quantity));
        System.out.println("Thêm thuốc thành công");
    }

    // sửa số lượng
    public static void updateQuantity(){
        System.out.print("Nhập mã thuốc: ");
        String id = scanner.nextLine();

        for (Medicine m : list){
            if (m.getDrugId().equals(id)){
                System.out.print("Nhập số lượng mới: ");
                int newAmount = Integer.parseInt(scanner.nextLine());
                if (newAmount == 0){
                    list.remove(m);
                    System.out.println("Đã xóa thuốc hết");
                } else {
                    m.setQuantity(newAmount);
                    System.out.println("Cập nhật thuốc thành công");
                }
                return;
            }
        }
        System.out.println("Thuốc không tồn tại trong đơn");
    }

    //xóa
    private static void deleteMedicine() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = scanner.nextLine();

        Iterator<Medicine> check = list.iterator();
        while (check.hasNext()) {
            if (check.next().getDrugId().equals(id)) {
                check.remove();
                System.out.println("Đã xóa thuốc");
                return;
            }
        }
        System.out.println("ID thuốc không tồn tại");
    }

    // in hóa đơn
    private static void displayMedicine() {
        if (list.isEmpty()) {
            System.out.println("Chưa có đơn thuốc");
            return;
        }

        System.out.printf("%-10s %-20s %10s %8s %12s\n",
                "Mã thuốc", "Tên thuốc", "Đơn giá", "SL", "Thành tiền");

        double total = 0;

        for (Medicine m : list) {
            System.out.println(m);
            total += m.getTotal();
        }

        System.out.printf("Tổng tiền: %.2f VNĐ\n", total);
        list.clear();
    }

    // tìm
    private static void findMedicine() {
        boolean found = false;

        for (Medicine m : list) {
            if (m.getUnitPrice() < 50_000) {
                System.out.println(m);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy");
        }
    }
}
