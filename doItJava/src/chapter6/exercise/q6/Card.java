package chapter6.exercise.q6;

public class Card {
    private int cardNo;
    private static int serialNum = 1000;

    public Card() {
        serialNum++;
        cardNo = serialNum;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

}
