package day4;
class Animals1{
	Animals1(){
		System.out.println("I am an animal");
	}
}
class Dogs1 extends Animals1{
	Dogs1(){
		super();
		System.out.println("I am a dog");
	}
}
public class Noarg {
	public static void main(String[] args) {
		Dogs1 dog1=new Dogs1();
	}

}
