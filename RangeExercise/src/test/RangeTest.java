package test;

import com.RangeExercise;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class RangeTest {

	/*
	 * @Test public void testRangeExercise() { String[] ranges = {"94133,94133",
	 * "94200,94299", "94600,94699","94230,94270"}; List<String> outputRanges = new
	 * ArrayList<String>(); outputRanges.add("94133,94133");
	 * outputRanges.add("94200,94299"); outputRanges.add("94600,94699");
	 * assertEquals(RangeExercise.mainCaller(ranges),outputRanges); }
	 */

	/*
	 * @Test public void testRangeExercise1() { String[] ranges1 = {"94133,94133",
	 * "94200,94299", "94600,94699","94599,94700"}; List<String> outputRanges1 = new
	 * ArrayList<String>(); outputRanges1.add("94133,94133");
	 * outputRanges1.add("94200,94299"); outputRanges1.add("94599,94700");
	 * assertEquals(RangeExercise.mainCaller(ranges1),outputRanges1); }
	 */

	@Test
	public void testRangeExercise2() {
		String[] ranges2 = { "94133,94133", "94200,94299", "94600,94699", "94550,94699" };
		List<String> outputRanges2 = new ArrayList<String>();
		outputRanges2.add("94133,94133");
		outputRanges2.add("94200,94299");
		outputRanges2.add("94550,94699");
		assertEquals(RangeExercise.mainCaller(ranges2), outputRanges2);
	}

}