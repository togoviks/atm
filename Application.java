package project;

public class Application {
    public static void main(String[] args) {
        ATM newATM = new ATM();
        Card card1 = new Card(1234, 100);

        newATM.insertCard(card1, 1234);
        newATM.checkBalance();
        newATM.addToBalance(50);
        newATM.takeOffBalance(100);

        ATM newATM2 = new ATM();
        Card card2 = new Card(1111, 500);

        newATM2.insertCard(card2, 1111);
        newATM2.checkBalance();
        newATM2.addToBalance(50);
        newATM2.takeOffBalance(100);


    }
}
