package com.virtusa.traderapi.mutations;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.virtusa.traderapi.models.FullName;
import com.virtusa.traderapi.models.Trader;
import com.virtusa.traderapi.models.TraderInput;
import com.virtusa.traderapi.services.TraderService;

@Component
public class TraderMutationResolver implements GraphQLMutationResolver{
	@Autowired
	private TraderService traderService;
	
	
	public Trader createTrader(TraderInput traderInput) {
		Trader traderObj = new Trader();
		FullName fullNameObj = new FullName(traderInput.getFirstName(), traderInput.getLastName(), traderInput.getMiddleName());
		traderObj.setDob(LocalDate.parse(traderInput.getDob()));
		traderObj.setEmail(traderInput.getEmail());
		traderObj.setName(fullNameObj);
		traderObj.setTradingLimit(traderInput.getTradingLimit());
		return this.traderService.addTrader(0, traderObj);
	}
	
}
