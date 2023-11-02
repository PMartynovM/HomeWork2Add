package InterfaceRunnable;

public class Bird extends Thread {

        @Override
        public void run() {
            System.out.println("птичка");
            System.out.println("ЧИКИ-БРИКИ");
        }
}
