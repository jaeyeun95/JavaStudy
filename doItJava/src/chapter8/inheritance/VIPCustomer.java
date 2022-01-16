package chapter8.inheritance;

public class VIPCustomer extends Customer {
    private int agentID; // VIP 고객 담당 상담원 아이디
    double saleRatio;

    public VIPCustomer() {
        super();
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() 생성자 호출");
    }

    public int getAgentID() {
        return agentID;
    }

    public String showVIPInfo() {
        return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + "입니다";
    }

}
