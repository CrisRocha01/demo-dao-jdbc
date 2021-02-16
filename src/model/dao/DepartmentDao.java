package model.dao;

import java.util.List;

import model.entity.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deleById(Integer id);
	Department finById(Integer id);
	List<Department> findAll();

}
