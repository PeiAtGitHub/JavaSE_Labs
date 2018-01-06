package pei.java.thirdp.lab.utils;

import org.apache.commons.lang3.RandomUtils;

/**
 * 
 * @author pei
 *
 */
public class Utils {
	
	// Some commonly used strings
	public final static String FIRST_NAME = "FirstName";
	public final static String LAST_NAME = "LastName";
	
	public final static String ABC = "abc";
	public final static String DEF = "def";
	public final static String GHI = "ghi";
	public final static String TOM = "TOM";
	public final static String DORAEMON = "DORAEMON";
	public final static String CAT = "CAT";
	public final static String JERRY = "JERRY";
	public final static String MICKEY = "MICKEY";
	public final static String MOUSE = "MOUSE";
	
	
	public final static String SHOULD_THROW_EXCEPTION = "Should'v thrown exception.";
	
	// URLs
	public static final String APACHE_COMMONS_IO_MAIN_PAGE = "https://commons.apache.org/proper/commons-io/index.html";
	public static final String WIKIPEDIA_MAIN_PAGE_URL= "https://en.wikipedia.org/wiki/Main_Page";

	
	//
	public static Exception catchException(NonArgFunction function) {
		try {
			function.doSth();
			return null;
		} catch (Exception e) {
			return e;
		}
	}

	/**
	 * 
	 * @return
	 */
	public static long getRandom16DigitNumber() {
		return RandomUtils.nextLong(1_000_000_000_000_000L, 10_000_000_000_000_000L);
	}
}

