package Task2.Threading;

public class multiThread implements Runnable{
    public static void main(String[] args) {
        Thread thread1 = new Thread("Sentinals");
        Thread thread2 = new Thread("Eternals");
        thread1.start();
        thread2.start();
        System.out.println("Thread names are following:");
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
    }
    @Override
    public void run() {
    }
}
//output
//Thread names are following:
//Sentinals
//Eternals
