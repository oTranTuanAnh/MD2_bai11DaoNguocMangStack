import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,0};
        Stack<Integer> stack = new Stack<>();
        System.out.printf("%-20s","mang ban dau: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }


        for (int i = 0; i < arr.length; i++) {
          arr[i] = stack.pop();
        }

        System.out.println();
        System.out.printf("%-20s","mang dao nguoc: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
