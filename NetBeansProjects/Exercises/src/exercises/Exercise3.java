package exercises;
import java.util.Scanner;

public class Exercise3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        
        System.out.print("Name: ");
        name = sc.nextLine();
        
        System.out.print("Age: ");
        age = Integer.parseInt(sc.nextLine());
        
        System.out.println();
        System.out.println("Your name is " + name);
        
        if(age < 18)
            System.out.println("You are underaged!");
        else
            System.out.println("You are of legal age!");
                    
        sc.close();
    }
}
