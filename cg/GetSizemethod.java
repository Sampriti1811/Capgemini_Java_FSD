package cpgg.cg;

enum Size1{
	SMALL,MEDIUM,LARGE,EXTRALARGE;
	public String getSize1() {
		switch(this) {
		case SMALL:
			return "small";
		case MEDIUM:
			return "medium";
		case LARGE:
			return "large";
		case EXTRALARGE:
			return "extra large";
		default:
			return null;
		}
	}
}
public class GetSizemethod {
	public static void main(String[] args) {
		System.out.println("The size of the pizza is "+Size1.SMALL.getSize1());
	}

}
