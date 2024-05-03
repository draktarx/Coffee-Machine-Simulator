package machine;

public class CashManager {

    int cash;

    public CashManager(int cash) {
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public void charge(int amount) {
        this.cash += amount;
    }

    public void takeCash() {
        System.out.printf("%nI gave you $%d%n", cash);
        cash = 0;
    }

    public void remainingCash() {
        System.out.printf("$%d of money%n", cash);
    }
}
