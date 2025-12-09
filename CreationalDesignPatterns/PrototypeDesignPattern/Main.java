package CreationalDesignPatterns.PrototypeDesignPattern;

public class Main {
    
    public static void main(String[] args) {
       
        System.out.println("Prototype Design Pattern Main Class");

        IdCard masterIdCard = new IdCard("Kyndryl","Red","1001","Master Employee");

        IdCard emp1 = (IdCard)masterIdCard.clone();
        emp1.setemployeeId("1002");
        emp1.setemployeeName("Alice");
        IdCard emp2 = (IdCard)masterIdCard.clone();
        emp2.setemployeeId("1003");
        emp2.setemployeeName("Bob");
        System.out.println("Displaying Master ID Card:");
        masterIdCard.display();
        System.out.println("Displaying Employee 1 ID Card:");
        emp1.display();
        System.out.println("Displaying Employee 2 ID Card:");
        emp2.display();

    }

}
