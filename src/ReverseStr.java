//using toCharArray()
//using charAt()
public class ReverseStr {
	public static void main(String[] args) {
		String str="Piyush";
		char[] ch=str.toCharArray();
		int len=ch.length;
		for(int i=len-1;i>=0;i--){
			System.out.println(ch[i]);
		}
	}
}



