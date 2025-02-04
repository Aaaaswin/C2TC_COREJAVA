package com.tnsif.placementadmin.repository;
import com.tnsif.placementadmin.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

	public interface PlacementRepository extends JpaRepository<Model, Long> {
	}
