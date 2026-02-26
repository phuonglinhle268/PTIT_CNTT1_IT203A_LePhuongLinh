package PTIT_CNTT1_IT203A_Session13.Bai5;

import java.util.*;

public class Main {
    public static ArrayList<Patient> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách bệnh nhân");
            System.out.println("5. Xem toàn bộ danh sách bệnh nhân");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosos();
                    break;
                case 3:
                    deletePatient();
                    break;
                case 4:
                    sortPatient();
                    break;
                case 5:
                    displayPatient();
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
    public static void addPatient(){
        System.out.println("Nhập ID: ");
        String id=  scanner.nextLine();
        for (Patient p : list){
            if (p.getId().equals(id)){
                System.out.println("ID đã tồn tại");
                return;
            }
        }
        System.out.print("Nhập tên bệnh nhân: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = scanner.nextLine();

        list.add(new Patient(id, name, age, diagnosis));
        System.out.println("Bệnh nhân đã được thêm thành công");
    }

    // cập nhập
    public static void updateDiagnosos(){
        System.out.print("Nhập id bệnh nhân cần cập nhật chẩn đoán: ");
        String id = scanner.nextLine();

        for (Patient p : list){
            if (p.getId().equals(id)){
                System.out.print("Nhập chẩn đoán mới: ");
                String newDia = scanner.nextLine();
                p.setDiagnosis(newDia);

                System.out.println("Chẩn đoán đã được cập nhập");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân với ID đã cho");
    }

    //xuất viện
    public static void deletePatient(){
        System.out.print("Nhập ID bệnh nhân để xuất viện: ");
        String id = scanner.nextLine();

        for (Patient p : list){
            if (p.getId().equals(id)){
                list.remove(p);
                System.out.println("Bệnh nhân được xuất viện");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân với ID đã cho");
    }

    // sắp xếp
    public static void sortPatient(){
        Collections.sort(list, new Comparator<Patient>() {
            @Override
            public int compare(Patient a, Patient b) {
                if (a.getAge() != b.getAge()){
                    return b.getAge() - a.getAge();

                }
                return a.getFullName().compareToIgnoreCase(b.getFullName());
            }
        });
        System.out.println("Danh sách bệnh nhân đã được sắp xếp");
    }

    //hien thi
    public static void displayPatient(){
        if (list.isEmpty()){
            System.out.println("Không có bệnh nhân");
            return;
        }
        System.out.println("=====Danh sách bệnh nhân======");
        for (Patient p : list){
            System.out.println(p);
        }
    }
}
