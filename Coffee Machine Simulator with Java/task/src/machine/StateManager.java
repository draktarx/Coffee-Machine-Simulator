package machine;

public class StateManager {

    CoffeeMachineState actualState = CoffeeMachineState.MENU;

    public void askNextAction(UserInputManager userInputManager) {
        System.out.printf("%nWrite action (buy, fill, take, remaining, exit):%n");
        System.out.print("> ");
        switch (userInputManager.scanUserAction()) {
            case "buy":
                actualState = CoffeeMachineState.BUY;
                break;
            case "fill":
                actualState = CoffeeMachineState.FILL;
                break;
            case "take":
                actualState = CoffeeMachineState.TAKE;
                break;
            case "remaining":
                actualState = CoffeeMachineState.REMAINING;
                break;
            case "exit":
                actualState = CoffeeMachineState.EXIT;
                break;
            default:
                //System.out.println("Invalid action!");
                break;
        }
    }

    public CoffeeMachineState getActualState() {
        return actualState;
    }

    public void setActualState(CoffeeMachineState actualState) {
        this.actualState = actualState;
    }

    public boolean isExitState() {
        return actualState == CoffeeMachineState.EXIT;
    }

    public boolean isMenuState() {
        return actualState.equals(CoffeeMachineState.MENU);
    }
}
