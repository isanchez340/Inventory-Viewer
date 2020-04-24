package com.sanchez.irving.inventory;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class InventoryService {

	private static List<InventoryBean> InventoryList = new ArrayList<InventoryBean>();
	
	public List<InventoryBean> getAll() throws IOException{
		URL url = new URL("https://isanchez340.github.io/Inventory.txt");
		Scanner scanner = new Scanner(url.openStream());
		while(scanner.hasNext()) {
			String line = scanner.next();
			System.out.println(line);
			//InventoryList.add(new InventoryBean())
		}
		scanner.close();
		
		return InventoryList;
		
	}
}