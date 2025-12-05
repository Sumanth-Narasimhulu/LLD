package CreationalDesignPatterns.SingletonDesignPattern;

public class Thread2 extends Thread{
    @Override
    public void run(){
        Logger logger = Logger.getInstance();
        System.out.println("Logger instance in Thread2: " + logger);
    }
    
}
