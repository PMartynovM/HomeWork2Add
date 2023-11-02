package InterfaceRunnable;

public class Main {
    public static void main(String[] args) {
        InterfaceR interfaceR = new InterfaceR();
        Thread t1 = new Thread(interfaceR);
        t1.start();
        Bird bT1 = new Bird();
        bT1.start();
    }
}
