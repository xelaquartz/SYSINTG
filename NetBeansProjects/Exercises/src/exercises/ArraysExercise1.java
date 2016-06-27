package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraysExercise1 
{
    public static void main(String[] args)
    {
        ArrayList a = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int choose;
        
        do
        {
            System.out.println();
            System.out.println();
            System.out.println("CHOOSE:");
            System.out.println("[1] Get input");
            System.out.println("[2] Add");
            System.out.println("[3] Remove");
            System.out.println("[4] Display");
            System.out.println("[5] Sort");
            System.out.println("[6] Exit");
            System.out.println();

            System.out.print("Choose: ");
            choose = sc.nextInt();
            System.out.println();
            System.out.println();

            switch(choose)
            {
                case 1: System.out.print("Enter the index: ");
                        int index = sc.nextInt();
                        System.out.println(a.get(index));
                        break;
                case 2: System.out.print("Input a number: ");
                        int num = sc.nextInt();
                        a.add(num);
                        break;
                case 3: System.out.print("Enter the index: ");
                        index = sc.nextInt();
                        a.remove(index);
                        break;
                case 4: for(int i = 0; i < a.size(); i++ )
                            System.out.println("["+ i + "] " + a.get(i));
                        break;
                case 5: Collections.sort(a);
                        break;
                case 6: System.exit(0);
                        break;

            }
        } while(choose != 6);
    }
}
