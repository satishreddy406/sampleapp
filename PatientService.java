
public class PatientService {
	
	public String createPatient(Patient patient){
		PatientDao dao = new PatientDao();
		System.out.println("Calling dao");
		String status = dao.createPatient(patient);
		System.out.println("Sevice ended ");

		return status;	
	}

}
