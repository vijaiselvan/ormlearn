package com.cognizant.ormlearn.model;

import java.sql.Date;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@Data

@Entity
@Table(name = "stock")
@DynamicUpdate
public class Stock {

	@Id
	@Column(name = "st_id")
	private int id;
	@Column(name = "st_code")
	private String code;
	@Column(name = "st_date")
	private Date date;
	@Column(name = "st_open")
	private BigDecimal open;
	@Column(name = "st_close")
	private BigDecimal close;
	@Column(name = "st_volume")
	private BigDecimal volume;

}
