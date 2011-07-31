package de.sbley.dojo.pert;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Locale;
import java.util.Scanner;

public class PERT {

	public Estimate estimate(Reader reader) {
		Scanner scanner = new Scanner(reader);
		return estimate(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
	}

	public Estimate estimate(int optimistic, int nominal, int pessimistic) {
		return new Estimate(Probability.expectation(optimistic, nominal,
				pessimistic), Probability.deviation(optimistic, nominal,
				pessimistic));
	}

	public void write(Estimate estimate, Writer writer) throws IOException {
		writer.write(String.format(Locale.ENGLISH, "m = %.1f, s = %.1f",
				estimate.getExpectation(), estimate.getDeviation()));
	}

	/**
	 * Reads your estimates from console input (optimistic, nominal and
	 * pessimistic estimate; space-separated) and outputs expected duration and
	 * standard variation to console.
	 * <p>
	 * Example:
	 * </p>
	 * 
	 * <pre>
	 * $ 1 2 3
	 * $ m = 2.0, s = 0.3
	 * </pre>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Reader reader = new InputStreamReader(System.in);
		Writer writer = new OutputStreamWriter(System.out);
		PERT pert = new PERT();
		Estimate estimate = pert.estimate(reader);
		try {
			pert.write(estimate, writer);
		} catch (IOException e) {
			System.err.println("Error while writing to console.");
		}
		try {
			reader.close();
			writer.close();
		} catch (IOException e) {
		}
	}
}
