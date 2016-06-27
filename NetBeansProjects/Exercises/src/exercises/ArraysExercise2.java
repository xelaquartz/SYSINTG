package exercises;

import java.util.ArrayList;

public class ArraysExercise2 
{
    public static void main(String[] args)
    {
        ArrayList a = new ArrayList<String>();
        
        a.add("dave");
        a.add("john");
        a.add("jade");
        a.add("rose");
        a.add("dirk");
        a.add("john");
        a.add("roxy");
        a.add("john");
        a.add("jane");
        a.add("john");
        a.add("jake");
        a.add("john");
        a.add("john");
        
        for(int i = 0; i < a.size(); i++)
            System.out.println("[" + i + "] " + a.get(i));
        
        System.out.println();
        System.out.print("Deleting johns...");
        System.out.println();
        System.out.println();
        
        int j = 0;
        
        while(j < a.size())
        {
            if(a.get(j).equals("john"))
                a.remove(j);
            else
                j++;
        }
        
        for(int i = 0; i < a.size(); i++)
            System.out.println("[" + i + "] " + a.get(i));
    }
}
