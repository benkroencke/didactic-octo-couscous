package kampfrechner;

public class Testing {

	public static void main(String[] args) {
		int counter = 0;
		int i = 0;
		while(i<1000000) {
			int doubleAttack = (int) ((Math.random()*100)+1)/40;
			System.out.println(doubleAttack);
			i++;
			if(doubleAttack > 0)
				counter++;
		}

		 System.out.println("Counter von Double:" + counter);
		 System.out.println(9 % 3);
		 
	}

}
