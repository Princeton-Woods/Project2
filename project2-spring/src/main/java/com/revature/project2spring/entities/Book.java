package com.revature.project2spring.entities;

import javax.persistence.Column;
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
	@Column(length = 2000)
	private String summary;
	@Column(length = 300)
	private String image;
	private double price;
}
