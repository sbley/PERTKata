package de.sbley.dojo.pert;

public class Estimate {

	private final float expectation;
	private final float deviation;

	public Estimate(float expectation, float deviation) {
		this.expectation = expectation;
		this.deviation = deviation;
	}

	public float getExpectation() {
		return expectation;
	}

	public float getDeviation() {
		return deviation;
	}

}
