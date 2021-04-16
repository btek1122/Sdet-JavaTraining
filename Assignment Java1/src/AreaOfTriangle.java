
import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("give the base of the traingle :");
     double base =scan.nextDouble();
     System.out.println("give the height of the triangle :");
     double height =scan.nextDouble();
     double area =(base*height)/2;
     System.out.println("Area of triangle is:"+area);
     scan.close(); 
     

	}

}
