package exercises;
import java.util.Scanner;

public class LoopExercise5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input number: ");
        int input = sc.nextInt();
        System.out.println();
        
        for(int i = 0; i < input; i++)
            System.out.print("*");
        
        System.out.println();
        
        for(int i = 0; i < input + 1; i++)
        {
            for(int j = 0; j < i; j++)
                System.out.print("*");
            
            System.out.println();
        }
        
        System.out.println();
        
        for(int i = 0; i < input; i++)
        {
            for(int j = input; j > i; j--)
                System.out.print("*");
            
            System.out.println();
        }
        
        System.out.println();
        
        int j, k, i = 0;
        while(i < input)
        {
            for(j = 0; j < input - i - 1; j++)
                System.out.print(" ");
            
            for(k = 0; k < i + 1; k++)
                System.out.print("* ");
                   
            System.out.println();
            i++;
        }
        
        sc.close();
    }
}
