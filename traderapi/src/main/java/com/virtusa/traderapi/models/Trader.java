package com.virtusa.traderapi.models;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Trader {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Trader_Id")
	private long traderId;
	@Embedded 
	//value object - a queryable object
	private FullName name;
	@Column(name="Trading")
	private long tradingLimit;
	@Column(name="Email")
	private String email;
	
}
