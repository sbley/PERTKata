package de.sbley.dojo.pert;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.StringReader;

import org.junit.Test;

public class PERTTest {
	@Test
	public void estimateContainsExpectationAndDeviation() throws Exception {
		Estimate e = new PERT().estimate(1, 2, 3);
		assertThat(e.getExpectation(), is(2F));
		assertThat(e.getDeviation(), is(1 / 3F));
	}

	@Test
	public void estimateReadsInputValuesFromAReader() throws Exception {
		Estimate e = new PERT().estimate(new StringReader("1 2 3"));
		assertThat(e.getExpectation(), is(2F));
		assertThat(e.getDeviation(), is(1 / 3F));
	}
}
