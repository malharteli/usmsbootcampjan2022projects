package com.virtusa.traderapi.vos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//DTO
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {

	private String token;


	public String getToken() {
		return token;
	}

}
