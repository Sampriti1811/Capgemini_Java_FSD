package day5;
class Data{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class Privatecase {
	public static void main(String[] main) {
		Data d=new Data();
		//d.name="ABC";
		d.setName("ABC");
		System.out.println(d.getName());
	}

}
