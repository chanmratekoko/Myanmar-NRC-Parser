package mmnrc;

/**
 * <a href="mailto:chanmratekoko.dev@gmail.com">Chan Mrate Ko Ko</a>
 * @author Chan Mrate Ko Ko
 * @version 1.0
 *
 */
public class NRCParserFactory {

	private String command;

	public NRCParserFactory(String command) {
		this.command = command;
	}

	public NRCParser getParser() {
		NRCParserEnum nrcFormatterEnum = NRCParserEnum.parse(command);
		switch (nrcFormatterEnum) {
		case ENGLISH:
			return new NRCParserEN();
		case MYANMAR:
			return new NRCParserMM();
		default:
			throw new IllegalArgumentException("The parser does not exist.");
		}
	}
}
