class Bank{
    String bankName;
    String location;
    int regno;
    Bank(){
        bankName="SBI";
        location="chennai";
        regno=1075;
        infoOfBank();
    }
    public void infoOfBank(){
        System.out.printf(bankName+"\n"+location+"\n"+regno+"\n");
    }  
}
public class Main
{
	public static void main(String[] args) {
	    Bank b=new Bank();
	    b.bankName="INDIAN";
	    b.location="Coimbatore";
	    b.regno=1995;
	    b.infoOfBank();
	}
}
