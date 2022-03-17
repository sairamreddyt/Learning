package com.example.repository;

import org.springframework.stereotype.Repository;
import com.example.entity.HobbyEntity;

@Repository
public interface HobbyRepository extends JpaRepository<HobbyEntity, Integer>{

	@Query("select h.name from HobbyEntity h where h.personId=:personId")
	public String findByPersonId(int personId);
}