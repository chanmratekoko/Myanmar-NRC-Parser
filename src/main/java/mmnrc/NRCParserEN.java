package mmnrc;

/**
 * <a href="mailto:chanmratekoko.dev@gmail.com">Chan Mrate Ko Ko</a>
 * @author Chan Mrate Ko Ko
 * @version 1.0
 *
 */
public class NRCParserEN extends NRCParser {

	@Override
	protected int processState(String state) throws NRCFormatException {
		int stateCode = 0;
		if (state == null || state.isEmpty()) {
			throw new NRCFormatException(NRCFormatError.REQUIRED_STATE_VALUE);
		} else {
			try {
				stateCode = Integer.parseInt(state);
				if (!NRCValidator.validateStateCode(stateCode)) {
					throw new NRCFormatException(NRCFormatError.INVALID_STATE);
				}
				return stateCode;
			} catch (NumberFormatException ex) {
				throw new NRCFormatException(NRCFormatError.INVALID_STATE);
			}
		}
	}

	@Override
	protected String processDistrict(String district) throws NRCFormatException {
		if (district == null || district.isEmpty()) {
			throw new NRCFormatException(NRCFormatError.REQUIRED_DISTRICT);
		} else if (district.length() != 6 || !NRCValidator.validateEngDis(district)) {
			throw new NRCFormatException(NRCFormatError.INVALID_DISTRICT);
		} else {
			return district.toUpperCase();
		}
	}

	@Override
	protected int processRegisterNo(String registerNo) throws NRCFormatException {
		if (registerNo == null || registerNo.isEmpty()) {
			throw new NRCFormatException(NRCFormatError.REQUIRED_REGNO_VALUE);
		} else if (registerNo.length() != 6) {
			throw new NRCFormatException(NRCFormatError.INVALID_REGNO);
		} else {
			try {
				return Integer.parseInt(registerNo);
			} catch (NumberFormatException ex) {
				throw new NRCFormatException(NRCFormatError.INVALID_REGNO);
			}
		}
	}

	@Override
	protected boolean validateNaingFormat(String naing) throws NRCFormatException {
		if (naing == null || naing.isEmpty()) {
			throw new NRCFormatException(NRCFormatError.REQUIRED_NAING);
		}
		if ("NAING".equals(naing) || "N".equals(naing)) {
			return true;
		}		
		throw new NRCFormatException(NRCFormatError.INVALID_NAING);
	}

}
