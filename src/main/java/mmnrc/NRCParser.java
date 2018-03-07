package mmnrc;

/**
 * 
 * @author <a href="mailto:chanmratekoko.dev@gmail.com">Chan Mrate Ko Ko</a>
 * 
 * @version 1.0
 *
 */
public abstract class NRCParser {

	public NRC format(String fullNRC) throws NRCFormatException {

		fullNRC = fullNRC.trim();
		
		if (fullNRC == null || fullNRC.isEmpty()) {
			throw new IllegalArgumentException("NRC cannot be null");
		}

		String state = null;
		String district = null;
		String naing = null;
		String registerNo = null;

		String[] nrcArr = fullNRC.split("[/()]", 4);

		if (nrcArr.length == 4) {
			state = nrcArr[0];
			district = nrcArr[1];
			naing = nrcArr[2];
			registerNo = nrcArr[3];
		} else {
			throw new NRCFormatException(NRCFormatError.INVALID_NRC, "NRC format is not invalid!!");
		}
		
		int processState = processState(state);		
		String processDistrict = processDistrict(district);
		validateNaingFormat(naing);
		int processRegisterNo = processRegisterNo(registerNo);
	
		return new NRC(processState, processDistrict, processRegisterNo);
	}

	abstract protected int processState(String state) throws NRCFormatException;
	
	abstract protected boolean validateNaingFormat(String naing) throws NRCFormatException;

	abstract protected String processDistrict(String district) throws NRCFormatException;

	abstract protected int processRegisterNo(String registerNo) throws NRCFormatException;
}
