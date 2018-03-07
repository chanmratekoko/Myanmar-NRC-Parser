package mmnrc;

/**
 * 
 * @author <a href="mailto:chanmratekoko.dev@gmail.com">Chan Mrate Ko Ko</a>
 * 
 * @version 1.0
 *
 */
public class NRCParserEN extends NRCParser {

	@Override
	protected int processState(String state) throws NRCFormatException {
		int stateCode = 0;
		if (state == null || state.isEmpty()) {
			throw new NRCFormatException(NRCFormatError.REQUIRED_STATE_VALUE, "Required State value!");
		} else {
			try {
				stateCode = Integer.parseInt(state);
				if (!NRCValidator.validateStateCode(stateCode)) {
					throw new NRCFormatException(NRCFormatError.INVALID_STATE, "State code must be between 1 to 14");
				}
				return stateCode;
			} catch (NumberFormatException ex) {
				throw new NRCFormatException(NRCFormatError.INVALID_STATE, "State code must be Number!");
			}
		}
	}

	@Override
	protected String processDistrict(String district) throws NRCFormatException {
		if (district == null || district.isEmpty()) {
			throw new NRCFormatException(NRCFormatError.REQUIRED_DISTRICT, "Required District");
		} else if (district.length() != 6) {
			throw new NRCFormatException(NRCFormatError.INVALID_DISTRICT, "District length must be 6 characters.");
		} else if(!NRCValidator.validateEngDis(district)) {
			throw new NRCFormatException(NRCFormatError.INVALID_DISTRICT, "District value must be Eng characters!");
		} else {
			return district.toUpperCase();
		}
	}

	@Override
	protected int processRegisterNo(String registerNo) throws NRCFormatException {
		if (registerNo == null || registerNo.isEmpty()) {
			throw new NRCFormatException(NRCFormatError.REQUIRED_REGNO_VALUE, "Required Register No");
		} else if (registerNo.length() != 6) {
			throw new NRCFormatException(NRCFormatError.INVALID_REGNO, "Register No length must be 6 digits.");
		} else {
			try {
				return Integer.parseInt(registerNo);
			} catch (NumberFormatException ex) {
				throw new NRCFormatException(NRCFormatError.INVALID_REGNO, "Register No must be Number!");
			}
		}
	}

	@Override
	protected boolean validateNaingFormat(String naing) throws NRCFormatException {
		if (naing == null || naing.isEmpty()) {
			throw new NRCFormatException(NRCFormatError.REQUIRED_NAING, "Required Naing");
		}
		if ("NAING".equals(naing) || "N".equals(naing)) {
			return true;
		}
		throw new NRCFormatException(NRCFormatError.INVALID_NAING, "Invalid Naing");
	}

}
