//using toCharArray()
//using charAt()
public class ReverseStr {
	public static void main(String[] args) {
		String str="Piyush";
		char[] ch=str.toCharArray();
		int len=ch.length;
		for(int i=len-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		System.out.println("");
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
			
		}
	}
}



