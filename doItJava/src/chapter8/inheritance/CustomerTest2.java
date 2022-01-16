package chapter8.inheritance;

public class CustomerTest2 {
    public static void main(String[] args) {
        VIPCustomer Kim = new VIPCustomer();
        Kim.setCustomerID(10020);
        Kim.setCustomerName("김유신");
        Kim.bonusPoint = 10000;
        System.out.println(Kim.showCustomerInfo());

    }

}
