package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private String name;
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
