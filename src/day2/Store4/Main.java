package day2.Store4;

public class Main {
    public static void main(String[] args) {
        int array[]={10,20,30,40,50};
        Store store=new Store(50,"Aaaaa","91123456",array);
        System.out.println(store.getPhoneNumber());
        store.setPhoneNumber("4k613131");
        System.out.println(store.getPhoneNumber());
    }
}
