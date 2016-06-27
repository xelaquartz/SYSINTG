package exercises;
import java.util.Scanner;

public class Exercise4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Choose a scenario: 1, 2, OR 3? ");
        int input = sc.nextInt();
        
        switch(input)
        {
            case 1: System.out.println("You died from natural causes.");
                    break;
            case 2: System.out.println("You get mauled by a bear. You died.");
                    break;
            case 3: System.out.println("You fell down and cracked your skull. You are weak. DEAD.");
                    break;
            default: System.out.println("You survived.");
                    break;
        }
        
        sc.close();
    }
}
