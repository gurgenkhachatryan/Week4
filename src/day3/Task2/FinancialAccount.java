package day3.Task2;

public class FinancialAccount extends TaxAccounting{
    int salaryOfEmployers;
    int countOfEmployers;
    String departmentName;
    int income;
    public FinancialAccount(int countOfEmployers,String departmentName,  int income) {
        super(countOfEmployers,departmentName, income);
        this.countOfEmployers=countOfEmployers;
        this.departmentName=departmentName;
        this.income=income;
    }

    @Override
    public void count() {
        super.count();
        salaryOfEmployers=income/countOfEmployers;
        System.out.println("salary of Employers=" + salaryOfEmployers);
        System.out.println("department=" + departmentName);
    }


}
