package com.cg.pl;
import com.cg.bean.*;
import com.cg.service.AccountService;
import com.cg.service.Gst;
public class MyWallet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // Account ob = new Account(); abstract class can't be instantiated     
    AccountService service=new AccountService();
     
      
      SavingAccount ob2 = new SavingAccount(101,333333333,"Shivam",55000.00);
      service.printStatement(ob2);  //calling default method of Transaction;
      double b1=service.withdraw(ob2, 5000.00);
      System.out.println("After withdraw balance is"+b1);
      
      double tax=service.calculateTax(Gst.PCT_5, b1);
      System.out.println("Gst is "+tax);
      
     
	}
	
	

}
