package MarketSim;

public class Companies {
	
	//ID
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
	
	public void setCoName(String coName) {
		this.coName = coName;
	}
	

	//Setters
	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}
	
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	
	public int getSharePrice() {
		return sharePrice;
	}
	
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	
	
	
}
