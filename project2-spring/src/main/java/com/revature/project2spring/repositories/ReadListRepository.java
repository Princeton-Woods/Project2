package com.revature.project2spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.project2spring.entities.ReadList;


@Repository
public interface ReadListRepository extends JpaRepository<ReadList, Long>{
	public List<ReadList> findByUserUserId(Long userId);
}
