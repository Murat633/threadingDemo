public class Main {
    public static void main(String[] args) {
        KronometreThread kronometreThread = new KronometreThread("Thread");
        KronometreThread kronometreThread1 = new KronometreThread("Thread");
        KronometreThread kronometreThread2 = new KronometreThread("Thread");
        kronometreThread.start();
        kronometreThread1.start();
        kronometreThread2.start();
    }
}