package project;

public class Application {
    public static void main(String[] args) {
        ATM newATM = new ATM();
        Card card1 = new Card(1234, 100);

        newATM.insertCard(card1);
        newATM.enterPIN(1234);
        newATM.checkBalance();
        newATM.addToBalance(50);
        newATM.takeOffBalance(150);
    }
}
