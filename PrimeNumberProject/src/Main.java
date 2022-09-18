
public class Main {

	public static void main(String[] args) {
		int number = 23;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Sayı Asal değildir");
			return;
		}

		if (number < 1) {
			System.out.println("Sayı Geçersiz");
		}

		for (int i = 2; i < number; i++) {
			if (number % 2 == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Sayı Asaldır");
		} else {
			System.out.println("Sayı Asal Değildir");
		}
	}

}
