package com.capgemini.abstractclass;
import java.util.Scanner;

public class CurrentMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		CurrentAccount ca = new CurrentAccount();
		ca.openAccount();
		while (ch == 'y') {
			System.out.println("Enter the choice");
			System.out.println("viewAcc");
			System.out.println("addMoney");
			System.out.println("withDrawMoney");
			System.out.println("CheckBal");
			String option = sc.next();
			switch (option) {
			case "viewAcc": 
				ca.viewAccount();
				break;
			case "addMoney":
				ca.addMoney();
				break;
			case "withDrawMoney":
				ca.withDraw();
				break;
			case "CheckBal":
				ca.checkBalance();
				break;
			default:
				System.out.println("Not valid option");

			}// switch close
			System.out.println("do you want to continue");
			ch = sc.next().trim().charAt(0);
		} // while close
	}
}
