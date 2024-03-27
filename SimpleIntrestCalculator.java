package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleIntrestCalculator {
	
	
	BigDecimal principal;
	BigDecimal interest;

	public SimpleIntrestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		// Total value = principal + principal* interest * noOfYearts
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
		BigDecimal totalValue = principal.add(
				principal.multiply(interest)
				.multiply(noOfYearsBigDecimal));
		return totalValue;
	}

}
