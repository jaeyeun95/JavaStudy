package chapter8.polymorphism;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer() {
        // customerGrade = "SIVER";
        // bonusRatio = 0.01;
        // 초기화 부분을 메서드로 뺌
        initCustomer();
        // System.out.println("customer() 생성자 호출");
    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        initCustomer();
        // System.out.println("Customer(int, String) 생성자 호출");
    }

    // 멤버 변수 초기화 부분
    public void initCustomer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다. ";
    }

}
