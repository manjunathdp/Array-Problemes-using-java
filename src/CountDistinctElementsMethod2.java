import java.util.Scanner;

public class CountDistinctElementsMethod2 {
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
        int[] freq=new int[size];
        int count,dist = 0;
        for (int i = 0; i < size; i++) {
            count=1;
            for (int j = i+1; j < size; j++) {
                if (array[i]==array[j]){
                    count++;
                    freq[j]=-1;
                }
            }
            if (freq[i]!=-1){
                freq[i]=count;
            }

        }
        for (int i = 0; i < size; i++) {
            if (freq[i]!=-1)
                dist++;
        }
        System.out.println("Count of Distinct elements: "+dist);
    }
}
