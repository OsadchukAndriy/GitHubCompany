public class Operator implements Employee {
    private int FIX_SALARY = (int) (Math.random() * 50_000) + 50_000;

    private Company company;

    public Operator(Company company) {
        this.company = company;
    }

    @Override
    public int getMonthSelary() {
        return FIX_SALARY;
    }
}
