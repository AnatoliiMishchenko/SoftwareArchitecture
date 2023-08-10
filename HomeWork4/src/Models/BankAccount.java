package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {





   int oldCard;
   int card;
   int balance;

    public BankAccount() {
        this.card = oldCard + 1;
        oldCard = this.card;
        balance = 1000;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }

    public long getCard() {
        return 0;
    }

    public int getBalance() {
        return 0;
    }

    public void setBalance(int i) {
    }
}
