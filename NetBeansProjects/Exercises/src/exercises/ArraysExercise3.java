package exercises;
import java.util.ArrayList;

public class ArraysExercise3 
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList<String>();
        ArraysExercise3 a = new ArraysExercise3();
        
        list.add("the");
        list.add("quick");
        list.add("brown");
        list.add("fox");
        
        System.out.println(list);
        a.addStars(list);
    }
    
    public void addStars(ArrayList list)
    {
        ArrayList list2 = new ArrayList<String>();
        
        for(int i = 0; i < list.size(); i++)
        {
            list2.add(list.get(i));
            list2.add("*");
        }
        System.out.println(list2);
    }
}
