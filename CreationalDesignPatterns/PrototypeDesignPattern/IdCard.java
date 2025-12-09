package CreationalDesignPatterns.PrototypeDesignPattern;

public class IdCard implements Prototype {
    String company;
    String color;
    String employeeId;
    String employeeName;
    public IdCard(String company, String color, String employeeId, String employeeName) {
        this.company = company;
        this.color = color;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    @Override
    public Prototype clone() {
        return new IdCard(this.company, this.color, this.employeeId, this.employeeName);    

    }
    public void setemployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    public void setemployeeId(String employeeId){
        this.employeeId = employeeId;
    }
    public void display(){
        System.out.println("Company: " + company + ", Color: " + color + ", Employee ID: " + employeeId + ", Employee Name: " + employeeName);
    }
}
