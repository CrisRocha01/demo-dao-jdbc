package application;

import java.util.Date;

import model.entity.Department;
import model.entity.Seller;

public class Program {
	public static void main(String[] args) {
		
		Department test = new Department(1, "test");
		
		Seller seller = new Seller(21, "bob", "bob@gmai.com", new Date(), 3000.00, test);
		
		System.out.println(test);
		
		System.out.println(seller);
	}

}
