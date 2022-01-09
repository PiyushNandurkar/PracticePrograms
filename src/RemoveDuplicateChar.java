public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String s="Hi i am piyush nandurkar";
		for(int i=0;i<s.length();i++){
			System.out.print(s.charAt(i));
		}
//=======================Reverse==================================================		
		System.out.println("");
		for(int i=s.length()-1;i>=0;i--){
		}
//========================Duplicate in Array=================================================		
		int a[]=new int[]{1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,65};
		System.out.println("Duplicate element in array are");
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println(a[j]);
				}
			}
//=========================================================================			
			
		}
	}
}
