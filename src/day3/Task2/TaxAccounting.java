package day3.Task2;

public class TaxAccounting extends Accounting{
    int taxOfCompany;
    int countOfEmployers;
    String departmentName;
    int income;

    public TaxAccounting(int countOfEmployers, String departmentName, int income) {
        super(countOfEmployers, departmentName, income);
        this.countOfEmployers=countOfEmployers;
        this.departmentName=departmentName;
        this.income=income;
    }

    @Override
    public void count() {
        super.count();
         taxOfCompany=income*10/100;
        System.out.println("tax of company=" + taxOfCompany);
      //  int ekamut=

    }
}
