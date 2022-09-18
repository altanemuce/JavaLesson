
public class Main {

	public static void main(String[] args) {
		int[] numbers=new int[] {1,2,4,5,6,7,8,9};
		int find=5;
		boolean isThere=false;
		
		for(int number:numbers) {
			if(number==find) {
				isThere=true;
				break;
			}
		}
		
		if(isThere) {
			System.out.println("Sayı mevcuttur");
		}else {
			System.out.println("Sayı mevcut değildir");
		}

	}

}
