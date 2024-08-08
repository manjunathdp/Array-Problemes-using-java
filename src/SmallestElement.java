import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter "+size+" Array Elements");
        for (int i = 0; i <  size; i++) {
            array[i]= sc.nextInt();
        }
        sc.close();
        int smallest=array[0];
        for (int i = 1; i < size ; i++) {
            if (array[i]<smallest)
                smallest=array[i];
        }
        System.out.println("Smallest Array element is: "+smallest);
    }
}
