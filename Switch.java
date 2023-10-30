import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int colour=sc.nextInt();
    switch(colour){
        case 1:
            System.out.println("Orange");
            break;
        case 2:
            System.out.println("Green");
            break;
        case 3:
            System.out.println("Red");
            break;
        case 4:
            System.out.println("Black");
            break;
        default:
            System.out.println("Others");
    }
  }
}
