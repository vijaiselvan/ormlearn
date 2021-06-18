package com.cognizant.ormlearn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data

@Entity
@Table(name = "country")
public class Country {

	@Id
	@Column(name = "co_code")
	private String code;
	
	@NonNull
	@Column(name = "co_name")
	private String name;

// getters and setters

// toString()

}