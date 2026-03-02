package PTIT_CNTT1_IT203A_Session15.Bai3;

import java.util.Stack;

public class MedicationProcessChecker {
    Stack<String> stack = new Stack<>();

    public boolean checkProcess(String[] actions) {
        reset(); // đảm bảo stack trống trước khi kiểm tra

        for (int i = 0; i < actions.length; i++) {
            String action = actions[i];

            if (action.equals("PUSH")) {
                stack.push("MED"); // đặt 1 item đại diện cho "phát thuốc"
            }
            else if (action.equals("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("POP khi Stack rỗng.");
                    return false;
                }
                stack.pop();
            }
            else {
                System.out.println("hành động không hợp lệ");
                return false;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Het ca trực nhưng chưa hết thuốc");
            return false;
        }

        System.out.println("Hợp lệ.");
        return true;
    }

    public void reset() {
        stack.clear();
    }
}
