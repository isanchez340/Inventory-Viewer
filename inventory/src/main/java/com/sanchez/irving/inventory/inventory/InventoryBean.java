package com.sanchez.irving.inventory.inventory;

public class InventoryBean {
	private int ID;
	private String Name;
	private String Size;
	private double price;
	private String Description;
	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the size
	 */
	public String getSize() {
		return Size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		Size = size;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
	}
	public InventoryBean(int iD, String name, String size, double price, String description) {
		super();
		ID = iD;
		Name = name;
		Size = size;
		this.price = price;
		Description = description;
	}
	
	
}
