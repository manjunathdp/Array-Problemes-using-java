import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        int sum=0;
        System.out.println("Enter "+size+" Array Elements");
        for (int i = 0; i <  size; i++) {
            array[i]= sc.nextInt();
            sum=sum+array[i];
        }
        System.out.println("The sum of array elements is: "+sum);
        sc.close();

    }
}
