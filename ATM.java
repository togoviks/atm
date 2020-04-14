package project;

public class ATM {
    private boolean access = false;
    private Card currentCard;

    public void insertCard(int PIN) {
        Card newCard = new Card();

        if (newCard.checkPIN(PIN)) {
            access = true;
            System.out.println("Доступ разрешён");
            currentCard = newCard;
        } else {
            System.out.println("Неверный ПИН");
        }
    }

    public void checkBalance() {
        if (access) {
            System.out.println("Текущий баланс: " + currentCard.getBalance());
        } else {
            System.out.println("Доступ запрещён");
        }

    }

    public void addToBalance(int sum) {
        if (access) {
            int newBalance = currentCard.getBalance() + sum;
            currentCard.receiveBalance(newBalance);
            System.out.println("Баланс пополнен на " + sum + " рублей, текущий баланс: " + newBalance);
        } else {
            System.out.println("Доступ запрещён");
        }
    }

    public void takeOffBalance(int sum) {
        if (access) {
            int newBalance = currentCard.getBalance() - sum;
            currentCard.receiveBalance(newBalance);
            System.out.println("Со счёта списано " + sum + " рублей, текущий баланс: " + newBalance);
        } else {
            System.out.println("Доступ запрещён");
        }
    }


}
