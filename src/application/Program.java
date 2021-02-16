package application;

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
	}

}
