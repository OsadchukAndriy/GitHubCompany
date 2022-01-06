public class Manager implements Employee {
    private Company company;
    public static final double DOUBLE_PERCENT = 1.05;
    private int FIX_SALARY = (int) (Math.random() * 60_000) + 60_000;

    public Manager(Company company) {
        this.company = company;
    }

    public int getFIX_SALARY() {
        return FIX_SALARY;
    }

    @Override
    public int getMonthSelary() {
        return FIX_SALARY + (int) (FIX_SALARY * DOUBLE_PERCENT);
    }
}
