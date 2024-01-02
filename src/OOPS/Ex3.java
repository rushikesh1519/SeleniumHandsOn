package OOPS;

public class Ex3 {
	public static void main(String args[]) {
		
		int fact=5; //5*4*3
		int sum=1;
		
		for(int i=fact;i>0;i--) {
			
			sum=sum*i;
			
		}
		System.out.println("Factorial of "+fact+" is "+sum);
	}

}
