package com.virtusa.traderapi.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TraderInput {
	private String firstName;
	private String lastName;
	private String middleName;
	private long tradingLimit;
	private String email;
	private String dob;
}
