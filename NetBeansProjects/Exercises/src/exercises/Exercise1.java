package exercises;
import java.util.Scanner;

public class Exercise1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
	String firstname, lastname, address, phone;
		
		
	System.out.print("First Name: ");
	firstname = sc.nextLine();
	System.out.print("Last Name: ");
	lastname = sc.nextLine();
	System.out.print("Address: ");
	address = sc.nextLine();
	System.out.print("Phone Number: ");
	phone = sc.nextLine();
		
	System.out.println();
	System.out.println("Name: " + firstname + " " + lastname);
	System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phone);
		
	sc.close();
    }
    
}
