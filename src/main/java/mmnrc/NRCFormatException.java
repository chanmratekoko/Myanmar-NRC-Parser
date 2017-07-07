package mmnrc;

/**
 * <a href="mailto:chanmratekoko.dev@gmail.com">Chan Mrate Ko Ko</a>
 * @author Chan Mrate Ko Ko
 * @version 1.0
 *
 */
public class NRCFormatException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private NRCFormatError error;	

	public NRCFormatException() {
		super();
	}

	public NRCFormatException(NRCFormatError error) {
		super();
		this.error = error;
	}

	public NRCFormatError getError() {
		return error;
	}

	public void setError(NRCFormatError error) {
		this.error = error;
	}
}
