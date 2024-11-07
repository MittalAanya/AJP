public class Ques1{
    public static void main(String[] args) {
        // using the NumberPrinter class, making its object, then using the start method
        NumberPrinter printerThread = new NumberPrinter();
        printerThread.start();
    }
}
class NumberPrinter extends Thread {
    public void run() {
        // printing 0 to 4 with some delay using thread
        for (int i = 0; i <= 4; i++) {
            System.out.println(i);
            try {
                // Sleep for a short period to simulate some delay
                Thread.sleep(500); // 500 milliseconds = 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}