package StringOperation;

public class Operation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1234543211;
		int noo=no;
		int ulta=0,rem;
		while(no!=0) {
		rem=no%10;
		ulta=ulta*10+rem;
		no=no/10;
		}
		System.out.println("The number is "+ulta);
		if(noo==ulta) {
			System.out.println("The number is pallindrome ");
		}
		else {
			System.out.println("The number is not pallindrome");
		}
	}
	}


