
public class Main {

	public static void main(String[] args) {
		String student1 = "Altan";
		String student2 = "İlkay";
		String student3 = "Murat";

		String[] students = new String[3];
		students[0] = "Altan";
		students[1] = "İlkay";
		students[2] = "Murat";
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
		
		for (String student : students) {
			System.out.println(student);
		}
			

	}

}
