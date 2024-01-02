package OOPS;

public class Ex5 {

	//pallindrome number
	
	public static void main(String args[]) {
		
		int num=123456;
		int ulta=0;
		int d=0;
		int n=0;
		
		for(int i=0;i<3;i++) {
	    d=num/10;	
		n=num%10;
		ulta=n+ulta*10;
	
		}
		
		System.out.println(d);
	}
}
