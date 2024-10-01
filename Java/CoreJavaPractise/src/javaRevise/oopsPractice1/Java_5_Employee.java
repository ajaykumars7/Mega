package javaRevise.oopsPractice1;



class Employee{
    String name;
    double salary;
}
class Manager extends Employee{
    double bonus;
    Manager(String name, double salary, double bonus){
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }
    public double totalSalary(){
        return (this.bonus + this.salary);
    }

}
public class Java_5_Employee {
    public static void main(String[] args) {
        Manager manager = new Manager("Ajay", 70000, 3000);
        System.out.println(manager.totalSalary());
    }
}
