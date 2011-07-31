package de.sbley.dojo.pert;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ProbabilityTest {

	@Test
	public void expectationIs0IfAllEstimatesAre0() throws Exception {
		assertThat(Probability.expectation(0, 0, 0), is(0F));
	}
}
