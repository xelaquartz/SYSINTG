package exercises;
import java.util.Scanner;

public class LoopExercise3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input number: ");
        int input = sc.nextInt();
        System.out.println();
        
        for(int i = 0; i < input; i++)
            System.out.println(i + 1);
        
        sc.close();
    }
}
