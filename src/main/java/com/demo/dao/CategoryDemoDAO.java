package com.demo.dao;

import java.util.List;

import com.demo.model.CategoryDemo;

public interface CategoryDemoDAO {

	void saveOrUpdate(CategoryDemo categoryDemo);
	
	void delete(String id);
	
	CategoryDemo get(String id);
	
	List<CategoryDemo> list();
	
}
