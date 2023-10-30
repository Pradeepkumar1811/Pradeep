import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean f=true;
    for(int i=2;i*i<=n;i++){
        if(n%i==0){
            f=false;
            System.out.println(n+" Is Not A PrimeNumber");
            break;
        }
    }
    if(f){
        System.out.println(n+" Is A PrimeNumber");
    }
  }
}
