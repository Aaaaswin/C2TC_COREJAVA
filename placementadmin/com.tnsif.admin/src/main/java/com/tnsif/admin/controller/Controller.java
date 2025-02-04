package com.tnsif.admin.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tnsif.admin.model.Shop;
import com.tnsif.admin.service.ShopService;

@RestController
@RequestMapping("/api/shop")
@CrossOrigin(origins = "*") 
public class Controller {
	 @Autowired
	    private ShopService shopService;

	    @GetMapping
	    public List<Shop> getAllShops() {
	        return shopService.getAllShops();
	    }

	    @GetMapping("/{id}")
	    public Shop getShopById(@PathVariable Long id) {
	        return shopService.getShopById(id);
	    }

	    @PostMapping
	    public Shop addShop(@RequestBody Shop shop) {
	        return shopService.addShop(shop);
	    }

	    @PutMapping("/{id}")
	    public Shop updateShop(@PathVariable Long id, @RequestBody Shop shopDetails) {
	        return shopService.updateShop(id, shopDetails);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteShop(@PathVariable Long id) {
	        shopService.deleteShop(id);
	    }
}
