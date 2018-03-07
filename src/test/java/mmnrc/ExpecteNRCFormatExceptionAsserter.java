package mmnrc;

import org.junit.Assert;

public abstract class ExpecteNRCFormatExceptionAsserter {

	private NRCFormatError expectedExceptionMessage;

	public ExpecteNRCFormatExceptionAsserter(NRCFormatError expectedExceptionMessage) {
		this.expectedExceptionMessage = expectedExceptionMessage;
	}

	public final void run() {
		try {
			expectException();
			Assert.fail(String.format("Expected a NRCFormatExceptions '%s'", expectedExceptionMessage));
		} catch (NRCFormatException e) {
			Assert.assertEquals("NRCFormatExceptions caught, but unexpected message", expectedExceptionMessage,
					e.getError());
		}
	}

	protected abstract void expectException() throws NRCFormatException;

}