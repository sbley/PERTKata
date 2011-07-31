package de.sbley.dojo.pert;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ProbabilityTest {

	@Test
	public void expectationIs0IfAllEstimatesAre0() throws Exception {
		assertThat(Probability.expectation(0, 0, 0), is(0F));
	}

	@Test
	public void expectationIs1IfAllEstimatesAre1() throws Exception {
		assertThat(Probability.expectation(1, 1, 1), is(1F));
	}

	@Test
	public void expectationIs2IfEstimatesAreO3N1P5() throws Exception {
		assertThat(Probability.expectation(3, 1, 5), is(2F));
	}
}
