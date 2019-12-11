public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        //this subject comes from abstract class
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Hex String " + Integer.toHexString(subject.getState()));
    }
}

