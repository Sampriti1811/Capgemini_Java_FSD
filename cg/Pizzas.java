package cpgg.cg;

enum Sizes{
	SMALL,MEDIUM,LARGE,EXTRALARGE;
}
class Test{
	Sizes pizzaSize;
	public Test(Sizes pizzaSize) {
		this.pizzaSize=pizzaSize;
	}
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL: 
			System.out.println("I ordered a small size pizza.");
			break;
		case MEDIUM:
			System.out.println("I ordered a medium size pizza.");
			break;
		default:
			System.out.println("I don't know which one to order.");
			break;
		}
	}
}
public class Pizzas {
	public static void main(String[] args) {
		Test t1=new Test(Sizes.MEDIUM);
		t1.orderPizza();
	}

}
