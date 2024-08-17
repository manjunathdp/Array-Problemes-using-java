package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AddingRemovingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        int ch = choice();
        select(ch,names,sc);


    }
    public static int choice(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Select The Options: 1 ADD Element 2 Remove Element 3 Display List 4 Exit: ");
        return sc.nextInt();
    }
    public static void select(int ch , ArrayList<String> names , Scanner sc) {

        switch (ch) {
            case 1:
                System.out.println("Enter name to add to the list");
                names.add(sc.next());
                int c1= choice();
                select(c1,names,sc);
                break;
            case 2:
                if(names.isEmpty()) {
                    System.out.println("List is Empty Add The element");
                    int c2=choice();
                    select(c2,names,sc);
                }
                else {
                    System.out.println("Removing Element "+names.getLast()+" From the list");
                    names.removeLast();
                    int c2=choice();
                    select(c2,names,sc);
                }
                break;
            case 3:
                if (names.isEmpty()) {
                    System.out.println("List is Empty");
                    int c3=choice();
                    select(c3,names,sc);
                }
                else {
                    System.out.print("The Array List: ");
                    for (int i = 0; i < names.size(); i++) {
                        System.out.print(names.get(i)+" ");
                    }
                    System.out.println();
                    int c3=choice();
                    select(c3,names,sc);
                }
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Choice Enter correct one");
                int c3=choice();
                select(c3,names,sc);

        }
    }
}
