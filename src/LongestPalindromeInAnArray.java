import java.util.Scanner;

public class LongestPalindromeInAnArray {
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
        int temp , lastDigit ,reverse,longest=Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            temp=array[i];
            reverse=0;
            while (temp!=0)
            {
                lastDigit=temp%10;
                reverse=(reverse * 10) + lastDigit;
                temp /= 10;
            }
            if (array[i]==reverse && array[i]>longest){
                longest=array[i];
            }
        }
        if (longest!=Integer.MIN_VALUE)
            System.out.println("The longest Palindrome element in this array is: "+longest);
        else
            System.out.println("No palindrome Found");
    }
}
