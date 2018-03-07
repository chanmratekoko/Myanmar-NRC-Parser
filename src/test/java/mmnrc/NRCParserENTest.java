package mmnrc;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NRCParserENTest {

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	public static NRCParserFactory factory;

	@BeforeClass
	public static void beforeClass() {
		factory = new NRCParserFactory("en");
	}

	@AfterClass
	public static void afterClass() {
		factory = null;
	}

	@Test
	public void format() throws NRCFormatException {

		NRCParser enNRCParser = factory.getParser();

		NRC nrc1 = enNRCParser.format("12/KAMATA(N)123456");

		Language language = Language.MYANMAR;

		System.out.println(nrc1.getFormat(language));
	}

	@Test(expected = IllegalArgumentException.class)
	public void nullExpection() throws NRCFormatException {
		NRCParser enNRCParser = factory.getParser();
		enNRCParser.format("");
	}

	@Test
	public void invalidNRCC() {
		new ExpecteNRCFormatExceptionAsserter(NRCFormatError.INVALID_NRC) {
			@Override
			protected void expectException() throws NRCFormatException {
				NRCParser enNRCParser = factory.getParser();
				enNRCParser.format("hello world");
			}
		}.run();
	}

	@Test
	public void invalidNaing() {
		new ExpecteNRCFormatExceptionAsserter(NRCFormatError.INVALID_NAING) {
			@Override
			protected void expectException() throws NRCFormatException {
				NRCParser enNRCParser = factory.getParser();
				enNRCParser.format("12/KAMATA(O)123456");
			}
		}.run();
	}

	@Test
	public void requiredNaing() {
		new ExpecteNRCFormatExceptionAsserter(NRCFormatError.REQUIRED_NAING) {
			@Override
			protected void expectException() throws NRCFormatException {
				NRCParser enNRCParser = factory.getParser();
				enNRCParser.format("12/KAMATA()123456");
			}
		}.run();
	}

	@Test
	public void requiredStateValue() {
		new ExpecteNRCFormatExceptionAsserter(NRCFormatError.REQUIRED_STATE_VALUE) {
			@Override
			protected void expectException() throws NRCFormatException {
				NRCParser enNRCParser = factory.getParser();
				enNRCParser.format("/KAMATA(N)123456");
			}
		}.run();
	}

	@Test
	public void invalidStateValue() {
		new ExpecteNRCFormatExceptionAsserter(NRCFormatError.INVALID_STATE) {
			@Override
			protected void expectException() throws NRCFormatException {
				NRCParser enNRCParser = factory.getParser();
				enNRCParser.format("-1/KAMATA(N)123456");
			}
		}.run();
	}

	@Test
	public void requiredDistrict() {
		new ExpecteNRCFormatExceptionAsserter(NRCFormatError.REQUIRED_DISTRICT) {
			@Override
			protected void expectException() throws NRCFormatException {
				NRCParser enNRCParser = factory.getParser();
				enNRCParser.format("12/(N)123456");
			}
		}.run();
	}

	@Test
	public void invalidDistrict() {
		new ExpecteNRCFormatExceptionAsserter(NRCFormatError.INVALID_DISTRICT) {
			@Override
			protected void expectException() throws NRCFormatException {
				NRCParser enNRCParser = factory.getParser();
				enNRCParser.format("12/KKK(N)123456");
			}
		}.run();
	}

	@Test
	public void requiredRegNo() {
		new ExpecteNRCFormatExceptionAsserter(NRCFormatError.REQUIRED_REGNO_VALUE) {
			@Override
			protected void expectException() throws NRCFormatException {
				NRCParser enNRCParser = factory.getParser();
				enNRCParser.format("12/KAMATA(N)");
			}
		}.run();
	}

	@Test
	public void invalidRegNo() {
		new ExpecteNRCFormatExceptionAsserter(NRCFormatError.INVALID_REGNO) {
			@Override
			protected void expectException() throws NRCFormatException {
				NRCParser enNRCParser = factory.getParser();
				enNRCParser.format("12/KAMATA(N)123");
			}
		}.run();

		// NRCParser enNRCParser = factory.getParser();
		// try {
		// enNRCParser.format("hello world");
		// } catch (NRCFormatException e) {
		// e.printStackTrace();
		//
		// System.out.println(e.getError());
		// }

		// expectedEx.expect(NRCFormatException.class);
		// expectedEx.expectMessage("Employee ID is null");
	}

}
