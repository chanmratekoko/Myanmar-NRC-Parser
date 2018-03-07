package mmnrc;

/**
 * 
 * @author <a href="mailto:chanmratekoko.dev@gmail.com">Chan Mrate Ko Ko</a>
 * 
 * @version 1.0
 *
 */
public class NRCParserMM extends NRCParser {

	@Override
	protected int processState(String state) throws NRCFormatException {

		int stateCode = 0;

		if (state == null || state.isEmpty()) {
			throw new NRCFormatException(NRCFormatError.REQUIRED_STATE_VALUE, "Required State value!");
		} else {
			try {
				stateCode = Integer.parseInt(LanguageUtil.getEngNumber(state, false));
			} catch (NumberFormatException ex) {
				throw new NRCFormatException(NRCFormatError.INVALID_STATE, "State code must be Myanmar Number!");
			}
			if (!NRCValidator.validateStateCode(stateCode)) {
				throw new NRCFormatException(NRCFormatError.INVALID_STATE,"State code must be between 1 to 14");
			}
		}

		return stateCode;
	}

	@Override
	protected String processDistrict(String district) throws NRCFormatException {
		if (district == null || district.isEmpty()) {
			throw new NRCFormatException(NRCFormatError.REQUIRED_DISTRICT, "Required District");
		} else if (district.length() != 3) {
			throw new NRCFormatException(NRCFormatError.INVALID_DISTRICT, "District length must be 6 characters.");
		} else {
			try {
				return LanguageCatalog.getEnglishWord(district);
			} catch (IllegalArgumentException ex){
				throw new NRCFormatException(NRCFormatError.INVALID_DISTRICT, "District value must be Eng characters!");
			}
		}
	}

	@Override
	protected int processRegisterNo(String registerNo) throws NRCFormatException {
		if (registerNo == null || registerNo.isEmpty()) {
			throw new NRCFormatException(NRCFormatError.REQUIRED_REGNO_VALUE, "Required Register No");
		} else if (registerNo.length() != 6){
			throw new NRCFormatException(NRCFormatError.INVALID_REGNO, "Register No length must be 6 digits.");
		} else {
			try {
				return Integer.parseInt(LanguageUtil.getEngNumber(registerNo, false));
			} catch (NumberFormatException ex) {
				throw new NRCFormatException(NRCFormatError.INVALID_DISTRICT, "Register No must be Myanmar Number!");
			}			
		}
	}

	@Override
	protected boolean validateNaingFormat(String naing) throws NRCFormatException {
		if (naing == null || naing.isEmpty()) {
			throw new NRCFormatException(NRCFormatError.REQUIRED_NAING, "Required Naing");
		}
		if (LanguageCatalog.MM_NAING_UNI.equals(naing) || "\u1014".equals(naing)) {
			return true;
		}
		throw new NRCFormatException(NRCFormatError.INVALID_NAING, "Invalid Naing");
	}
}
