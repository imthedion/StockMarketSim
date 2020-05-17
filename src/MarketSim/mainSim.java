package MarketSim;

public class mainSim {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Company c = new Company();
		 Investor i = new Investor();
		 
		 i.setName("HSE");
		 i.setInvestorID(9283);
		 
		 c.setCoName("Green Cross");
		 c.setCompanyID(41234);
		 
		 i.printInv();
		 c.printCompany();
		 
		 System.out.println("hello world");
		 
		 for(int counter = 1; counter <= 100; counter++) {
			 System.out.println("hello mawe" + counter);
			 
		 }


	}
	
}
