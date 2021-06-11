package com;

import java.util.ArrayList;
import java.util.List;

public class MainCaller {

	public static void main(String[] args) {
		String[] ranges2 = { "94133,94133", "94200,94299", "94600,94699", "94550,94699" };
		List<String> outputRanges2 = new ArrayList<String>();
		outputRanges2.add("94133,94133");
		outputRanges2.add("94200,94299");
		outputRanges2.add("94550,94699");
		RangeExercise.mainCaller(ranges2);

	}

}
