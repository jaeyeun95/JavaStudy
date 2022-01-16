package chapter8.polymorphism;

public class VIPCustomer extends Customer {
    private int agentID; // VIP 고객 담당 상담원 아이디
    double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        // System.out.println("매개 변수가 있는VIPCustomer() 생성자 호출");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }

    // public String showVIPInfo() {
    // return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + "입니다";
    // }

    @Override
    public String showCustomerInfo() {
        // TODO Auto-generated method stub
        return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + "입니다";
    }

    public int getAgentID() {
        return agentID;
    }

}
