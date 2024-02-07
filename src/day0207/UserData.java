package day0207;

import java.io.Serializable;


public class UserData implements Serializable{

	private /* transient */ String name;
	private double height;
	private transient double weight;
	
	public UserData() {
		// TODO Auto-generated constructor stub
	}
	
	
	public UserData(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "UserData [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
}
