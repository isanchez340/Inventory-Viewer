package com.sanchez.irving.inventory;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping("/getlist")
	public List<InventoryBean> getAllTodo(@PathVariable String username) throws IOException {
		return inventoryService.getAll();
	}

}
