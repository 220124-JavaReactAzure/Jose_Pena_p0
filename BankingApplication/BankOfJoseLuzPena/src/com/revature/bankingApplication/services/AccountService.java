package com.revature.bankingApplication.services;

import com.revature.monster_lab.daos.MonsterDAO;
import com.revature.monster_lab.models.Monster;
import com.revature.monster_lab.services.ScientistService;
import com.revature.monster_lab.util.collections.List;

public class AccountService {
	
		
		private final AccountDAO accountDAO;
		private final ClientService clientService;
		
		public AccountService(AccountDAO accountDAO, ClienService clientService) {
			this.accountDAO = accountDAO;
			this.clientService = clientService;
		}
		
		// TODO: Monster Creation implementation
		public Monster createMonster(Monster newMonster) {
			return null;
		}
		
		private boolean isMonsterValid(Monster newMonster) {
			
			if(newMonster == null) return false;
			if(newMonster.getMonsterName() == null || newMonster.getMonsterName().trim().equals("")) return false;
			if(newMonster.getDexterity() == null || newMonster.getDexterity().trim().equals("") || Integer.valueOf(newMonster.getDexterity()) > 20 || Integer.valueOf(newMonster.getDexterity()) < 0) return false;
			return newMonster.getIntelligence() != null || !newMonster.getIntelligence().trim().equals("");
		}
		
		public List<Monster> findMyMonsters(){
			return null;
		}
		
		public List<Monster> findAllMonsters(){
			return null;
		}


}
