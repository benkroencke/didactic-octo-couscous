package kampfrechner;

public class Testing {
	
	public static void main(String[] args) {
		
		int random = 18;
		
		int i = 0;
		while(i<1000) {

			
			double wert = Math.random()*random;
			System.out.println((int) wert);
			
			i++;
		}
		 
	}

}
