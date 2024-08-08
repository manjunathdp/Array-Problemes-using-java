import java.util.Scanner;

public class SecondLargestMethod2 {
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
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size ; j++) {
                if (array[j]>array[i]) {
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            if (i==1){
                break;
            }
        }
        System.out.println("The Second Largest Element in an Array is: "+array[1]);
    }
}
