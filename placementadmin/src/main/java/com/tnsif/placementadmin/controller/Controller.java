package com.tnsif.placementadmin.controller;

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
	import com.tnsif.placementadmin.model.Model;
	import com.tnsif.placementadmin.service.PlacementService;

	@RestController
	@RequestMapping("/api/shop")
	@CrossOrigin(origins = "*") 
	public class Controller {
		 @Autowired
		    private PlacementService Service;

		    @GetMapping
		    public List<Model> getAllShops() {
		        return Service.getAllShops();
		    }

		    @GetMapping("/{id}")
		    public Model getShopById(@PathVariable Long id) {
		        return Service.getShopById(id);
		    }

		    @PostMapping
		    public Model addShop(@RequestBody Model model) {
		        return Service.addShop(model);
		    }

		    @PutMapping("/{id}")
		    public Model updateShop(@PathVariable Long id, @RequestBody Model shopDetails) {
		        return Service.updateShop(id, shopDetails);
		    }

		    @DeleteMapping("/{id}")
		    public void deleteShop(@PathVariable Long id) {
		        Service.deleteShop(id);
}
	}
