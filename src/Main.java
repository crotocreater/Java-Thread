import demoThread.Threa2;
import demoThread.Thread1;

public class Main {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Threa2 threa2 = new Threa2();
        Thread thread = new Thread(threa2);
        thread1.start();
        thread.start();
    }
}