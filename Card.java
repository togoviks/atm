package project;

public class Card {
    private int CardPIN = 1234;
    private int Balance = 100;

    public boolean checkPIN(int PIN) {
        if (PIN == CardPIN) {
            return true;
        } else {
            return false;
        }
    }

    public int getBalance() {
        return Balance;
    }

    public void receiveBalance(int newBalance) {
        Balance = newBalance;
    }

}
