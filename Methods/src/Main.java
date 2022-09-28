
public class Main {
	
	public static void main(String[] args) {
		findNumber();
	}
	
	public static void findNumber() {
		int [] numbers=new int[] {1,2,4,5,6};
		int find=4;
		boolean isTrue=false;
		
		for(int number:numbers) {
			if(number==find) {
				isTrue=true;
				break;
			}
		}
		if(isTrue) {
			message("Sayı Mevcuttur " + find);
		}else {
			message("Sayı mevcut değildir " + find);
		}
	}
	
	public static void message(String message) {
		System.out.println(message);
	}
}
