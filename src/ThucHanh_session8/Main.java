package ThucHanh_session8;

import ThucHanh_session8.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student list[] = new Student[100];
        int count = 0;

        int choice;

        do{
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Nhập số lượng sinh viên: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i<n; i++){
                        System.out.print("Nhập sinh viên thứ: "+ (i+1));

                        String id;
                        while (true){
                            System.out.println("Nhập id: ");
                            id = sc.nextLine();
                            if (id.startsWith("SV") && id.length() == 5) {
                                String numPart = id.substring(2);
                                if (numPart.matches("\\d{3}"))
                                    break;
                            }
                            System.out.println("ID không hợp lệ");
                        }
                        System.out.print("Nhập tên: ");
                        String name = sc.nextLine();

                        System.out.print("Nhập điểm: ");
                        double score = sc.nextDouble();
                        sc.nextLine();

                        list[count++] = new Student(id, name, score);
                    }
                    break;
                case 2:
                    for (int i=0; i<count; i++) {
                        System.out.println(list[i]);
                    }
                    break;
                case 3:
                    System.out.print("Nhập học lực cần tìm: ");
                    String searchStudent = sc.nextLine();

                    for (int i=0; i < count; i++) {
                        if (list[i].getRank().equalsIgnoreCase(searchStudent)) {
                            System.out.println(list[i]);
                        }
                    }
                    break;
                case 4:
                    for(int i=0; i<count - 1; i++){
                        for (int j=i+1; j<count; j++){
                            if (list[i].getScore() < list[j].getScore()) {
                                Student temp = list[i];
                                list[i] = list[j];
                                list[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp");
                    break;
                case 5:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");

            }
        } while (choice != 5);
    }
}





