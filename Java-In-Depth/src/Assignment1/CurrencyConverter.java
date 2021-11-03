package Assignment1;

public class CurrencyConverter {

	private int rupee;
	private int dirham;
	private int real;
	private int chilean_peso;
	private int mexican_peso;
	private int _yen;
	private int $australian;
	// private int dollar;

	public CurrencyConverter() {
		rupee = 63;
		dirham = 3;
		real = 3;
		chilean_peso = 595;
		mexican_peso = 18;
		_yen = 107;
		$australian = 2;
	}

	public void printCurrencies() {
		System.out.println("rupee: " + rupee);
		System.out.println("dirham: " + dirham);
		System.out.println("real: " + real);
		System.out.println("chilean_peso: " + chilean_peso);
		System.out.println("mexican_peso: " + mexican_peso);
		System.out.println("_yen: " + _yen);
		System.out.println("$australian: " + $australian);
	}

	public static void main(String[] args) {
		CurrencyConverter currencyConverter = new CurrencyConverter();
		currencyConverter.printCurrencies();
	}

}