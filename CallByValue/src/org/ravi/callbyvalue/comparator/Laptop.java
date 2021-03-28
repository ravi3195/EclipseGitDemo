package org.ravi.callbyvalue.comparator;

public class Laptop implements Comparable<Laptop>
{
	private String brand;
	private int ram;
	private long price;
	private String hardDisk;
	
	
	public Laptop(String brand, int ram, long price, String hardDisk) 
	{
		this.brand = brand;
		this.ram = ram;
		this.price = price;
		this.hardDisk = hardDisk;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + ", hardDisk=" + hardDisk + "]";
	}

	@Override
	public int compareTo(Laptop lap2) 
	{
		// this>lap2 +ve number, this< lap2 -ve number, if equal then return )
		if(this.getPrice()> lap2.getPrice())
			return 1;
		else if(this.getPrice()<lap2.getPrice())
			return -1;
		else 
			return 0;
	}
	
	
	
	
	

}
