package pojo_classes;

import java.util.*;

public class SetStd {

	private String name ;
	private int id ;
	private double percentage ;
	
	public SetStd() {
		
		
	}
	
	public SetStd(String name ,int id ,double percentage) {
		
		this.name = name ;
		this.id = id ;
		this.percentage = percentage ;
		
	}
	
	public String getName() { return name; }
    public int getId() { return id; }
    public double getPercentage() { return percentage; }
	
	public void setName (String name ) {
		
	this.name = name ;
	
	}
	
	public void setId(int id) {
		
		this.id = id ;
		
	}
	
	public void setPer(double percentage ) {
		
		this.percentage = percentage ;
	}
	
	@Override 
	public String toString() {
		
		return "Student Name : "+name+" Student ID : "+id+" Student Percentage : "+percentage ;
		
	}
	
}
