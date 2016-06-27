package exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArraysExercise5
{
    public void displayArraylist(ArrayList<String> a)
    {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Student\\Desktop\\words.txt")))
        {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                a.add(sCurrentLine);
            }

        } catch (IOException e) {
                e.printStackTrace();
        } 
        
        System.out.println(a);
    }
    
    public void displayReverse(ArrayList<String> a)
    {
        ArrayList b = new ArrayList<String>();
        
        for(int i = a.size() - 1; i >= 0; i--)
            b.add(a.get(i));
        
        System.out.println("Reversed Order: " + b);
    }
    
    public void displayPluralCapitalized(ArrayList<String> a)
    {
        String s = "s";
        //for(int i = 0; i < a.size(); i++)
            //a.get(i) += s;
    }
    
    public void displaySingular(ArrayList<String> a)
    {
    
    }
    
    public static void main(String[] args)
    {
        ArraysExercise5 ae = new ArraysExercise5();
        ArrayList a = new ArrayList<String>();
        
        ae.displayArraylist(a);
        ae.displayReverse(a);
    }
}
