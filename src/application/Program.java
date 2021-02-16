package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entity.Department;
import model.entity.Seller;

public class Program {
	public static void main(String[] args) {
		
		
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
		
		
	}

}
