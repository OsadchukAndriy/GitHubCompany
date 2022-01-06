import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company implements Comparator<Employee> {

    private List<Employee> listEmployee = new ArrayList<>();

    public List<Employee> getListEmployee() {
        return new ArrayList<>(listEmployee);
    }

    public List<Employee> getTopSalaryStaff(int count) {
        if (count <= 0 || count > listEmployee.size()) {
            return listEmployee;
        }
        listEmployee.sort(this);
        Collections.reverse(listEmployee);
        return  listEmployee.subList(0, count);
    }
    public List<Employee> getLowestSalaryStaff(int count) {
        if (count <= 0 || count > listEmployee.size()) {
            return listEmployee;
        }
        listEmployee.sort(this);
        if (count <= 0 || count > listEmployee.size()) {
            return listEmployee;
        }
        return listEmployee.subList(0, count);
    }

    public void hire(Employee employee) {
        listEmployee.add(employee);
    }

    public void hireAll(List<Employee> employees) {
       for (Employee e : employees){
           hire(e);
       }
    }

    public void fire(Employee employees) {
       listEmployee.remove(employees);
    }

    public int getIncome() {
        int income = 0;
       for (Employee e : listEmployee){
           if(e instanceof Manager){
              income += ((Manager) e).getFIX_SALARY();
           }
       }
       return income;
    }
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getMonthSelary(), o2.getMonthSelary());
    }
}
