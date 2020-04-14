package project;

public class Card {
    private int cardPIN;
    private int balance;

    public Card(int CardPIN, int Balance) {
        this.cardPIN = CardPIN;
        this.balance = Balance;
    }

    public int getCardPIN() {
        return cardPIN;
    }

    public int getBalance() {
        return balance;
    }

    public void receiveBalance(int newBalance) {
        balance = newBalance;
    }

}
