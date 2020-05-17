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


	}

}
