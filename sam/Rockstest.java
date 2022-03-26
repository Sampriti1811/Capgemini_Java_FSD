package sam;
import java.util.Scanner;
public class Rockstest{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i=0;int countA=0;int countB=0;	
            while(i<5) {
            i++;
			System.out.println("Choose between ROCK,PAPER AND SCISSORS: ");
			System.out.print("Player1: ");
			String a=sc.next();
			System.out.print("Player2: ");
			String b=sc.next();
			if(a.equals("ROCK") && b.equals("PAPER")) {
				System.out.println("The Winner is: "+b);
				countB=countB+1;
			}
			else if(a.equals("PAPER") && b.equals("ROCK")) {
				System.out.println("The Winner is: "+a);
				countA=countA+1;
			}
			else if(a.equals("SCISSORS") && b.equals("ROCK")) {
				System.out.println("The Winner is: "+b);
				countB=countB+1;
			}
			else if(a.equals("ROCK") && b.equals("SCISSORS")) {
				System.out.println("The Winner is: "+a);
				countA=countA+1;
			}
			else if(a.equals("SCISSORS") && b.equals("PAPER")) {
				System.out.println("The Winner is: "+a);
				countA=countA+1;
			}
			else if(a.equals("PAPER") && b.equals("SCISSORS")) {
				System.out.println("The Winner is: "+b);
				countB=countB+1;
			}
			else if(a.equals(b)){
				System.out.println("The match is a draw");
			}
			}
            if(countA>countB) {
            	System.out.println("Congratulations Player1!!! You are the winner...");
            }
            else if(countB>countA){
            	System.out.println("Congratulations Player2!!! You are the winner...");
            }
            else {
            	System.out.println("SORRY!!! The match is draw...");
            }
}
}