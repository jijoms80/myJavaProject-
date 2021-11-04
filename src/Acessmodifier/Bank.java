package Acessmodifier;

public class Bank {
	private String name = " jijo";
	private int sinNo = 45698;
	private String address = " Hanson Road Canada";
   
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		
		this.name = name;
		
	}

	public int getSinNo() {
		return sinNo;
	}

	public void setSinNo(int sinNo) {
		if (sinNo > 10000 && sinNo < 20000) {
			this.sinNo = sinNo;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {

		if (address.contains("Canada")) {
			this.address = address;

		}

	}
}
