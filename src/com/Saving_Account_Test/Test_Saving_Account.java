package com.Saving_Account_Test;

import com.Saving_Account.SavingAccount;
import com.Saving_Account_cust1.Customer1;
import com.Saving_Account_cust2.Customer2;

public class Test_Saving_Account {

	public static void main(String[] args) throws InterruptedException {

		SavingAccount sa = new SavingAccount(5656, "Saurabh", 600);

		Customer1 c1 = new Customer1(sa);
		Customer2 c2 = new Customer2(sa);

		Thread t1 = new Thread(c2);

		c1.start();
		t1.start();
//			
//			 try {
//		            c1.join(); // Wait for Customer1 thread to finish
//		            t1.join(); // Wait for Customer2 thread to finish
//		        } catch (InterruptedException e) {
//		            e.printStackTrace();
//		        }

		c1.join();
		t1.join();

		System.out.println("Final Balance: " + sa.getBalance());

	}

}
