package lessonOne;

import java.util.ArrayList;

public class LessonOne {

	public static void main(String[] args) {

		String userName = "Altan";
		String userPassword = "12345";

		if (userName == "Altan" && userPassword == "12345") {
			System.out.println("Giriş Başarılı");
		} else {
			System.out.println("Kullanıcı Adı ve Şifre Yanlış");
		}

		ArrayList<String> products = new ArrayList<String>();
		products.add("Laptop");
		products.add("Televizyon");
		products.add("Ütü");
		
		for (String product : products) {
			System.out.println("Ürün Adı : "+product);
		}
		
	}

}
