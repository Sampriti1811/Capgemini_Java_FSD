package day4;
class Ani{
	Ani(){
		System.out.println("I am an animal");
	}
	Ani(String type){
		System.out.println("Type: "+type);
	}
}
class Dg extends Ani{
	Dg(){
		super("Animal");
	    System.out.println("I am a dog");
	}
}
public class Stringstype {
	public static void main(String[] args) {
		Dg dog1=new Dg();
	}

}
