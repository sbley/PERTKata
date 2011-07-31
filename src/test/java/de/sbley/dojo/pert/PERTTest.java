package de.sbley.dojo.pert;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.StringReader;
import java.io.StringWriter;

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

	@Test
	public void writesEstimateToWriter() throws Exception {
		StringWriter sw = new StringWriter();
		Estimate e = new Estimate(2F, 1.5F);
		new PERT().write(e, sw);
		assertThat(sw.toString(), containsString("m = 2.0"));
		assertThat(sw.toString(), containsString("s = 1.5"));
		sw.close();
	}
}
