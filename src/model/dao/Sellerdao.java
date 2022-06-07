package model.dao;

import java.util.List;

import model.entities.Seller;

public interface Sellerdao {


	
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer obj);
	Seller findById(Integer id);
	List<Seller> findAll();
}
