package MarketSim;

public class Investors {

	
	//ID
	private String name;
	private int investorID;
	private int budget;
	
	//Getters
	public String getName() {
		return name;
	}
	
	public int getInvestorID() {
		return investorID;
	}
	
	public int getBudget() {
		return budget;
	}
	
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setInvestorID(int investorID) {
		this.investorID = investorID;
	}
	
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	public void printInv() {
		System.out.println("Investor ID: " + getInvestorID() + "  ||  " + "Investor Name: " + getName() );
	}
	
}
