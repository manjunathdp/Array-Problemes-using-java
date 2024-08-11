import java.util.Scanner;

public class CountingDistinctElementsMethod1 {
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
        int count=0;
        for (int i = 0; i < size; i++) {
            boolean isDistinct = true;
            for (int j = i+1; j < size; j++) {
                if(array[i]==array[j]){
                    isDistinct=false;
                    break;
                }
            }
            if (isDistinct)
                count++;
        }
        System.out.println("Count of Distinct elements: "+count);
    }
}
