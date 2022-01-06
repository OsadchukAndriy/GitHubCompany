public class TopManager implements Employee {
    private Company company;
    private static final double BONUS_PERCENT = 1.5;
    private static final double COMPANY_INCOME = 10_000_000;
    private int fixSalary = (int) (Math.random() * 80_000) + 80_000;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public int getMonthSelary() {
        if (company.getIncome() >= COMPANY_INCOME)
            return (int) (fixSalary * BONUS_PERCENT);
        return fixSalary;
    }
}
