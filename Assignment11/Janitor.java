/* Wrote a class Janitor. Janitors work twice as many hours per week as other employees, 
make $30,000, they get half as much vacation as other employees (only 5 days), and they 
have an additional methodthat prints "Workin' for the man."
*/

public class Janitor extends Employee {
    public int getHours() {
        return super.getHours() * 2;
    }
    
    public double getSalary() {
        return super.getSalary() - 10000;
    }
    
    public int getVacationDays() {
        return super.getVacationDays() / 2;
    }
    
    public void clean() {
        System.out.println("Workin' for the man.");
    }
}
