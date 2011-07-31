package de.sbley.dojo.pert;

import java.io.Reader;
import java.util.Scanner;

public class PERT {

	public Estimate estimate(int optimistic, int nominal, int pessimistic) {
		return new Estimate(Probability.expectation(optimistic, nominal,
				pessimistic), Probability.deviation(optimistic, nominal,
				pessimistic));
	}

	public Estimate estimate(Reader reader) {
		Scanner scanner = new Scanner(reader);
		return estimate(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
	}

}
