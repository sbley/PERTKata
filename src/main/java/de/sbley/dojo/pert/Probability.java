package de.sbley.dojo.pert;

public class Probability {

	public static float expectation(int optimistic, int nominal, int pessimistic) {
		return (optimistic + 4 * nominal + pessimistic) / 6F;
	}

}
