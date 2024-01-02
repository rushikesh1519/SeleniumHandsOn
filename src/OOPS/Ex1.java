package OOPS;

public class Ex1 {
	
	public static void main(String args[]) {
		
		String str="Rushi bhau deokar";
		String[] spl=str.split(" ");
		int n=spl.length;


		for(int i=n-1;i>=0;i--) {
			
			System.out.print(spl[i]+" ");
		}
		
	}

}
