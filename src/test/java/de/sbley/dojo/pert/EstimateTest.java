package de.sbley.dojo.pert;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class EstimateTest {

	@Test
	public void savesConstructorInputInFields() throws Exception {
		Estimate e = new Estimate(1F, 2F);
		assertThat(e.getExpectation(), is(1F));
		assertThat(e.getDeviation(), is(2F));
	}
}
