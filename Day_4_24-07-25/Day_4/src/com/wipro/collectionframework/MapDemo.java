package com.wipro.collectionframework;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> currencyMap = new TreeMap<>();
        currencyMap.put("USD", "United States Dollar");
        currencyMap.put("EUR", "Euro");
        currencyMap.put("JPY", "Japanese Yen");
        currencyMap.put("GBP", "British Pound");
        currencyMap.put("INR", "Indian Rupee");
        for (Map.Entry<String, String> entry : currencyMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }	}

}
