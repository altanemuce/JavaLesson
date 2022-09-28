
public class Main {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel";
		String newMessage = message.substring(0, 2);
		System.out.println(newMessage);
		int number=sum(4,5);
		System.out.println(number);
		int total =sum(1,2,4,5,6,7);
		System.out.println(total);
	}

	public static void add() {
		System.out.println("Eklendi");
	}

	public static void delete() {
		System.out.println("Silindi");
	}

	public static void update() {
		System.out.println("Güncellendi");
	}
	
	public static int sum(int number1,int number2) {
		return number1+number2;
	}
	
	public static int sum(int... numbers) {
		int total=0;
		for(int number:numbers) {
			total=total+number;
		}
		return total;
	}
	
	public static String city() {
		return "Ankara";
	}
	

}
