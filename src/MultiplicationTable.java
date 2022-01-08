import java.util.Scanner;

class Multiply{
	void MultiplicationTable(int a){
		for(int i=0;i<=10;i++){
			int t=i*a;
			System.out.println(t);
		}
	}
	
}


public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for which you need to check multiplication");
		int s=sc.nextInt();
		Multiply m=new Multiply();
		m.MultiplicationTable(s);	
		
	}
}

