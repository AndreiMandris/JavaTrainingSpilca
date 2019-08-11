package designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<ListenerInterface> listeners = new ArrayList();

    public void addListener(ListenerInterface listener){
        listeners.add(listener);
    }

    public void removeListener(ListenerInterface listener) {
        listeners.remove(listener);
    }

    public void changeSubject(){
        //do something
        notifyListeners();
    }

    private void notifyListeners(){
        listeners.forEach(ListenerInterface::subjectChanged);
    }
}
