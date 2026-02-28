package PTIT_CNTT1_IT203A_Session14;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Bai3 {
    public static void main(String[] args) {
        Set<String> ingredient = new HashSet<>();
        Collections.addAll(ingredient, "Aspirin", "Caffeine", "Paracetamol");

        Set<String> allergy = new HashSet<>();
        Collections.addAll(allergy, "Penicillin", "Aspirin");

        Set<String> safeMedicine = new HashSet<>(ingredient);
        safeMedicine.retainAll(allergy);   // giao - chất trùng nhau

        Set<String> safeIngre = new HashSet<>(ingredient);
        safeIngre.removeAll(allergy);  //hiệu - bỏ chất dị ứng

        System.out.println("Cảnh báo dị ứng: " + safeMedicine);
        System.out.println("Thành phần an toàn: " + safeIngre);


    }
}
