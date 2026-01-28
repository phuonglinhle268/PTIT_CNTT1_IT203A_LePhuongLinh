package PTIT_CNTT1_IT203A_Session04;

import java.util.Scanner;

public class session04_bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tên sách: ");
        String title = sc.nextLine();
        System.out.print("Tên tác giả: ");
        String author = sc.nextLine();

        title = title.trim().replaceAll("\\s", " ");
        title = title.toUpperCase();

        author = author.trim().replaceAll("\\s", " ");
        String names = "";
        for (String w : author.split(" ")) {
            names += w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase() + " ";
        }

        author = names.trim();

        System.out.print(title + " - Tác giả: " + author);

    }
}
