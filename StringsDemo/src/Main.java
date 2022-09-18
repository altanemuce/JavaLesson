
public class Main {

	public static void main(String[] args) {
		String message = "the weather is very nice today";
		System.out.println(message);

//		System.out.println("Eleman sayısı : " + message.length());
//		System.out.println("5.Eleman : " + message.charAt(5));
//		System.out.println(message.concat(" Nice"));
//		System.out.println(message.startsWith("w"));
//		System.out.println(message.endsWith("y"));
//
//		char[] characters = new char[9];
//		message.getChars(0, 9, characters, 0);
//		System.out.println(characters);
//		System.out.println(message.indexOf('i'));
//		System.out.println(message.lastIndexOf('i'));

		System.out.println(message.replace(' ', '-'));
		System.out.println(message.substring(2));
		System.out.println(message.substring(2, 5));

		for (String kelime : message.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(message.toUpperCase());

	}

}
