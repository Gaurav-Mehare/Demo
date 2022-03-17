/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankingsoftware;

/**
 *
 * @author pcshree
 */
public class Customer {
    private static long aadharno;
    private static String customer_Name;
    private static double balance;

    public Customer( String name, int aadharno, double balance ) {
      
        this.customer_Name = name;
        this.balance = balance;
        this.aadharno = aadharno;
       
    }
    
    public void printCustomerDetails(){
        
    }

    public static long getAadharno() {
        return aadharno;
    }

    public static void setAadharno(long aadharno) {
        Customer.aadharno = aadharno;
    }

    public static String getCustomer_Name() {
        return customer_Name;
    }

    public static void setCustomer_Name(String customer_Name) {
        Customer.customer_Name = customer_Name;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        Customer.balance = balance;
    }
  
}
