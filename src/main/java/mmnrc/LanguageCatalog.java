package mmnrc;

/**
 * Language Catalog
 * 
 * @author <a href="mailto:chanmratekoko.dev@gmail.com">Chan Mrate Ko Ko</a>
 * 
 * @version 1.0
 * 
 */
public class LanguageCatalog {

	/**
	 * Language ref: http://en.wiktionary.org/wiki/Appendix:Unicode/Myanmar
	 */

	public static final String EN_KA = "KA";
	public static final String EN_KH = "KH";
	public static final String EN_GA = "GA";
	public static final String EN_GH = "GH";
	public static final String EN_NG = "NG";
	public static final String EN_CA = "CA";
	public static final String EN_CH = "CH";
	public static final String EN_JA = "JA";
	public static final String EN_JH = "JH";
	public static final String EN_NY = "NY";
	public static final String EN_DD = "DD";
	public static final String EN_NN = "NN";
	public static final String EN_TA = "TA";
	public static final String EN_TH = "TH";
	public static final String EN_DA = "DA";
	public static final String EN_DH = "DH";
	public static final String EN_NA = "NA";
	public static final String EN_PA = "PA";
	public static final String EN_PH = "PH";
	public static final String EN_BA = "BA";
	public static final String EN_BH = "BH";
	public static final String EN_MA = "MA";
	public static final String EN_YA = "YA";
	public static final String EN_RA = "RA";
	public static final String EN_LA = "LA";
	public static final String EN_WA = "WA";
	public static final String EN_SA = "SA";
	public static final String EN_HA = "HA";
	public static final String EN_LL = "LL";
	public static final String EN_OU = "OU";
	public static final String EN_AE = "AE";

	public static final char MM_ZERO = '\u1040';
	public static final char MM_ONE = '\u1041';
	public static final char MM_TWO = '\u1042';
	public static final char MM_THREE = '\u1043';
	public static final char MM_FOUR = '\u1044';
	public static final char MM_FIVE = '\u1045';
	public static final char MM_SIX = '\u1046';
	public static final char MM_SEVEN = '\u1047';
	public static final char MM_EIGHT = '\u1048';
	public static final char MM_NINE = '\u1049';

	public static final char MM_KA = '\u1000';
	public static final char MM_KH = '\u1001';
	public static final char MM_GA = '\u1002';
	public static final char MM_GH = '\u1003';
	public static final char MM_NG = '\u1004';
	public static final char MM_CA = '\u1005';
	public static final char MM_CH = '\u1006';
	public static final char MM_JA = '\u1007';
	public static final char MM_JH = '\u1008';
	public static final char MM_NY = '\u100A';
	public static final char MM_DD = '\u100C';
	public static final char MM_NN = '\u100F';
	public static final char MM_TA = '\u1010';
	public static final char MM_TH = '\u1011';
	public static final char MM_DA = '\u1012';
	public static final char MM_DH = '\u1013';
	public static final char MM_NA = '\u1014';
	public static final char MM_PA = '\u1015';
	public static final char MM_PH = '\u1016';
	public static final char MM_BA = '\u1017';
	public static final char MM_BH = '\u1018';
	public static final char MM_MA = '\u1019';
	public static final char MM_YA = '\u101A';
	public static final char MM_RA = '\u101B';
	public static final char MM_LA = '\u101C';
	public static final char MM_WA = '\u101D';
	public static final char MM_SA = '\u101E';
	public static final char MM_HA = '\u101F';
	public static final char MM_LL = '\u1020';
	public static final char MM_OU = '\u1025';
	public static final char MM_AE = '\u1021';

	// State English and Myanmar
	public static final String[][] states = {
			{ "Kachin", "\u1000\u1001\u103B\u1004\u103A\u1015\u103C\u100A\u103A\u1014\u101A\u103A" },
			{ "Kayah", "\u1000\u101A\u102C\u1038\u1015\u103C\u100A\u103A\u1014\u101A\u103A" },
			{ "Kayin", "\u1000\u101B\u1004\u103A\u1015\u103C\u100A\u103A\u1014\u101A\u103A" },
			{ "Chin", "\u1001\u103B\u1004\u103A\u1038\u1015\u103C\u100A\u103A\u1014\u101A\u103A" },
			{ "Sagaing", "\u1005\u1005\u103A\u1000\u102D\u102F\u1004\u103A\u1038\u1010\u102D\u102F\u1004\u103A\u1038" },
			{ "Tanintharyi",
					"\u1010\u1014\u1004\u103A\u1039\u101E\u102C\u101B\u102E\u1010\u102D\u102F\u1004\u103A\u1038" },
			{ "Bago", "\u1015\u1032\u1001\u1030\u1038\u1010\u102D\u102F\u1004\u103A\u1038" },
			{ "Magway", "\u1019\u1000\u103D\u1031\u1038\u1010\u102D\u102F\u1004\u103A\u1038" },
			{ "Mandalay", "\u1019\u1014\u1039\u1010\u101C\u1031\u1038\u1010\u102D\u102F\u1004\u103A\u1038" },
			{ "Mon", "\u1019\u103D\u1014\u103A\u1015\u103C\u100A\u103A\u1014\u101A\u103A" },
			{ "Rakhine", "\u101B\u1001\u102D\u102F\u1004\u103A\u1015\u103C\u100A\u103A\u1014\u101A\u103A" },
			{ "Yangon", "\u101B\u1014\u103A\u1000\u102F\u1014\u103A\u1010\u102D\u102F\u1004\u103A\u1038" },
			{ "Shan", "\u101B\u103E\u1019\u103A\u1038\u1015\u103C\u100A\u103A\u1014\u101A\u103A" },
			{ "Ayeyarwaddy", "\u1027\u101B\u102C\u101D\u1010\u102E\u1010\u102D\u102F\u1004\u103A\u1038" } };

