package com.revature.bankingApplication.daos;

import com.revature.bankingApplication.models;//Have to import Account


import com.revature.monster_lab.util.collections.List;// These are the custom collections we will get on monday?


public class AccountDAO implements CrudDAO{
	

		// TODO: Implement search by creatorID
		public List<Account> findMonsterByCreatorId(String id){
			return null;
		}

		@Override
		public Account create(Account newAccount) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Account> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Account findById(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean update(Account updatedAccount) {
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
