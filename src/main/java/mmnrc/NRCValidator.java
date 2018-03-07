package mmnrc;

/**
 * 
 * @author <a href="mailto:chanmratekoko.dev@gmail.com">Chan Mrate Ko Ko</a>
 * 
 * @version 1.0
 *
 */
public class NRCValidator {

	/**
	 * Myanmar Number 0-9
	 */
	public static final String MM_NUM = "\u1040-\u1049";

	/**
	 * ကခဂဃငစဆဇဈညဎဏတထဒဓနပဖဗဘမယရလဝသဟဠဥဧ
	 * 
	 * Myanmar char Ka Gyi to Ah
	 */
	private static final String VALID_MM_CHAR = "\u1000\u1001\u1002\u1003\u1004\u1005\u1006\u1007\u1008\u100A\u100E\u100F\u1010\u1011\u1012\u1013\u1014\u1015\u1016\u1017\u1018\u1019\u101A\u101B\u101C\u101D\u101E\u101F\u1020\u1025\u1027";

	/**
	 * Myanmar Naing
	 */
	public static final String MM_NAING = "\u1014\u102D\u102F\u1004\u103A";

	public static final String REGX_ENG = "^([\\d]{1,2})\\/([\\w]{3}|[\\w]{6})[(](?:N|NAING)[)]([\\d]{6})$";

	public static final String REGX_MM = "^([" + MM_NUM + "]{1,2})\\/([" + VALID_MM_CHAR + "]{3})[(](?:" + LanguageCatalog.MM_NA + "|" + MM_NAING + ")[)]([" + MM_NUM + "]{6})$";

	public static boolean validateStateCode(int stateCode){
		return stateCode > 0 && stateCode < 15;
	}
	
	public static boolean validateEngDis(String district) {
		
		if (district.length() != 6) {
			throw new IllegalArgumentException();
		}
		
		district = district.toUpperCase();
		String[] engword = new String[district.length() / 2];
		
		for (int i = 0, j = 0; j < district.length(); i++) {
			engword[i] = district.substring(j, j += 2);
		}

		for (String w : engword) {
			switch (w) {
				case LanguageCatalog.EN_KA: {
					break;
				}
				case LanguageCatalog.EN_KH: {
					break;
				}
				case LanguageCatalog.EN_GA: {
					break;
				}
				case LanguageCatalog.EN_GH: {
					break;
				}
				case LanguageCatalog.EN_NG: {
					break;
				}
				case LanguageCatalog.EN_CA: {
					break;
				}
				case LanguageCatalog.EN_CH: {
					break;
				}
				case LanguageCatalog.EN_JA: {
					break;
				}
				case LanguageCatalog.EN_JH: {
					break;
				}
				case LanguageCatalog.EN_NY: {
					break;
				}
				case LanguageCatalog.EN_DD: {
					break;
				}
				case LanguageCatalog.EN_NN: {
					break;
				}
				case LanguageCatalog.EN_TA: {
					break;
				}
				case LanguageCatalog.EN_TH: {
					break;
				}
				case LanguageCatalog.EN_DA: {
					break;
				}
				case LanguageCatalog.EN_DH: {
					break;
				}
				case LanguageCatalog.EN_NA: {
					break;
				}
				case LanguageCatalog.EN_PA: {
					break;
				}
				case LanguageCatalog.EN_PH: {
					break;
				}
				case LanguageCatalog.EN_BA: {
					break;
				}
				case LanguageCatalog.EN_BH: {
					break;
				}
				case LanguageCatalog.EN_MA: {
					break;
				}
				case LanguageCatalog.EN_YA: {
					break;
				}
				case LanguageCatalog.EN_RA: {
					break;
				}
				case LanguageCatalog.EN_LA: {
					break;
				}
				case LanguageCatalog.EN_WA: {
					break;
				}
				case LanguageCatalog.EN_SA: {
					break;
				}
				case LanguageCatalog.EN_HA: {
					break;
				}
				case LanguageCatalog.EN_LL: {
					break;
				}
				case LanguageCatalog.EN_OU: {
					break;
				}
				case LanguageCatalog.EN_AE: {
					break;
				} default : {
					return false;
				}
			}
		}
		return true;
	}	
	
}
