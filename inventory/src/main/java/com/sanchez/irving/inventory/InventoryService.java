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
	
	public List<InventoryBean> getAll(){
		return InventoryList;
	}
	
	public void updateList() {
		InventoryList = new ArrayList<InventoryBean>();
		URL url;
		try {
			url = new URL("https://isanchez340.github.io/Inventory.txt");
			Scanner scanner = new Scanner(url.openStream());
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] info = line.split("	");
				try {
				InventoryList.add(new InventoryBean(info[0], info[1], info[2],
						info[3], info[4], info[5], info[6], info[7]));
				} catch(ArrayIndexOutOfBoundsException exception) {
					
				}
			}
			scanner.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}