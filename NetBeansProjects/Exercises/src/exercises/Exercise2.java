package exercises;
import java.util.Scanner;

public class Exercise2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Choose: A or B? ");
        String ab = sc.nextLine();
        
        System.out.print("Choose: POSITIVE or NEGATIVE? ");
        String posneg = sc.nextLine();
        
        if(ab.equalsIgnoreCase("A") && posneg.equalsIgnoreCase("positive"))
            System.out.println("A+");
        
        else if(ab.equalsIgnoreCase("A") && posneg.equalsIgnoreCase("negative"))
            System.out.println("A-");
        
        else if(ab.equalsIgnoreCase("B") && posneg.equalsIgnoreCase("positive"))
            System.out.println("B+");
        
        else if(ab.equalsIgnoreCase("B") && posneg.equalsIgnoreCase("negative"))
            System.out.println("B-");
        
        else
            System.out.println("Error: Invalid input!");
        
        sc.close();
    }
}
