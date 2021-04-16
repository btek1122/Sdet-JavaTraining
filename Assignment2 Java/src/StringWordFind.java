import java.util.Arrays;
import java.util.Scanner;
public class StringWordFind {

	public static void main(String[] args) {
		String str;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        str = S.nextLine();
		String[] splited = str.split("\\b+");   //split on word boundries
		Arrays.asList(splited).contains("brown");   //search array for word

		if(str.contains("red"))
		{
			System.out.println("color is Presnt in String");
		}
		
		else
		{
			System.out.println("color is NOT Presnt in String");

		}
		
		
	}
	

}
