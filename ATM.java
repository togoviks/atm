package project;

public class ATM {
    private boolean access = false;
    private Card currentCard;
    private boolean cardIn = false;

    public void insertCard(Card newCard) {
        if (!cardIn) {
            currentCard = newCard;
            cardIn = true;
        }
    }

    public void enterPIN(int PIN) {
        if (currentCard.getCardPIN() == PIN) {
            access = true;
            System.out.println("Доступ разрешён");
        } else {
            System.out.println("Неверный ПИН");
        }
    }

    public void checkBalance() {
        if (!access) {
            System.out.println("Доступ запрещён");
            return;
        }
        System.out.println("Текущий баланс: " + currentCard.getBalance());
        }

    public void addToBalance(int sum) {
        if (!access) {
            System.out.println("Доступ запрещён");
            return;
        }
            int newBalance = currentCard.getBalance() + sum;
            currentCard.receiveBalance(newBalance);
            System.out.println("Баланс пополнен на " + sum + " рублей, текущий баланс: " + newBalance);
    }

    public void takeOffBalance(int sum) {
        if (!access) {
            return;
        }
        if (checkCardBalance(sum)) {
            int newBalance = currentCard.getBalance() - sum;
            currentCard.receiveBalance(newBalance);
            System.out.println("Со счёта списано " + sum + " рублей, текущий баланс: " + newBalance);
        } else {
            if (!access) {
                System.out.println("Доступ запрещён");
                return;
            }
            if (checkCardBalance(sum)) {
                System.out.println("Недостаточно средств");
            }
        }
    }

    private boolean checkCardBalance(int sum) {
        return currentCard.getBalance() > sum;
    }

    public void cardTakeOut() {
        access = false;
        cardIn = false;
    }

}
