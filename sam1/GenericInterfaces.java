package sam1;

@FunctionalInterface

interface GenericInterface<T>{
	T func(T t);
}
public class GenericInterfaces {
	public static void main(String[] args) {
		GenericInterface<String> reverse=(str)->{
			String result="";
			for(int i=str.length()-1;i>=0;i--) {
				result+=str.charAt(i);
			}
				return result;
			};
			System.out.println("Lambda reversed = "+reverse.func("Lambda"));
			
			GenericInterface<Integer> factorial=(n)->{
				int results=1;
				while(n>0) {
					results=results*n;
					n-=1;
				}
					return results;
				};
				System.out.println("factorial of 5 = " + factorial.func(5));
				
				
			}	
		
	}


