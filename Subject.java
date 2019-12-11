import java.util.ArrayList;
import java.util.List;

public class Subject {

    //create list of multiple observers
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    //when state is set, notify all observers
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    //add observer to observer list
    public void attach(Observer observer){
        observers.add(observer);
    }

    //update all the observers
    public void notifyAllObservers(){
        for(Observer observer: observers){
            observer.update();
        }
    }
}
