package exercises;

import java.util.ArrayList;

public class ArraysExercise4 
{
    /*displays Arraylist*/
    public void displayArraylist(ArrayList<Integer> a)
    {
        for(int i = 0; i < 20; i++)
            a.add(i + 1);
        
        System.out.println(a);
    }
    
    /*gets average*/
    public void getAverage(ArrayList<Integer> a)
    {
        double ave = 0;
        for(int i = 0; i < a.size(); i++)
            ave += a.get(i);
        
        ave /= a.size();
        
        System.out.println("The average is " + ave);
    }
    
    /*gets highest and lowest value*/
    public void getHighestLowest(ArrayList<Integer> a)
    {
        int high = 0, low = a.get(0);
        
        for(int i = 0; i < a.size(); i++)
            if(a.get(i) > high)
                high = a.get(i);
        
        for(int i = 0; i < a.size(); i++)
            if(a.get(i) < low)
                low = a.get(i);
        
        System.out.println("The lowest is " + low);
        System.out.println("The highest is " + high);
    }
    
    /*gets even numbers*/
    public void getEven(ArrayList<Integer> a)
    {
        System.out.println("Even numbers: ");
        for(int i = 0; i < a.size(); i++)
            if(a.get(i) % 2 == 0)
                System.out.println(a.get(i));
    }
    
    public void inOneMethod(ArrayList<Integer> b)
    {
        ArrayList even = new ArrayList<Integer>();
        b.add(34);
        b.add(12);
        b.add(7);
        b.add(3);
        b.add(124);
        
        System.out.println(b);
        
        int ave = 0;
        int high = 0, low = b.get(0);
        
        for(int i = 0; i < b.size(); i++)
        {
            ave += b.get(i);
            
            if(b.get(i) > high)
                high = b.get(i);
            
            if(b.get(i) < low)
                low = b.get(i);
            
            if(b.get(i) % 2 == 0)
                even.add(b.get(i));
        }
        
        System.out.println("Average: " + ave);
        System.out.println("Highest: " + high);
        System.out.println("Lowest: " + low);
        System.out.println("Even numbers: " + even);
        
    }
    
    public static void main(String[] args)
    {
        ArraysExercise4 ae = new ArraysExercise4();
        ArrayList a = new ArrayList<Integer>();
        
        ae.displayArraylist(a);
        ae.getAverage(a);
        ae.getHighestLowest(a);
        ae.getEven(a);
        
        System.out.println();
        System.out.println();
        System.out.println("IN ONE METHOD ONLY: ");
        
        ArrayList b = new ArrayList<Integer>();
        ae.inOneMethod(b);
        
    }
}
