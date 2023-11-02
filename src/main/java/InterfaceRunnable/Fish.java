package InterfaceRunnable;

public class Fish extends Thread {
    @Override
    public void run() {
        System.out.println("Бульк");
    }
}