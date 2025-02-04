package com.tnsif.admin.repository;

import com.tnsif.admin.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {
}
