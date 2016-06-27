package exercises;
import java.util.Scanner;

public class MethodsExercise1 
{
    public int getMaxNumber(int a, int b)
    {
        int max;
        
        if(a > b)
            max = a;
        
        else if(a == b)
            max = a;
        
        else
            max = b;
            
        return max;
    }
    
    public static void main(String[] args)
    {
        MethodsExercise1 me1 = new MethodsExercise1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num1 = sc.nextInt();
        System.out.print("Input another number: ");
        int num2 = sc.nextInt();
        
        System.out.println();
        System.out.println("The larger number is " + me1.getMaxNumber(num1, num2) + ".");
    }
}
