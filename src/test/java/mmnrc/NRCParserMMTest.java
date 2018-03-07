package mmnrc;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NRCParserMMTest {

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	public static NRCParserFactory factory;

	@BeforeClass
	public static void beforeClass() {
		factory = new NRCParserFactory("mm");
	}

	@AfterClass
	public static void afterClass() {
		factory = null;
	}

	@Test
	public void format() throws NRCFormatException {

		NRCParser enNRCParser = factory.getParser();

		NRC nrc1 = enNRCParser.format(
				"\u1041\u1042/\u1000\u1019\u1010(\u1014\u102D\u102F\u1004\u103A)\u1041\u1042\u1043\u1044\u1045\u1046");

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
				enNRCParser.format(
						"\u1041\u1042/\u1000\u1019\u1010(\u1014\u102D\u102F)\u1041\u1042\u1043\u1044\u1045\u1046");
			}
		}.run();
	}

	@Test
	public void requiredNaing() {
		new ExpecteNRCFormatExceptionAsserter(NRCFormatError.REQUIRED_NAING) {
			@Override
			protected void expectException() throws NRCFormatException {
				NRCParser enNRCParser = factory.getParser();
				enNRCParser.format("\u1041\u1042/\u1000\u1019\u1010()\u1041\u1042\u1043\u1044\u1045\u1046");
			}
		}.run();
	}

	@Test
	public void requiredStateValue() {
		new ExpecteNRCFormatExceptionAsserter(NRCFormatError.REQUIRED_STATE_VALUE) {
			@Override
			protected void expectException() throws NRCFormatException {
				NRCParser enNRCParser = factory.getParser();
				enNRCParser.format(
						"/\u1000\u1019\u1010(\u1014\u102D\u102F\u1004\u103A)\u1041\u1042\u1043\u1044\u1045\u1046");
			}
		}.run();
	}

	@Test
	public void invalidStateValue() {
		new ExpecteNRCFormatExceptionAsserter(NRCFormatError.INVALID_STATE) {
			@Override
			protected void expectException() throws NRCFormatException {
				NRCParser enNRCParser = factory.getParser();
				enNRCParser.format(
						"-\u1041/\u1000\u1019\u1010(\u1014\u102D\u102F\u1004\u103A)\u1041\u1042\u1043\u1044\u1045\u1046");
			}
		}.run();
	}

	@Test
	public void requiredDistrict() {
		new ExpecteNRCFormatExceptionAsserter(NRCFormatError.REQUIRED_DISTRICT) {
			@Override
			protected void expectException() throws NRCFormatException {
				NRCParser enNRCParser = factory.getParser();
				enNRCParser.format("\u1041\u1042/(\u1014\u102D\u102F\u1004\u103A)\u1041\u1042\u1043\u1044\u1045\u1046");
			}
		}.run();
	}

	@Test
	public void invalidDistrict() {
		new ExpecteNRCFormatExceptionAsserter(NRCFormatError.INVALID_DISTRICT) {
			@Override
			protected void expectException() throws NRCFormatException {
				NRCParser enNRCParser = factory.getParser();
				enNRCParser
						.format("\u1041\u1042/ser(\u1014\u102D\u102F\u1004\u103A)\u1041\u1042\u1043\u1044\u1045\u1046");
			}
		}.run();
	}

	@Test
	public void requiredRegNo() {
		new ExpecteNRCFormatExceptionAsserter(NRCFormatError.REQUIRED_REGNO_VALUE) {
			@Override
			protected void expectException() throws NRCFormatException {
				NRCParser enNRCParser = factory.getParser();
				enNRCParser.format("\u1041\u1042/\u1000\u1019\u1010(\u1014\u102D\u102F\u1004\u103A)");
			}
		}.run();
	}

	@Test
	public void invalidRegNo() {
		new ExpecteNRCFormatExceptionAsserter(NRCFormatError.INVALID_REGNO) {
			@Override
			protected void expectException() throws NRCFormatException {
				NRCParser enNRCParser = factory.getParser();
				enNRCParser.format("\u1041\u1042/\u1000\u1019\u1010(\u1014\u102D\u102F\u1004\u103A)\u1041\u1042\u1043");
			}
		}.run();

		// expectedEx.expect(NRCFormatException.class);
		// expectedEx.expectMessage("invalid regno");
	}

}
