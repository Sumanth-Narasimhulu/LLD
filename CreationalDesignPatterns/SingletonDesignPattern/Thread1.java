package CreationalDesignPatterns.SingletonDesignPattern;

public class Thread1 extends Thread{
    @Override
    public void run(){
        Logger logger = Logger.getInstance();
        System.out.println("Logger instance in Thread1: " + logger);
    }
    
}
