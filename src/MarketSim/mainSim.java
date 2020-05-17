package MarketSim;

import java.util.Random;

public class mainSim {
	

	public static void main(String[] args) {

		 
		 Random random = new Random();
		 int max = 1000;
		 int min = 500;
		 int min1 = 10;
		 int max1 = 100;
		 
		 
		 for(int counter = 1; counter <= 100; counter++) {
			 String name = "Company-" + counter;
			 int shares = random.nextInt((max - min) + 1) + min;
			 int prices = random.nextInt((max1 - min1) + 1) + min1;
			 Company c1 = new Company(counter, name, shares, prices);
			 System.out.println(c1);		
			 
		 }


	}
	
}
