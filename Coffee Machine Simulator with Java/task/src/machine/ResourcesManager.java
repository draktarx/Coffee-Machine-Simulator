package machine;

public class ResourcesManager {

    int water;
    int milk;
    int coffeeBeans;
    int cups;

    public ResourcesManager(int water, int milk, int coffeeBeans, int cups) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
    }

    public void remainingResources() {
        System.out.printf("%d ml of water%n", water);
        System.out.printf("%d ml of milk%n", milk);
        System.out.printf("%d g of coffee beans%n", coffeeBeans);
        System.out.printf("%d disposable cups%n", cups);
    }

    private boolean hasEnoughResources(Beverage beverage) {
        boolean hasEnoughResources = false;

        if (!machineHasEnoughWater(beverage)) {
            System.out.println("Sorry, not enough water!");
        } else if (!machineHasEnoughMilk(beverage)) {
            System.out.println("Sorry, not enough milk!");
        } else if (!machineHasEnoughCoffeeBeans(beverage)) {
            System.out.println("Sorry, not enough beans!");
        } else if (!machineHasEnoughCups()) {
            System.out.println("Sorry, not enough cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            hasEnoughResources = true;
        }

        return hasEnoughResources;
    }

    public void getIngredients(Beverage b) {
        if (hasEnoughResources(b)) {
            useWater(b.needWater());
            useMilk(b.needMilk());
            useBeans(b.needCoffee());
            useCups(1);
        }
    }

    public void fillWater(UserInputManager userInputManager) {
        System.out.printf("Write how many ml of water you want to add:%n");
        System.out.print("> ");
        this.water += userInputManager.scanUserNumber();
    }

    public void fillMilk(UserInputManager userInputManager) {
        System.out.printf("Write how many ml of milk you want to add:%n");
        System.out.print("> ");
        this.milk += userInputManager.scanUserNumber();
    }

    public void fillCoffeeBeans(UserInputManager userInputManager) {
        System.out.printf("Write how many grams of coffee beans you want to add:%n");
        System.out.print("> ");
        this.coffeeBeans += userInputManager.scanUserNumber();
    }

    public void fillCups(UserInputManager userInputManager) {
        System.out.printf("Write how many disposable cups you want to add:%n");
        System.out.print("> ");
        this.cups += userInputManager.scanUserNumber();
    }

    public void useWater(int water) {
        this.water -= water;
    }

    public void useMilk(int milk) {
        this.milk -= milk;
    }

    public void useBeans(int beans) {
        this.coffeeBeans -= beans;
    }

    public void useCups(int cups) {
        this.cups -= cups;
    }

    private boolean machineHasEnoughWater(Beverage beverage) {
        return water >= beverage.needWater();
    }

    private boolean machineHasEnoughMilk(Beverage beverage) {
        return milk >= beverage.needMilk();
    }

    private boolean machineHasEnoughCoffeeBeans(Beverage beverage) {
        return coffeeBeans >= beverage.needCoffee();
    }

    private boolean machineHasEnoughCups() {
        return cups >= 1;
    }

}
