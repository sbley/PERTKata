package de.sbley.dojo.pert;

public class PERT {

	public Estimate estimate(int optimistic, int nominal, int pessimistic) {
		return new Estimate(Probability.expectation(optimistic, nominal,
				pessimistic), Probability.deviation(optimistic, nominal,
				pessimistic));
	}

}
