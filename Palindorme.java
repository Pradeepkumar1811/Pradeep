import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n,ans=0;
    while(n>0){
      ans=ans*10+(n%10);
      n/=10;
    }
    if(ans==temp){
      System.out.println(temp+" Is Palindrome");
    }
    else{
      System.out.println(temp+" Is Not Palindrome");
    }
  }
}
