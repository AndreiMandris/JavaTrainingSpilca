package designpatterns.observer;

public class ListenerImpl implements ListenerInterface {

    @Override
    public void subjectChanged(){
        System.out.println("The subject changed!");
    }
}
