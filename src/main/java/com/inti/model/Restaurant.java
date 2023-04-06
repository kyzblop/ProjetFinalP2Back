package com.inti.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.ToString.Exclude;

@Entity @Table(name = "a_restaurantP2")
@Data
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_r;
	private double prix_l; 
	private String nom;
	private String adresse;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_ville")
	@Exclude
	private Ville ville;
	
	
	
	
}
