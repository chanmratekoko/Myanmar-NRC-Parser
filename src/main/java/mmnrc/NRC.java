package mmnrc;

/**
 * <a href="mailto:chanmratekoko.dev@gmail.com">Chan Mrate Ko Ko</a>
 * 
 * @author Chan Mrate Ko Ko
 * @version 1.0
 *
 */
public class NRC {

	private int stateCode;

	private String district;

	private int registerNo;

	public NRC(int stateCode, String district, int registerNo) {
		this.stateCode = stateCode;
		this.district = district;
		this.registerNo = registerNo;
	}

	public int getStateCode() {
		return stateCode;
	}

	public String getDistrict() {
		return district;
	}

	public int getRegisterNo() {
		return registerNo;
	}

	public String getStateName(Language language) {
		if (language.equals(Language.MYANMAR)) {
			return LanguageCatalog.states[stateCode - 1][1];
		}
		return LanguageCatalog.states[stateCode - 1][0];
	}

	public String getFormat(Language language) {
		if (language.equals(Language.MYANMAR)) {
			return LanguageUtil.getMyanmarNumber(Integer.toString(stateCode), false) + "/"
					+ LanguageCatalog.getMyanmarWord(district) + "(" + LanguageCatalog.MM_NAING_UNI + ")"
					+ LanguageUtil.getMyanmarNumber(Integer.toString(registerNo), false);
		}
		return stateCode + "/" + district + "(NAING)" + registerNo;
	}

	@Override
	public String toString() {
		return "NRC [stateCode=" + stateCode + ", district=" + district + ", registerNo=" + registerNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((district == null) ? 0 : district.hashCode());
		result = prime * result + registerNo;
		result = prime * result + stateCode;
		return result;
	}

	public boolean equal(String str) {
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NRC other = (NRC) obj;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (registerNo != other.registerNo)
			return false;
		if (stateCode != other.stateCode)
			return false;
		return true;
	}

}
