package Assignment1;

public class CurrencyConverter1 {

	String currency[] = new String[] { "rupee", "dirham", "real", "chilean_peso", "mexican_peso", "_yen",
			"$australian" };
	int value[] = new int[] { 63, 3, 3, 595, 18, 107, 2 };

	void printCurrencies() {
		for (int i = 0; i < currency.length; i++) {
			System.out.println(currency[i] + ": " + value[i]);
		}
	}

	public static void main(String[] args) {

		CurrencyConverter currencyConverter = new CurrencyConverter();
		currencyConverter.printCurrencies();
		
	}

}