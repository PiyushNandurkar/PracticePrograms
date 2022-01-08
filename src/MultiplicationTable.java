import java.util.Scanner;

class Multiply{
	void MultiplicationTable(int a){
		for(int i=0;i<=10;i++){
			int t=i*a;
			System.out.println(t);
		}
	}
	
}

class ArithmaticOperation{
	
	void ArithmaticOperation(String operation){
		String operation1;
		switch (operation1) {
		case 1:
			
		default :
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

