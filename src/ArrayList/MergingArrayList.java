package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MergingArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> merged = new ArrayList<>();
        System.out.println("Enter 5 Elements for arrayList 1: ");
        for (int i = 0; i < 5; i++) {
            a1.add(sc.nextInt());
        }
        System.out.println("Enter 5 Elements for arrayList 2: ");
        for (int i = 0; i < 5; i++) {
            a2.add(sc.nextInt());
        }
        System.out.print("Displaying Merged list: ");
        merged.addAll(a1);
        merged.addAll(a2);
        for (int item : merged) {
            System.out.print(item + " ");
        }
    }
}
