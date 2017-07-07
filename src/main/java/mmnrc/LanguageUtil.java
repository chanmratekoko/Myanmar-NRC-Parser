package mmnrc;

/**
 * <a href="mailto:chanmratekoko.dev@gmail.com">Chan Mrate Ko Ko</a>
 * @author Chan Mrate Ko Ko
 * @version 1.0
 *
 */
public class LanguageUtil {
	
	public static boolean isMyanmarNumber(String word) {
		for (char c : word.toCharArray()) {
			if (!isMyanmarNumber(c)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEnglishNumber(char c) {
		return c >= '0' && c <= '9';
	}
	
	public static boolean isMyanmarNumber(char c) {
		return c >= '\u1040' && c <= '\u1049';
	}

	public static String getEngNumber(String myanmarNumber, boolean skipOther) {
		StringBuffer result = new StringBuffer();

		for (char c : myanmarNumber.toCharArray()) {
			if (isMyanmarNumber(c)) {
				result.append((char) (c - 4112));
			} else if (skipOther) {
				result.append(c);
			} else {
				throw new NumberFormatException("Contain Invalid Characters.");
			}
		}

		return result.toString();
	}
	
	public static String getMyanmarNumber(String englishNumber, boolean skipOther) {
		StringBuffer result = new StringBuffer();

		for (char c : englishNumber.toCharArray()) {
			if (isEnglishNumber(c)) {
				result.append((char) (c + 4112));
			} else if (skipOther) {
				result.append(c);
			} else {
				System.out.println(c);
				throw new NumberFormatException("Contain Invalid Characters. ");
			}
		}

		return result.toString();
	}
	
	
}
