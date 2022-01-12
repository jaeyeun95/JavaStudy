package chapter5.classpart;

class Order {
    long orderNo;
    String userId;
    String orderDate;
    String userName;
    String productNo;
    String address;
}

public class Practice2 {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderNo = 201803120001L;
        order.userId = "abc123";
        order.orderDate = "2018년 3월 12일";
        order.userName = "홍길순";
        order.productNo = "PD0345-12";
        order.address = "서울시 영등포구 여의도동 20번지";

        System.out.println("주문 번호 : " + order.orderNo);
        System.out.println("주문자 아이디 : " + order.userId);
        System.out.println("주문 날짜 : " + order.orderDate);
        System.out.println("주문자 이름 : " + order.userName);
        System.out.println("주문 상품 번호 : " + order.productNo);
        System.out.println("배송 주소 : " + order.address);

    }

}
