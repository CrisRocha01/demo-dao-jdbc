package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entity.Department;
import model.entity.Seller;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.finById(3);
		
		System.out.println(" === TEST 1: seller findById === ");
		System.out.println(seller);
		

		System.out.println("\n === TEST 2: seller findByDepartment === ");
		Department department = new Department(2, null);
		
		List<Seller>list = sellerDao.findByDepartment(department);
		
		for(Seller s: list) {
			System.out.println(s);
		}
		
		System.out.println("\n === TEST 3: seller findAll === ");
		
		list = sellerDao.findAll();
		
		for(Seller s: list) {
			System.out.println(s);
		}
		
		System.out.println("\n === TEST 4:  seller insert === ");
		
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n === TEST 5:  seller updadte === ");
		seller = sellerDao.finById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update Completed");
		
		System.out.println("\n === TEST 6:  seller delete === ");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleById(id);
		System.out.println("Delete completed");
		
		
		sc.close();
		
	}

}
