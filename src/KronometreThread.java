import static java.lang.Thread.sleep;

public class KronometreThread implements Runnable {

    private Thread thread;
    private String threadName;
    public KronometreThread(String threadName){
        this.threadName = threadName;
        System.out.println("Oluşturuluyor" + threadName);
    }


    @Override
    public void run() {
        System.out.println("Çalıştırılıyor : " + this.threadName);
        try {
            for (int i =0;i<=10;i++){
                System.out.println(threadName + ": " +i);
                sleep(1000);
            }

            }catch (InterruptedException e){
            System.out.println("Kesildi : " + threadName);
        }finally {
            System.out.println("Thread Bitti");
        }

        thread.run();
    }

    public void start(){
        System.out.println("Thread nesnesi Oluşuyor.");
        if(thread==null){
            thread=new Thread(this,threadName);
            thread.start();
            thread.run();
        }
    }

}