	public static final String MM_NAING_UNI = "\u1014\u102D\u102F\u1004\u103A";

	public static String getEnglishWord(String word) {
		StringBuffer result = new StringBuffer();
		for (char c : word.toCharArray()) {
			switch (c) {
			case MM_KA: {
				result.append(EN_KA);
				break;
			}
			case MM_KH: {
				result.append(EN_KH);
				break;
			}
			case MM_GA: {
				result.append(EN_GA);
				break;
			}
			case MM_GH: {
				result.append(EN_GH);
				break;
			}
			case MM_NG: {
				result.append(EN_NG);
				break;
			}
			case MM_CA: {
				result.append(EN_CA);
				break;
			}
			case MM_CH: {
				result.append(EN_CH);
				break;
			}
			case MM_JA: {
				result.append(EN_JA);
				break;
			}
			case MM_JH: {
				result.append(EN_JH);
				break;
			}
			case MM_NY: {
				result.append(EN_NY);
				break;
			}
			case MM_DD: {
				result.append(EN_DD);
				break;
			}
			case MM_NN: {
				result.append(EN_NN);
				break;
			}
			case MM_TA: {
				result.append(EN_TA);
				break;
			}
			case MM_TH: {
				result.append(EN_TH);
				break;
			}
			case MM_DA: {
				result.append(EN_DA);
				break;
			}
			case MM_DH: {
				result.append(EN_DH);
				break;
			}
			case MM_NA: {
				result.append(EN_NA);
				break;
			}
			case MM_PA: {
				result.append(EN_PA);
				break;
			}
			case MM_PH: {
				result.append(EN_PH);
				break;
			}
			case MM_BA: {
				result.append(EN_BA);
				break;
			}
			case MM_BH: {
				result.append(EN_BH);
				break;
			}
			case MM_MA: {
				result.append(EN_MA);
				break;
			}
			case MM_YA: {
				result.append(EN_YA);
				break;
			}
			case MM_RA: {
				result.append(EN_RA);
				break;
			}
			case MM_LA: {
				result.append(EN_LA);
				break;
			}
			case MM_WA: {
				result.append(EN_WA);
				break;
			}
			case MM_SA: {
				result.append(EN_SA);
				break;
			}
			case MM_HA: {
				result.append(EN_HA);
				break;
			}
			case MM_LL: {
				result.append(EN_LL);
				break;
			}
			case MM_OU: {
				result.append(EN_OU);
				break;
			}
			case MM_AE: {
				result.append(EN_AE);
				break;
			} default : {
				//invalid
				throw new IllegalArgumentException();
			}
			}
		}
		return result.toString();
	}
	
	public static String getMyanmarWord(String word) {
		word = word.toUpperCase();
		
		StringBuffer result = new StringBuffer();
		String[] engword = new String[word.length() / 2];
		
		for (int i = 0, j = 0; j < word.length(); i++) {
			engword[i] = word.substring(j, j += 2);
		}

		for (String w : engword) {
			switch (w) {
				case EN_KA: {
					result.append(MM_KA);
					break;
				}
				case EN_KH: {
					result.append(MM_KH);
					break;
				}
				case EN_GA: {
					result.append(MM_GA);
					break;
				}
				case EN_GH: {
					result.append(MM_GH);
					break;
				}
				case EN_NG: {
					result.append(MM_NG);
					break;
				}
				case EN_CA: {
					result.append(MM_CA);
					break;
				}
				case EN_CH: {
					result.append(MM_CH);
					break;
				}
				case EN_JA: {
					result.append(MM_JA);
					break;
				}
				case EN_JH: {
					result.append(MM_JH);
					break;
				}
				case EN_NY: {
					result.append(MM_NY);
					break;
				}
				case EN_DD: {
					result.append(MM_DD);
					break;
				}
				case EN_NN: {
					result.append(MM_NN);
					break;
				}
				case EN_TA: {
					result.append(MM_TA);
					break;
				}
				case EN_TH: {
					result.append(MM_TH);
					break;
				}
				case EN_DA: {
					result.append(MM_DA);
					break;
				}
				case EN_DH: {
					result.append(MM_DH);
					break;
				}
				case EN_NA: {
					result.append(MM_NA);
					break;
				}
				case EN_PA: {
					result.append(MM_PA);
					break;
				}
				case EN_PH: {
					result.append(MM_PH);
					break;
				}
				case EN_BA: {
					result.append(MM_BA);
					break;
				}
				case EN_BH: {
					result.append(MM_BH);
					break;
				}
				case EN_MA: {
					result.append(MM_MA);
					break;
				}
				case EN_YA: {
					result.append(MM_YA);
					break;
				}
				case EN_RA: {
					result.append(MM_RA);
					break;
				}
				case EN_LA: {
					result.append(MM_LA);
					break;
				}
				case EN_WA: {
					result.append(MM_WA);
					break;
				}
				case EN_SA: {
					result.append(MM_SA);
					break;
				}
				case EN_HA: {
					result.append(MM_HA);
					break;
				}
				case EN_LL: {
					result.append(MM_LL);
					break;
				}
				case EN_OU: {
					result.append(MM_OU);
					break;
				}
				case EN_AE: {
					result.append(MM_AE);
					break;
				}
				default : {
					//invalid
					throw new IllegalArgumentException();
				}
			}
		}
		return result.toString();
	}
}
