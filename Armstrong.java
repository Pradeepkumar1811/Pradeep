import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0,temp=n,m=n,ans=0;
    while(n>0){
      count++;
      n/=10;
    }
    while(m>0){
      ans+=(Math.pow(m%10,count));
      m/=10;
    }
    if(ans==temp){
      System.out.println(temp+" Is Armstrong Number");
    }
    else{
      System.out.println(temp+" Is Not Armstrong Number");
    }
  }
}
  
