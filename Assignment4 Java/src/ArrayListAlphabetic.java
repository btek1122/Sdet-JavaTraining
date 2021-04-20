
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAlphabetic
{
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Btek");
		names.add("Krishna");
		names.add("Tekula");
		names.add("Kanaparti");
		names.add("Shanthi");
		names.add("pooja");
		Collections.sort(names);
	    System.out.println(names);
	}
}

