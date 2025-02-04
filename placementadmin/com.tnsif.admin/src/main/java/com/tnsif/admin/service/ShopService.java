package com.tnsif.admin.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tnsif.admin.service.ShopService;
import com.tnsif.admin.repository.*;
import com.tnsif.admin.model.*;

import java.util.List;
@Service
public class ShopService {
    @Autowired
    private ShopRepository shopRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public List<Shop> getAllShops() {
        return shopRepository.findAll();
    }

    public Shop getShopById(Long id) {
        return shopRepository.findById(id).orElse(null);
    }

    public Shop addShop(Shop shop) {
        return shopRepository.save(shop);
    }

    public Shop updateShop(Long id, Shop shopDetails) {
        Shop shop = shopRepository.findById(id).orElse(null);
        if (shop != null) {
            shop.setName(shopDetails.getName());
            shop.setOwner(shopDetails.getOwner());
            shop.setCategory(shopDetails.getCategory());
            shop.setRent(shopDetails.getRent());
            shop.setMobileNo(shopDetails.getMobileNo());
            shop.setFloorNo(shopDetails.getFloorNo());
            shop.setShopNo(shopDetails.getShopNo());
            shop.setWorkers(shopDetails.getWorkers());
            return shopRepository.save(shop);
        }
        return null;
    }

    public void deleteShop(Long id) {
        shopRepository.deleteById(id);
        resetShopSequence();  // Reset sequence after deletion
    }

    // Reset the sequence after a shop is deleted
    private void resetShopSequence() {
        entityManager.createNativeQuery("SELECT setval('shop_id_seq', (SELECT MAX(id) FROM Shop))")
                     .executeUpdate();
    }
}
