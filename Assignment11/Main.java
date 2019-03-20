public class Main {
    public static void main(String[] args) {
        System.out.println("Employee:");
        Employee employee1 = new Employee();
        employee1.applyForVacation();
        employee1.showHours();
        employee1.showSalary();
        employee1.showVacation();
        System.out.println();

        System.out.println("Lawyer:");
        Lawyer employee2 = new Lawyer();
        employee2.applyForVacation();
        employee2.showHours();
        employee2.showSalary();
        employee2.showVacation();
        employee2.sue();
        System.out.println();

        System.out.println("Harvard Lawyer:");
        HarvardLawyer employee3 = new HarvardLawyer();
        employee3.applyForVacation();
        employee3.showHours();
        employee3.showSalary();
        employee3.showVacation();
        employee3.sue();
        System.out.println();

        System.out.println("Janitor:");
        Janitor employee4 = new Janitor();
        employee4.applyForVacation();
        employee4.showHours();
        employee4.showSalary();
        employee4.showVacation();
        employee4.clean();
        System.out.println();

        
    }
}
