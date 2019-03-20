// A class that represents employees in general.

public class Employee {
  private int baseHours = 40;
	private double baseSalary = 40000.0;
	private int baseVacationDays = 10;
	private String baseVacationForm = "yellow";

	public int getHours() {
		return baseHours;                // 40 hours/week
	}

	public double getSalary() {
		return baseSalary;               // $40,000.00
	}

	public int getVacationDays() {
		return baseVacationDays;         // 10 days
	}

	public String getVacationForm() {
		return baseVacationForm;         // yellow
	}

  public void applyForVacation() {
      System.out.println("Use the "+ getVacationForm() + " vacation form.");
  }

  public void showHours() {
      System.out.println("I work " + getHours() + " hours per week.");
  }

  public void showSalary() {
      System.out.println("My salary is $" + getSalary());
  }

  public void showVacation() {
        System.out.println("I receive " + getVacationDays() +" days of vacation.");
  }

  public final void setBaseVacationForm(String form) {
		baseVacationForm = form;
	}

}
