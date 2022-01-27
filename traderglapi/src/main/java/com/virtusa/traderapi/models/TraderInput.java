package com.virtusa.traderapi.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TraderInput {
	private FullName fullName;
	private long tradingLimit;
	private String email;
	private LocalDate dob;
}
