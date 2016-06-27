package exercises;
import java.util.Scanner;

public class CalculatorExercise 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.print("Input first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Input second number: ");
        double num2 = sc.nextDouble();
        
        boolean compute = true;
        do{
        System.out.println();
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        System.out.print("Choose an operation: ");
        int oper = sc.nextInt();
        
        double ans = 0;
        
        switch(oper)
        {
            case 1: ans = num1 + num2;
                    break;
            case 2: ans = num1 - num2;
                    break;
            case 3: ans = num1 * num2;
                    break;
            case 4: ans = num1 / num2;
                    break;        
        }
        
        System.out.println("The answer is " + ans + ".");
        
        System.out.print("Use a different operation [Yes/No]? ");
        String yn = s.nextLine();
        
        if(yn.equalsIgnoreCase("yes"))
            compute = true;
        else if (yn.equalsIgnoreCase("no"))
            compute = false;
        else
            System.out.print("Invalid answer!");
        
        } while(compute == true);
        
        s.close();
        sc.close();
    }
}
