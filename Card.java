package project;

public class Card {
    private int CardPIN;
    private int Balance;

    public Card(int CardPIN, int Balance) {
        this.CardPIN = CardPIN;
        this.Balance = Balance;
    }

    public int getCardPIN() {
        return CardPIN;
    }

    public int getBalance() {
        return Balance;
    }

    public void receiveBalance(int newBalance) {
        Balance = newBalance;
    }

}
