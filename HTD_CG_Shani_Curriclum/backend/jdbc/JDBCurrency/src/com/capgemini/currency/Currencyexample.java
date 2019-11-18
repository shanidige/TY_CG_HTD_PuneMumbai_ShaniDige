package com.capgemini.currency;

import java.util.Currency;
import java.util.Set;

public class Currencyexample {
	public static void main(String[] args) {
		Currency currencycode1 = Currency.getInstance("INR");
		Currency currencycode2 = Currency.getInstance("USD");
		String currencycode1symbol = currencycode1.getSymbol();
		String currencycode2symbol = currencycode2.getSymbol();
		System.out.println(currencycode1symbol);
		System.out.println(currencycode2symbol);

		System.out.println("*******************>>>>>>>>>>>>>>>");

		String currencycode1DisplayName = currencycode1.getDisplayName();
		String currencycode2DisplayName = currencycode2.getDisplayName();
		System.out.println(currencycode1DisplayName);
		System.out.println(currencycode2DisplayName);

		System.out.println("*******************>>>>>>>>>>>>>>>>>>>");

		Set<Currency> currrencies = Currency.getAvailableCurrencies();
		System.out.println(currrencies);
		System.out.println();

		int currencycode1DefaultFraction = currencycode1.getDefaultFractionDigits();
		int currencycode2DefaultFraction = currencycode2.getDefaultFractionDigits();
		System.out.println("DefaultFractionDigits = " + currencycode1DefaultFraction);
		System.out.println("DefaultFractionDigits = " + currencycode2DefaultFraction);
	}

}
