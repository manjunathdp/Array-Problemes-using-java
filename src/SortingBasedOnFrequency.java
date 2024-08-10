import java.util.Scanner;

public class SortingBasedOnFrequency {
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
        int count;
        int temp;
        // counting the frequency
        for (int i = 0; i < size; i++) {
            count=1;
            for (int j = i+1 ; j < size; j++) {
                if (array[i]==array[j]){
                    count++;
                    frequency[j]=-1;
                }
            }
            if (frequency[i]!=-1)
                frequency[i]=count;
        }

        // Equalizing the frequency
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if(array[i]==array[j])
                    frequency[j]=frequency[i];
            }
        }
        //Sorting According to the frequency;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if(frequency[i]<frequency[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;

                    temp=frequency[i];
                    frequency[i]=frequency[j];
                    frequency[j]=temp;
                }
            }
        }
        //printing sorted array
        System.out.println("Sorted Array According to its frequency:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+"  ");
        }
    }
}
