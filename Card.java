package project;

public class Card {
    private int CardPIN;
    private int Balance;

    public Card(int CardPIN, int Balance) {
        this.CardPIN = CardPIN;
        this.Balance = Balance;
    }

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
