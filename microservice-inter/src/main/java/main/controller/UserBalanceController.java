package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import main.model.Accounts;
import main.model.UserBalance;
import main.model.Users;

@RestController
public class UserBalanceController {
	
	@Autowired
    private RestTemplate restTemplate;
	
	@GetMapping("/userBalance/{id}")
	public UserBalance getUserBalanceDetails(@PathVariable long id){
		UserBalance userBalance = new UserBalance();
		ResponseEntity<Users> users = restTemplate.getForEntity("http://microservice-crud/users/"+id+"/accounts/", Users.class);
		Users user = users.getBody();
		userBalance.setFirstName(user.getFirstName());
		userBalance.setLastName(user.getLastName());
		Double sum = 0.0;
		for(Accounts acc : user.getAccountsList()){
			sum += acc.getBalance(); 
		}
		userBalance.setBalance(sum);
		return userBalance;
	}
	
}
