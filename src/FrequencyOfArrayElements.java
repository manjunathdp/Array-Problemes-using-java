import java.util.Scanner;

public class FrequencyOfArrayElements {
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
        int[] frequency =new int[size];
        int visited = -1;
        int count;
        for (int i = 0; i < size; i++) {
            count=1;
            for (int j = i+1; j < size; j++) {
                if (array[i]==array[j]){
                    count++;
                    frequency[j]=visited;
                }
            }
            if (frequency[i]!=visited)
            {
                frequency[i] = count;
            }
        }
        for (int i = 0; i < size; i++) {
            if (frequency[i] != visited) {
                System.out.println("Frequency of "+array[i]+" is: "+frequency[i]);
            }
        }
    }
}
