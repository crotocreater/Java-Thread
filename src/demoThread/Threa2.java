package demoThread;

public class Threa2 implements Runnable{
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("B "+ i );
        }
    }
}
