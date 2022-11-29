package com.project.eb;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class EBRunnerPart2 {

	public static void main(String[] args) {
		System.out.println("Enter the number of Appliances : ");
		Scanner scan = new Scanner(System.in);
		int noOfAppliances = scan.nextInt();

		System.out.println("Appliances Codes Are :");
		System.out.println("RFG	Refrigerator\r\n" + "TV	TV\r\n" + "COM	Computer\r\n" + "MUS	Music System\r\n"
				+ "AC	A/C\r\n" + "WAS	Washing M/C\r\n" + "HEA	Water Heater\r\n" + "FAN	Fans\r\n"
				+ "TL	Tube Lights\r\n" + "CFL	CFL Lights\r\n" + "");

		System.out.println("Enter appliance codes (comma separated) ");
		String appCode = scan.next();
		String[] appliances = appCode.split(",");

		System.out.println("Enter usage in hours (comma separated) :");
		String hours = scan.next();
		String[] hour = hours.split(",");

		Map<String, Integer> codeUsageMap = new HashMap<>(appliances.length);
		for (int i = 0; i < appliances.length; i++) {
			codeUsageMap.put(appliances[i], Integer.parseInt(hour[i]));
		}
//		 System.out.println(codeUsageMap);

		Map<String, Integer> codePowerConsumptionMap = new HashMap<String, Integer>();
		codePowerConsumptionMap.put("RFG", 200);
		codePowerConsumptionMap.put("TV", 200);
		codePowerConsumptionMap.put("COM", 200);
		codePowerConsumptionMap.put("MUS", 1000);
		codePowerConsumptionMap.put("AC", 700);
		codePowerConsumptionMap.put("WAS", 200);
		codePowerConsumptionMap.put("HEA", 800);
		codePowerConsumptionMap.put("FAN", 50);
		codePowerConsumptionMap.put("TL", 50);
		codePowerConsumptionMap.put("CFL", 25);

//		 System.out.println(codePowerConsumptionMap);
		
		Map<String, String> codeValueMap = new LinkedHashMap();
		codeValueMap.put("RFG", "Refrigerator");
		codeValueMap.put("TV",  "TV          ");
		codeValueMap.put("COM", "Computer    ");
		codeValueMap.put("MUS", "Music System");
		codeValueMap.put("AC",  "A/C         ");
		codeValueMap.put("WAS", "Washing M/C ");
		codeValueMap.put("HEA", "Water Heater");
		codeValueMap.put("FAN", "Fans        ");
		codeValueMap.put("TL",  "Tube Lights ");
		codeValueMap.put("CFL", "CFL Lights  ");
//		System.out.println(codeValueMap);

		int units = 0;
		int totalUnit = 0;
		System.out.println("Consumption per appliance: ");
		for (Entry<String, Integer> codeUsage : codeUsageMap.entrySet()) {

//			System.out.println(codeUsage.getKey() + "   " + codeUsage.getValue());

//			System.out.println("Watts :" + codePowerConsumptionMap.get(codeUsage.getKey()));
//			System.out.println("Hours :" + codeUsageMap.get(codeUsage.getKey()));
			units = codeUsageMap.get(codeUsage.getKey()) * codePowerConsumptionMap.get(codeUsage.getKey()) / 1000;
			System.out.println(codeValueMap.get(codeUsage.getKey()) + " :" + units + " units");
			totalUnit = totalUnit + units;

		}
		System.out.println();
		System.out.println("Total consumption :" + totalUnit + " units");

		int billAmt = 0;
		if (totalUnit > 0) {
			if (totalUnit >= 1 && totalUnit <= 50) {
				billAmt = totalUnit * 3;
			} else if (totalUnit >= 51 && totalUnit <= 100) {
				billAmt = (50 * 3) + ((totalUnit - 50) * 5);
			} else if (totalUnit >= 101 && totalUnit <= 250) {
				billAmt = (50 * 3) + (50 * 5) + ((totalUnit - 100) * 7);

			} else if (totalUnit >= 251) {
				billAmt = (50 * 3) + (50 * 5) + (150 * 7) + ((totalUnit - 250) * 10);
			} else {
				System.out.println("Error");
			}

		}
		System.out.println("Total tariff      : " + "Rs " + billAmt);
		scan.close();
	}

}
