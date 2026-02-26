package PTIT_CNTT1_IT203A_Session13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai2 {
    public static List<String> uniqueAndSort(List<String> input) {
        List<String> result = new ArrayList<>();

        // chỉ thêm nếu chưa tồn tại
        for (int i = 0; i < input.size(); i++) {
            String medicine = input.get(i);
            if (!result.contains(medicine)) {
                result.add(medicine);
            }
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        List<String> input = List.of("Paracetamol", "Ibuprofen", "Panadol", "Paracetamol", "Aspirin", "Ibuprofen");
        System.out.println("Input: " + input);
        List<String> output = uniqueAndSort(input);
        System.out.println("Output: " + output);

    }
}