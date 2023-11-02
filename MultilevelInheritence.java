import java.util.*;
class Shape{
    public void printColor(String s){
        System.out.println("Color Of "+s+" Is Blue");
    }
}
class Triangle extends Shape{
    public void areaOfTriangle(double base,double height){
        System.out.println("areaOfTriangle: "+(double)1/2*base*height);
    }
}
class Circle extends Triangle{
    public void areaOfCircle(double r){
        System.out.println("areaOfCircle: "+(double)22/7*r*r);
    }
}
public class MultilevelInheritence
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		String s=sc.next();
		double base=sc.nextDouble();
		double height=sc.nextDouble();
		String str=sc.next();
		double radius=sc.nextDouble();
		c.printColor(s);
		c.areaOfTriangle(base,height);
		c.printColor(str);
		c.areaOfCircle(radius);
	}
}
