package exercises;
import java.util.Scanner;

public class Exercise5 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select:");
        System.out.println("[1] drink ");
        System.out.println("[2] sandwich");
        System.out.println();
        int input = Integer.parseInt(sc.nextLine());
        System.out.println();
        
        switch(input)
        {
            case 1: System.out.println("Coffee or Tea? ");
                    String choice1 = sc.nextLine();
                    if(choice1.equalsIgnoreCase("coffee"))
                        System.out.println("You chose a COFFEE DRINK.");
                    else if(choice1.equalsIgnoreCase("tea"))
                        System.out.println("You chose a TEA DRINK.");
                    else
                        System.out.println("YOUR CHOICE WAS INVALID.");
                    break;
                            
            case 2: System.out.println("Club Sandwich or BLT? ");
                    String choice2 = sc.nextLine();
                    if(choice2.equalsIgnoreCase("club sandwhich"))
                        System.out.println("You chose a CLUB SANDWICH.");
                    else if(choice2.equalsIgnoreCase("BLT"))
                        System.out.println("You chose a BLT SANDWICH.");
                    else
                        System.out.println("YOUR CHOICE WAS INVALID.");
                    break;
                    
            default: System.out.println("That is not a valid choice!");
                    break;
        }
        
        sc.close();
    }
}
