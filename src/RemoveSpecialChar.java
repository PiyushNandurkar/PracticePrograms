
public class RemoveSpecialChar {
	public static void main(String[] args) {
		String str="@#$%%^#$IUTYREWASXZ";
		
		
		String plainStr=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(plainStr);
	}
}
