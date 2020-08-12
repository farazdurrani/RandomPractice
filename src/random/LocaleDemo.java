package random;

import java.util.Locale;

public class LocaleDemo {
	public static void main(String[] args) {
		Locale locale = new Locale("USA");
		System.out.println("Country: " + locale.getCountry());
	}
}
