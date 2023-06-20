package MultiThreading_Basics;

public class ImplRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

        ImplRunnable implRunnable=new ImplRunnable();
        implRunnable.run();

    }
}
