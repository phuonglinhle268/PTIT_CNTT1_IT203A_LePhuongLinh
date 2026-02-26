package PTIT_CNTT1_IT203A_Session13;

import java.util.ArrayList;
import java.util.List;

public class Bai3 {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB){
        List<T> result = new ArrayList<>();

        for (T item: listA){
            if (listB.contains(item)){
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //test case 1
        List<Integer> a1 = List.of(101, 102, 105);
        List<Integer> b1 = List.of(102, 105, 108);

        List<Integer> common1 = findCommonPatients(a1, b1);
        System.out.println("Test case 1: " + common1);

        //test case 2
        List<String> a2 = List.of("DN01", "DN02", "DN03");
        List<String> b2 = List.of("DN02", "DN04");

        List<String> common2 = findCommonPatients(a2, b2);
        System.out.println("Test case 2: " + common2);
    }
}
