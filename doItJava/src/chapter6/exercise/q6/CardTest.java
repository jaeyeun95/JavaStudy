package chapter6.exercise.q6;

public class CardTest {
    public static void main(String[] args) {
        CardCompany company = CardCompany.getInstance();
        Card myCard = company.createCard();
        Card yourCard = company.createCard();

        System.out.println(myCard.getCardNo());
        System.out.println(yourCard.getCardNo());
    }

}
