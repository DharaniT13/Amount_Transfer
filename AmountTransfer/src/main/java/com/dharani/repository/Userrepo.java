package com.dharani.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.dharani.model.User;

public interface Userrepo extends JpaRepository<User, Integer> 
{
	User findByName(String name);
	
	@Transactional
	@Modifying
	@Query("update User set balance=?1 where account_id=?2")
	Integer updatebalance(int balance,int account_id);

}
