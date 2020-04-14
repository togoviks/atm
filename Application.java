package project;

public class Application {
    public static void main(String[] args) {
        ATM newATM = new ATM();
        newATM.insertCard(1234);
        newATM.checkBalance();
        newATM.addToBalance(50);
        newATM.takeOffBalance(100);
    }
}
