package MarketSim;

public class Companies {
	
	//info
	private String coName;
	private int companyID;
	private int numberOfShares;
	private int sharePrice;
	
	
	
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
	

	
	
	
	public void printCompany() {
		System.out.println("Company ID: " + getCompanyID() + " || " + "Company Name: " + getCoName());
	}
	
}
