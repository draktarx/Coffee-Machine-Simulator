package machine;

public class CoffeeMachine {

    UserInputManager userInputManager = new UserInputManager();

    ResourcesManager resourcesManager;
    CashManager cashManager;
    StateManager stateManager;
    Bartender bartender;

    private void loadExerciseData() {
        resourcesManager = new ResourcesManager(400, 540, 120, 9);
        cashManager = new CashManager(550);
        stateManager = new StateManager();
    }

    public void startMenu() {
        loadExerciseData();
        do {
            stateManager.askNextAction(userInputManager);
            performUserAction();
        } while (!stateManager.isExitState());
    }

    private void performUserAction() {
        switch (stateManager.getActualState()) {
            case BUY:
                do {
                    buy();
                } while (!stateManager.isMenuState());
                break;
            case FILL:
                fill();
                returnToMenu();
                break;
            case TAKE:
                cashManager.takeCash();
                returnToMenu();
                break;
            case REMAINING:
                System.out.printf("%nThe coffee machine has:%n");
                resourcesManager.remainingResources();
                cashManager.remainingCash();
                returnToMenu();
                break;
            case EXIT:
                exit();
                break;
            default:
                break;
        }
    }

    /**
     * Machine state methods
     */


    private void returnToMenu() {
        stateManager.setActualState(CoffeeMachineState.MENU);
    }

    private void buy() {
        System.out.printf("%nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:%n");
        System.out.print("> ");
        switch (userInputManager.scanUserAction()) {
            case "1":
                prepareEspresso();
                returnToMenu();
                break;
            case "2":
                prepareLatte();
                returnToMenu();
                break;
            case "3":
                prepareCappuccino();
                returnToMenu();
                break;
            case "back":
                returnToMenu();
                break;
            default:
                System.out.println("Invalid order type!");
                break;
        }
    }

    private void fill() {
        System.out.println();
        resourcesManager.fillWater(userInputManager);
        resourcesManager.fillMilk(userInputManager);
        resourcesManager.fillCoffeeBeans(userInputManager);
        resourcesManager.fillCups(userInputManager);
    }

    private static void exit() {
        System.exit(0);
    }


    /**
     * Prepare beverages
     */
    private void prepareEspresso() {
        Beverage beverage = Beverage.ESPRESSO;
        resourcesManager.getIngredients(beverage);
        cashManager.charge(beverage.getPrice());
    }

    private void prepareLatte() {
        Beverage beverage = Beverage.LATTE;
        resourcesManager.getIngredients(beverage);
        cashManager.charge(beverage.getPrice());
    }

    private void prepareCappuccino() {
        Beverage beverage = Beverage.CAPPUCCINO;
        resourcesManager.getIngredients(beverage);
        cashManager.charge(beverage.getPrice());
    }

    /**
     * Main
     */
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.startMenu();
    }
}
