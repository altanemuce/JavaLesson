
public class Main {

	public static void main(String[] args) {
		int number1 = 240;
		int number2 = 29;
		int number3 = 123;
		int enBuyuk = number1;

		if (enBuyuk < number2) {
			enBuyuk = number2;
		}

		if (enBuyuk < number3) {
			enBuyuk = number3;
		}
		System.out.println("En Büyük Sayı" + enBuyuk);

	}

}
