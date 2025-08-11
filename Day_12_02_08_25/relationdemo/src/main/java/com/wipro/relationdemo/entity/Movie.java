package com.wipro.relationdemo.entity;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import lombok.*;

@Entity
@Table(name="movie")
@Data
public class Movie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	 
	@Column(name="movie_title")
	String  movieTitle;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
	        name = "movie_genre",
	        joinColumns = @JoinColumn(name = "movie_id"),
	        inverseJoinColumns = @JoinColumn(name = "genre_id")
	    )
	
	Set<Genre> genre;


}
