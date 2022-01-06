import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Company company = new Company();

        List<Employee> worker = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            company.hire(new Operator(company));
        }
        for (int i = 0; i < 80; i++) {
            company.hire(new Manager(company));
        }
        for (int i = 0; i < 10; i++) {
            company.hire(new TopManager(company));
        }

        printEmployee(company);

        List<Employee> employees = company.getListEmployee();
        System.out.println(company.getListEmployee().size());
        for (int i = 0; i < 135; i++) {
            company.fire(employees.get(i));
        }

        System.out.println("________________________");

        System.out.println(company.getIncome());

        System.out.println("________________________");

        System.out.println(company.getListEmployee().size());

        printEmployee(company);

        System.out.println("________________________");

        System.out.println(company.getIncome());

        System.out.println("________________________");
    }

    private static void printEmployee(Company company) {
        List<Employee> topSalaryStaff = company.getTopSalaryStaff(10);
        {
            for (Employee e : topSalaryStaff) {
                System.out.println(e.getMonthSelary());
            }
        }
        System.out.println("________________________");
        List<Employee> lowSalaryStaff = company.getLowestSalaryStaff(30);
        {
            for (Employee e : lowSalaryStaff) {
                System.out.println(e.getMonthSelary());
            }
        }
    }
}
