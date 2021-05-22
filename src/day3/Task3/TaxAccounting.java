package day3.Task3;

public class TaxAccounting extends Accounting{
 //   protected  int countOfEmployers;
 //   protected   String departmentName;
  //  protected
   protected  int taxOfCompany;
    @Override
    protected void account() {
        super.account();
        System.out.println(taxOfCompany=income/10);
    }
}
