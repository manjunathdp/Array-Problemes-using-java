package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ArrayList size: ");
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter " + size + " ArrayList Elements");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }
        System.out.println("The Maximum number in a List is: " + max + ".");
    }
}
