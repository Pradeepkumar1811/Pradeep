class Employee{
    String name;
    int age;
    String department;
    int salary;
    Employee(){
        this.name="pradeep";
        this.age=21;
        this.department="Testing";
        this.salary=35000;
        this.printInfo();
    }
    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(department);
        System.out.println(salary);
    }
}
public class Main
{
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.name="Kumar";
		e1.age=25;
		e1.department="Developer";
		e1.salary=40000;
		e1.printInfo();
	}
}
