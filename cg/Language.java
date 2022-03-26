package cpg.cg;
import java.util.ArrayList;
public class Language {
	  public static void main(String[] args) {
		    ArrayList<String> languages = new ArrayList<>();

		    // add elements in the array list
		    languages.add("Java");
		    languages.add("Kotlin");
		    languages.add("C++");
		    System.out.println("ArrayList: " + languages);

		    // change the element of the array list
		    languages.set(2, "JavaScript");
		    //languages.replace("C++", "JavaScript");
		    System.out.println("Modified ArrayList: " + languages);
		  }


}
