package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SubArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        System.out.println("Enter 5 Elements for arrayList 1: ");
        for (int i = 0; i < 5; i++) {
            a1.add(sc.nextInt());
        }
        System.out.println("Enter 5 Elements for arrayList 2: ");
        for (int i = 0; i < 5; i++) {
            a2.add(sc.nextInt());
        }
        System.out.print("The common Elements are: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (a1.get(i).equals(a2.get(j))) {
                    System.out.print(a1.get(i) + " ");
                }

            }
        }
    }
}
