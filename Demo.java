
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		System.out.println("Enter patient name");
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.next();
		
		System.out.println("Enter patient age");
		Scanner sc2 = new Scanner(System.in);
		int age = sc2.nextInt();

		System.out.println("Enter patient email");
		Scanner sc3 = new Scanner(System.in);
		String email = sc3.next();

		System.out.println("Enter patient phone");
		Scanner sc4 = new Scanner(System.in);
		String phone = sc4.next();
		
		Patient patient = new Patient(name, age, email, phone);
		System.out.println("Calling service");
		PatientService service = new PatientService();
		String status =service.createPatient(patient);
		System.out.println("Status ==>" + status);
		
		
		
		
		
		
		

		
		
		
		
		
	}

}
