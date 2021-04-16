import java.util.ArrayList;
import java.util.Collections;
public class ArrayListAlphabetic {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Rana");
		names.add("Suresh");
		names.add("Raja");
		names.add("Prasad");
		names.add("tekula");
		
		Collections.sort(names);
	    System.out.println(names);


	}

}
