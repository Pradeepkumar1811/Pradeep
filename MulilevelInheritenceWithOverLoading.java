import java.util.*;
class Shape{
    public void printColor(String s){
        System.out.println("Color Of "+s+" Is Blue");
    }
    public void area(String s){
        System.out.println("AreaOf"+s);
    }
}
class Triangle extends Shape{
    public void area(double base,double height){
        System.out.println((double)1/2*base*height);
    }
}
class Circle extends Triangle{
    public void area(int r){
        System.out.println((double)22/7*r*r);
    }
}
public class MultilevelInheritenceWithOverLoading
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		String s=sc.next();
		double base=sc.nextDouble();
		double height=sc.nextDouble();
		String str=sc.next();
		int radius=sc.nextInt();
		c.printColor(s);
		c.area(s);
		c.area(base,height);
		c.printColor(str);
		c.area(str);
		c.area(radius);
	}
}
