package exercises;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class APIExercise1 
{
    public static void main(String[] args)
    {
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("It is currently " + df.format(date) + ".");
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.getDefault());
        System.out.println(df2.format(date));
    }
}