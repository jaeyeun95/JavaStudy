package exceptionex;

class BadBankingException extends Exception{
    public BadBankingException(String s){
        super(s);
    }
}

class Account {
    String name;
    int currentMoney;

    public Account(String name, int currentMoney){
        this.name = name;
        this.currentMoney = currentMoney;
    }

    public void withdraw(int money) throws BadBankingException{
        if (currentMoney < money) {
            throw new BadBankingException("잔액이 부족합니다.");
        }
        currentMoney = currentMoney - money;    
    }

    @Override
    public String toString() {
        return "Account [currentMoney=" + currentMoney + ", name=" + name + "]";
    }
    
}

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            Account kim = new Account("김재준", 100);
            kim.withdraw(150);
            System.out.println(kim.toString());
        } catch (BadBankingException e) {
            System.out.println(e.getMessage());
        }
    }
}
