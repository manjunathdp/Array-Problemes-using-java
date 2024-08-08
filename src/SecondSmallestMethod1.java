import java.util.Scanner;

public class SecondSmallestMethod1 {
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
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (array[i]<smallest)
            {
                secondSmallest=smallest;
                smallest=array[i];
            } else if (array[i]!=smallest&&array[i]<secondSmallest) {
                secondSmallest=array[i];
            }
        }
        System.out.println("The second smallest element in an array is: "+secondSmallest);
    }
}
