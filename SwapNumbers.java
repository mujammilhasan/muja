package basics;

public class SwapNumbers {
	

	public static void main(String[] args) {
	
		int first = 120, secand = 220;
		 
		System.out.println("--Before Swap--");
		System.out.println("First number = " + first);
		System.out.println("Secand number = " + secand);  
		
		first = first - secand;
		secand = first + secand;
		first = secand - first ;
		 
		System.out.println("--After Swap");
		System.out.println("First Number = " + first);
		System.out.println("secand number = " + secand);
		
		
		
		// TODO Auto-generated method stub

	}

}
