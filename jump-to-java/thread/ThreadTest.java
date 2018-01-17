public class ThreadTest extends Thread {
    int tid;

    public ThreadTest(int tid) {
        this.tid = tid;
    }

    public void run () {
        System.out.println(this.tid + "th thread starts.");
        try {
            Thread.sleep(1000); // sleep method is static
        }catch(Exception e) {

        }
        System.out.println(this.tid+"th thread end. ");
    }

    public static void main (String[] args) {
        for(int i=0;i<10;i++) {
            Thread t = new ThreadTest(i);
            t.start();
        }
        System.out.println("main end.");
    }
}