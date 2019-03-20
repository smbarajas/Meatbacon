/* Wrote a class HarvardLawyer to accompany the other law firm classes 
Harvard lawyers make 20% more money than a normal lawyer, get 3 days more 
vacation, and have to fill out four of the lawyer's forms to go on vacation.
*/

public class HarvardLawyer extends Lawyer {
    public double getSalary() {
        return super.getSalary() * 1.2;
    }
    
    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }
    
    public String getVacationForm() {
        String form = super.getVacationForm();
        return form + form + form + form;
    }
}
