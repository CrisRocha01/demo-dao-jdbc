package model.dao;

import java.util.List;

import model.entity.Seller;


public interface SellerDao {
	
	void insert(Seller obj);
	void update(Seller obj);
	void deleById(Integer id);
	Seller finById(Integer id);
	List<Seller> findAll();

}