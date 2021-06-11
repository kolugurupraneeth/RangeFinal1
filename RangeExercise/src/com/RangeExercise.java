package com;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RangeExercise {

	private static List<String> outputRange = new ArrayList<String>();

	// The method that calls the main() method
	public static List<String> mainCaller(String[] ranges) {

		// Calling the main() method

		return main(ranges);
	}

	public static List<String> main(String[] args) {

		// input ranges for the program
		List<String> inputRanges = new ArrayList<String>();
		for (String str : args) {
			inputRanges.add(str);
		}
		System.out.println("inputRanges!" + inputRanges.toString());
		// validating each range by calling compareRange function
		for (int i = 0; i < inputRanges.size(); i++) {
			compareRange(inputRanges.get(i));
		}

		// removing duplicate ranges
		Set<String> outputset = new LinkedHashSet<String>(outputRange);
		outputRange = new ArrayList<String>();
		for (String s : outputset)
			outputRange.add(s);

		// printing and returning the results
		System.out.println(outputRange.toString());
		return outputRange;

	}

	public static void compareRange(String range) {

		boolean addValueToOutputRange = false;
		// adding the initial range to the output range
		if (outputRange.size() == 0) {
			outputRange.add(range);
		} else {

			String splitString[] = range.split(",");
			// obtaining the min and the max input range
			int minRange = Integer.parseInt(splitString[0]);
			int maxRange = Integer.parseInt(splitString[1]);

			for (int i = 0; i < outputRange.size(); i++) {
				String splitoutString[] = outputRange.get(i).split(",");
				int minoutRange = Integer.parseInt(splitoutString[0]);
				int maxoutRange = Integer.parseInt(splitoutString[1]);

				// if the input range is already accomodated in the existing
				// output ranges no need to add the range to the output
				if (minRange > minoutRange && maxRange < maxoutRange) {
					addValueToOutputRange = false;
					break;
				}

				// if the input range accomodates the existing
				// output ranges need to replace output range with the input range
				if (minRange <= minoutRange && maxRange >= maxoutRange) {
					String newvalue = minRange + "," + maxRange;
					outputRange.set(i, newvalue);
				}

				// if the input range and be accomodated by expanding the existing
				// min range for the output range
				if (minRange > minoutRange && maxRange >= maxoutRange && minRange < maxoutRange) {
					String newvalue = minoutRange + "," + maxRange;
					outputRange.set(i, newvalue);
					addValueToOutputRange = false;
					break;
				}

				// if the input range and be accomodated by expanding the existing
				// max range for the output range
				if (minRange <= minoutRange && maxRange < maxoutRange && maxRange > minoutRange) {
					String newvalue = minRange + "," + maxoutRange;
					outputRange.set(i, newvalue);
					addValueToOutputRange = false;
					break;
				}

				// condition where input range is less than all the ranges in the output
				// so adding the range to the output ranges
				if (minRange <= minoutRange && minRange <= maxoutRange && maxRange <= minoutRange
						&& maxRange <= maxoutRange) {
					addValueToOutputRange = true;
				}

				// condition where input range is more than all the ranges in the output
				// so adding the range to the output ranges
				if (minRange >= minoutRange && minRange >= maxoutRange && maxRange >= minoutRange
						&& maxRange >= maxoutRange) {
					addValueToOutputRange = true;
				}
			}

			if (addValueToOutputRange == true) {
				outputRange.add(minRange + "," + maxRange);
			}
		}
	}
}