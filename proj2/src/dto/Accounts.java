package dto;

public class Accounts {
	String accountNumber;
	String accountType;
	String customername;
	float balance;
	public Accounts(String accountNumber, String accountType, String customername, float balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.customername = customername;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Accounts [accountNumber=" + accountNumber + ", accountType=" + accountType + ", customername="
				+ customername + ", balance=" + balance + "]";
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public Accounts(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}
	

}