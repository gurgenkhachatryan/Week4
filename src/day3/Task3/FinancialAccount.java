package day3.Task3;

public class FinancialAccount extends TaxAccounting {
 //   protected  int countOfEmployers;
 //   protected   String departmentName;
    protected  int salaryOfEmployers;
    @Override
    protected void account() {
        super.account();

        System.out.println(salaryOfEmployers=(income-taxOfCompany)/countOfEmployers);
    }
}
