package mmnrc;

/**
 * 
 * @author <a href="mailto:chanmratekoko.dev@gmail.com">Chan Mrate Ko Ko</a>
 * 
 * @version 1.0
 *
 */
public enum NRCParserEnum {

	ENGLISH("en"),
	MYANMAR("mm");
	
	String code;
	
	private NRCParserEnum(String code){
		this.code = code;
	}
	
	public static NRCParserEnum parse(String code){
		for (NRCParserEnum nrcFormatterEnum : NRCParserEnum.values()) {
			if (nrcFormatterEnum.getCode().equalsIgnoreCase(code)) {
				return nrcFormatterEnum;
			}
		}
		throw new IllegalArgumentException("The code is unknown");
	}

	public String getCode(){
		return code;
	}
}
