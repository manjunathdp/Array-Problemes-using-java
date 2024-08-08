import java.util.Scanner;

public class SecondLargestMethod1 {
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
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (array[i]>largest){
                secondLargest=largest;
                largest=array[i];
            }
            else if (array[i]>secondLargest && array[i]!=largest)
            {
                secondLargest=array[i];
            }
        }
        System.out.println("The Second Largest Element in an Array is: "+secondLargest);
    }
}
