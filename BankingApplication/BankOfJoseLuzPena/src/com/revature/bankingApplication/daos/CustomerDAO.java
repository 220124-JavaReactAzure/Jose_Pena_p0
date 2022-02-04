package com.revature.bankingApplication.daos;

import com.revature.monster_lab.daos.CrudDAO;
import com.revature.monster_lab.models.Monster;
import com.revature.monster_lab.util.collections.List;

	

public class CustomerDAO implements CrudDAO<Customer> {
	
	// TODO: Implement search by creatorID
	public List<Customer> findMonsterByCreatorId(String id){
		return null;
	}

	@Override
	public Customer create(Customer newCustomer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Customer updatedCustomer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
	
	

}
