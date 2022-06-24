package com.example.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name ="dish")
public class DishesDomain {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name;
//	private List<String> ingredients;
	private String type;
	@Id
	private int id;

	public DishesDomain() {
		// TODO Auto-generated constructor stub
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


//	public List<String> getIngredients() {
//		return ingredients;
//	}
//
//
//	public void setIngredients(List<String> ingredients) {
//		this.ingredients = ingredients;
//	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "DishesDomain [id=" + id + ", name=" + name + ", ingredients=" + null + ", type=" + type + "]";
	}
	
	
}
