package sololearn;

import java.text.DecimalFormat;
import java.util.Scanner;
class MyException extends Exception
{
     public MyException(String Message)
    {
     	super(Message);
    }
}

public class Account1 {
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 500;
	private double savingBalance = 500;
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("###,##0.00");

	public int setCustomerNumber(int customerNumber) 
	{
		this.customerNumber = customerNumber;
		return customerNumber;
	}

	public int getCustomerNumber() 
	{
		return customerNumber;
	}

	public int setPinNumber(int pinNumber) 
	{
		this.pinNumber = pinNumber;
		return pinNumber;
	}

	public int getPinNumber() 
	{
		return pinNumber;
	}

	public double getCheckingBalance()
	{
		return checkingBalance;
	}

	public double getSavingBalance() 
	{
		return savingBalance;
	}
	public double calCheckingWithdraw(double amount)
	{
		checkingBalance=(checkingBalance-amount);
		return checkingBalance;
	}
	public double calSavingWithdraw(double amount)
	{
		savingBalance=(savingBalance-amount);
		return savingBalance;
	}
	public double calCheckingDeposit(double amount)
	{
		checkingBalance=(checkingBalance+amount);
		return checkingBalance;
	}
	public double calSavingDeposit(double amount)
	{
		savingBalance=(savingBalance+amount);
		return savingBalance;
	}
	public void getCheckingWithdrawInput() throws MyException
	{
    	System.out.println("Please Maintain Minimum Balance of 500 Rupees");
		System.out.println("checking account balance :"+moneyFormat.format(checkingBalance));
		System.out.println("Amount you to withdraw from checking account");
		double amount=input.nextDouble();
		if((checkingBalance-amount)<500)
		{
			throw new MyException("Maintain minimun balance");

			//calCheckingWithdraw(amount);
		}
		else
		{
			calCheckingWithdraw(amount);
			System.out.println("****Please Collect Your Cash****");
		}
	}
	public void getSavingWithdrawInput() throws MyException
	{
    	System.out.println("Please Maintain Minimum Balance of 500 Rupees");
		System.out.println("saving account balance :"+moneyFormat.format(savingBalance));
		System.out.println("Amount you to withdraw from saving account");
		double amount=input.nextDouble();
		if((savingBalance-amount)<500)
		{
			throw new MyException("Maintain minimun balance");
		}
		else
		{
			if((savingBalance-amount)>0)
			{
				calSavingWithdraw(amount);
                System.out.println("****Please Collect Your Cash****");
			}
			else
			{
			System.out.println("Insufficient funds"+"\n");
			}
		}
	}
	public void getCheckingDepositInput()
	{
		System.out.println("checking account balance :"+moneyFormat.format(checkingBalance));
		System.out.println("Amount you to Deposit to checking account");
		double amount=input.nextDouble();
		if((amount)>0)
		{
			calCheckingDeposit(amount);
            System.out.println("****Your Amount  "+amount+ "  Deposited Sucessfully****");

		}
		else
		{
			System.out.println("Balance Cannot be negative:"+"\n");
		}
	}
	public void getSavingDepositInput()
	{
		System.out.println("saving account balance :"+moneyFormat.format(savingBalance));
		System.out.println("Amount you to Deposit to saving account");
		double amount=input.nextDouble();
		if((amount)>0)
		{
			calSavingDeposit(amount);
            System.out.println("****Your Amount  "+amount+ "  Deposited Sucessfully****");

			
		}
		else
		{
			System.out.println("wrong input:"+"\n");
		}
	}

}

