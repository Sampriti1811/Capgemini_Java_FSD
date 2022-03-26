package sam1;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInterface{
	double getPiValue();
}
public class FunctionalInterfacemethod {
	public static void main(String[] args) {
		MyInterface ref;
		ref=()->3.1415;
		System.out.println("Value of Pi = "+ref.getPiValue());
	}

}
