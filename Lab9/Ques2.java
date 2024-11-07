public class Ques2 {
    public static void main(String[] args) {
        // using the NumberPrinter class, making its object, then using the start method
        NumberPrinter printerThread = new NumberPrinter();
        printerThread.start();
    }
}
class NumberPrinter extends Thread {
    public void run() {
        // printing 1 to 10 with some delay using thread
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                // Sleep for 500 milliseconds (0.5 seconds)
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }
}
