package day3.Animal.Animal1.Task3;

public class Accounting extends ItCompany{
  //  protected  int countOfEmployers;
    protected   String departmentName;

    @Override
    protected void account() {
        super.account();
      //  System.out.println("countOfEmployers=" + countOfEmployers);
        System.out.println("departmentName=" + departmentName);
    }
}
