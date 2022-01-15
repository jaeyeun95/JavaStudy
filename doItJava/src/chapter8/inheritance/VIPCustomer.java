package chapter8.inheritance;

public class VIPCustomer extends Customer {
    private int agentID; // VIP 고객 담당 상담원 아이디
    double saleRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }

}
