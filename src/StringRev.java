import java.util.Scanner;

public class StringRev
{
	
	public static void main(String args[])
	{
	 String original, reverse = ""; // Objects of String class
     Scanner in = new Scanner(System.in);

     System.out.println("Enter a string to reverse");
     original = in.nextLine();

     int length = original.length();

     for ( int i = length - 1; i >= 0; i-- )
        reverse = reverse + original.charAt(i);
      System.out.println("Reversed String is "+reverse);
	
	}
	
	
}