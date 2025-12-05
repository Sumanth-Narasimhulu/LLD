package CreationalDesignPatterns.SingletonDesignPattern;

public class Thread3 extends Thread{
    @Override
    public void run(){
        Logger logger = Logger.getInstance();
        System.out.println("Logger instance in Thread3: " + logger);
    }
    
}
