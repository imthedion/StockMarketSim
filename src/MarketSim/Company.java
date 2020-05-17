package MarketSim;


public class Company {
	
	
	
	//info
	private String coName;
	private int companyID;
	private int numberOfShares;
	private int sharePrice;
	
	public Company(int id, String name, int share, int price) {
		companyID = id;
		coName = name;
		numberOfShares = share;
		sharePrice = price;
	}
	
	
	
	//Getters
	public String getCoName() {
		return coName;
	}
	
	public int getCompanyID() {
		return companyID;
	}
	
	public int getNumberOfShares() {
		return numberOfShares;
	}
	
	public int getSharePrice() {
		return sharePrice;
	}
	

	//Setters
	public void setCoName(String coName) {
		this.coName = coName;
	}
	
	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}
	
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	

	public String toString() {
		return "name: " + coName + " | ID: " + companyID + " | Shares: " + numberOfShares + " | Price: " + sharePrice;
	}
	
	
}
