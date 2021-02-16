package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entity.Department;
import model.entity.Seller;

public class Program {
	public static void main(String[] args) {
		
		Department test = new Department(1, "test");
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.finById(3);
		
		System.out.println(test);
		
		System.out.println(seller);
	}

}
