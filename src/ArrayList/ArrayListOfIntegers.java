package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 10 integers: ");
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(sc.nextInt());
        }
        System.out.print("Elements Reading from ArrayList: ");
        for (Integer integer : intList) {
            System.out.print(integer + " ");
        }

    }
}
