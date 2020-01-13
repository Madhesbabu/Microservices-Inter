package main.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="USERS1")
@JsonFormat(shape=JsonFormat.Shape.ARRAY)
public class Users {

	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String address1;
	private String address2;
	
	@OneToMany(mappedBy = "user")
	private List<Accounts> accountsList;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(Long id, String firstName, String lastName, String email, String phoneNumber, String address1,
			String address2, List<Accounts> accountsList) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address1 = address1;
		this.address2 = address2;
		this.accountsList = accountsList;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public List<Accounts> getAccountsList() {
		return accountsList;
	}
	public void setAccountsList(List<Accounts> accountsList) {
		this.accountsList = accountsList;
	}
	
	
}
