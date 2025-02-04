package com.tnsif.placementadmin.service;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tnsif.placementadmin.repository.PlacementRepository;
import com.tnsif.placementadmin.model.Model;

import java.util.List;

	@Service
	public class PlacementService {
	    @Autowired
	    private PlacementRepository placementRepository;

	    @PersistenceContext
	    private EntityManager entityManager;

	    public List<Model> getAllShops() {
	        return placementRepository.findAll();
	    }

	    public Model getShopById(Long id) {
	        return placementRepository.findById(id).orElse(null);
	    }

	    public Model addShop(Model model) {
	        return placementRepository.save(model);
	    }

	    public Model updateShop(Long id, Model shopDetails) {
	        Model shop = placementRepository.findById(id).orElse(null);
	        if (shop != null) {
	            shop.setName(shopDetails.getName());
	            shop.setCategory(shopDetails.getCategory());
	            shop.setRent(shopDetails.getRent());
	            shop.setMobileNo(shopDetails.getMobileNo());
	            shop.setFloorNo(shopDetails.getFloorNo());
	            shop.setShopNo(shopDetails.getShopNo());
	            shop.setWorkers(shopDetails.getWorkers());
	            return placementRepository.save(shop);
	        }
	        return null;
	    }

	    public void deleteShop(Long id) {
	    	placementRepository.deleteById(id);
	        resetShopSequence();  // Reset sequence after deletion
	    }

	    // Reset the sequence after a shop is deleted
	    private void resetShopSequence() {
	        entityManager.createNativeQuery("SELECT setval('shop_id_seq', (SELECT MAX(id) FROM Shop))")
	                     .executeUpdate();
}
}