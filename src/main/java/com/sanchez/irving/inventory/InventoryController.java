package com.sanchez.irving.inventory;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="https://isanchez340.github.io")
@RestController
public class InventoryController {
	@Autowired
	private InventoryService inventoryService;
	
	@Autowired
	private InventoryJpaRepository InventoryRepository;
	
	@GetMapping("/getlist")
	public List<InventoryBean> getAll() {
		return InventoryRepository.findAll();
	}
	
	@GetMapping("/update")
	@PostConstruct
	public boolean update() {
		inventoryService.updateList(InventoryRepository);
		return true;
	}
}
