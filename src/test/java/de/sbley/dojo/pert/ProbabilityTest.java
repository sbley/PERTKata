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
	public void expectationIs2IfEstimatesAreO1N2P3() throws Exception {
		assertThat(Probability.expectation(1, 2, 3), is(2F));
	}

	@Test
	public void expectationIs3IfEstimatesAreO1N3P5() throws Exception {
		assertThat(Probability.expectation(1, 3, 5), is(3F));
	}

	@Test
	public void deviationIs0IfAllEstimatesAre0() throws Exception {
		assertThat(Probability.deviation(0, 0, 0), is(0F));
	}
}
