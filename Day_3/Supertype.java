package day4;
class Animals{
	protected String type="animal";
}
class Dogs extends Animals{
	public String type="mammal";
	
	public void printType() {
		System.out.println("I am a " +type);
		System.out.println("I am an "+super.type);
	}
}
public class Supertype {
	public static void main(String[] args) {
		Dogs dog1=new Dogs();
		dog1.printType();
	}

}
