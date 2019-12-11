public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        //this subject comes from abstract class
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Dec String " + Integer.toOctalString(subject.getState()));
    }
}
