package main.model;

public class UserBalance {
	private String firstName;
	private String lastName;
	private Double balance;
	
	public UserBalance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserBalance(String firstName, String lastName, Double balance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
}
