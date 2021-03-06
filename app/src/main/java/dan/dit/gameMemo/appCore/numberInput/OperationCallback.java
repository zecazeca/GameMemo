package dan.dit.gameMemo.appCore.numberInput;

public interface OperationCallback {
    boolean removeOperation(Operation toRemove);
    void newOperation(Operation toAdd, int position); // toAdd can be null
    OperationListener getActiveListener(); // the first active listener or whatever priority is defined there, used for reselecting after selection change
}
