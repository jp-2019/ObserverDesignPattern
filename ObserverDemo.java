public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        subject.setState(12);
        System.out.println("-----------------------------------------------------");
        System.out.println("Now the state changes again...");
        System.out.println("-----------------------------------------------------");
        subject.setState(13);
    }
}
