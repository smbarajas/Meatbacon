//  A class to represent normal lawyers.


public class Lawyer extends Employee {
	public int getVacationDays() {
		return super.getVacationDays() + 5;
	}

	public String getVacationForm() {
		 return lawyerVacationForm;
	}

	public void sue() {
		System.out.println("I'll see you in court!");
	}
	
	private String lawyerVacationForm = "pink";
	
	public final void setVacationForm(String form) {
		lawyerVacationForm = form;
	}
}
