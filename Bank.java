
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Banking!");
		Account ac=new Account();
		ac.setBankAccount(101, "acc123", 5000);
		ac.showBankAccount();
		

	}

}

class Account{
 	 int bankAccountNumber;
 	 double accBalance;
 	 String accPassword;
 	 public String bankName;
 	 
 	void setBankAccount(int acno,String password,double bal) {
 		 bankAccountNumber=acno;
 		 accPassword=password;
 		 accBalance=bal; 
 	 }
 	
 	void showBankAccount()
 	 {
 		 System.out.println("Acc no :" + bankAccountNumber);
 		 System.out.println("Acc holder password:" + accPassword);
 		 System.out.println("Acc Bal:" + accBalance);
 	 }	 
 	
}