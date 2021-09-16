package com.revature.project2spring.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
	@Id
	private Long isbn;
	private String title;
	private String author;
	private String summary;
	private String image;
	private double price;
}
