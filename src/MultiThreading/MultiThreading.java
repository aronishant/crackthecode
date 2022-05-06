package MultiThreading;

public class MultiThreading implements Runnable {


    private final int threadNumber;

    public MultiThreading(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread number " + threadNumber);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            MultiThreading obj = new MultiThreading(i);
            Thread objNew= new Thread(obj);
            objNew.start();
        }
    }
}
