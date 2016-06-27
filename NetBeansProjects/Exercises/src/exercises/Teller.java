package exercises;
import java.util.Scanner;

public class Teller
{
    //Declare Variables and Scanner
    static int sel, pin, check, ctr, dep, bal = 10000;
    private static Scanner sc = new Scanner(System.in);
    
    //Method for Setting up the PIN COde
    private static void newPinCode()
    {
        System.out.print("Enter new PIN code: ");
        pin = sc.nextInt();
        
        do
        {
            System.out.print("Re-enter PIN code: ");
            check = sc.nextInt();
            
            if(pin == check)
                transact();
            else
                System.out.println("INCORRECT PIN. Try again.\n");
        } while(pin != check);
    }
    
    //Method for PIN Code input
    private static void pinTr()
    {
        //There will be a limit of 3 mistakes before you get kicked out
        ctr = 0;
        do
        {
            System.out.print("Enter PIN code: ");
            check = sc.nextInt();

            if(check == pin)
                transact();
            else
            {
                ctr++;
                System.out.println("INCORRECT PIN. You have " + (3 - ctr) + " more tries.\n");
            }
        }   while(ctr < 3);
        
        if(ctr == 3)
            System.exit(0);
    }
    
    //Method for all Transactions
    private static void trans(int sel)
    {
        System.out.println();
        switch(sel)
        {
            case 1: System.out.println("Your current balance is PHP " + bal);
                    break;
            case 2: System.out.print("Enter an amount to deposit: ");
                    dep = sc.nextInt();
                    bal += dep;
                    System.out.println("Your current balance is PHP " + bal);
                    break;
            case 3: do
                    {
                        System.out.print("Enter an amount to withdraw: ");
                        dep = sc.nextInt();
                        
                        if(dep > bal)
                            System.out.println("ERROR! The amount to be withdrawn CANNOT be greater than the current total balance.");
                    } while(dep > bal);
                    bal -= dep;
                    System.out.println("Your current balance is PHP " + bal);
                    break;
            case 4: newPinCode();
                    break;
            case 5: pinTr();
                    break;
            default: System.out.println("Your choice is INVALID.");
                    break;
        }
    }
    
    //Method for Transaction selection
    private static void transact()
    {
        do
        {
            System.out.println("\nTRANSACTION MENU");
            System.out.println("1 - Check Balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Change PIN Code");
            System.out.println("5 - End Transaction");
            System.out.print("\nChoose a transaction: ");
            sel = sc.nextInt();
            trans(sel);
        } while(sel != 5);
    }
    
    public static void main(String[] args)
    {
        newPinCode();   //Call to stimulate first time use of ATM
    }
}
