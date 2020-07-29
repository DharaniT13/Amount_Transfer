package com.dharani.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dharani.model.Transfer;

public interface TransferRepo extends JpaRepository<Transfer, Integer> 
{
	@Query(value="SELECT * FROM Transfer h ORDER BY h.transferid DESC LIMIT 0,5", nativeQuery = true)
	//@Query("select h from Transfer h order by h.transfer_id desc")
	List<Transfer> findByTop();
}
