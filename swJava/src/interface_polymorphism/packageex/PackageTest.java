package interface_polymorphism.packageex;

import interface_polymorphism.packageex.enterprise.Customer;

public class PackageTest {
    public static void main(String[] args) {
        Customer kim = new Customer();
        kim.printInfo();

        Customer sung = new Customer();
        sung.printInfo();
        
        interface_polymorphism.packageex.personal.Customer A전자 = new interface_polymorphism.packageex.personal.Customer();
        A전자.printInfo();
    }
    
}
