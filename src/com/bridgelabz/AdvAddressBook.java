package com.bridgelabz;

import java.util.Scanner;

public class AdvAddressBook {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		String[][] AdvAddressBooks = new String[100][8];
		
		AdvAddressBooks[0][0]="Mobile Number";
		AdvAddressBooks[0][1]="First Name";
		AdvAddressBooks[0][2]="Last Name";
		AdvAddressBooks[0][3]="Address";
		AdvAddressBooks[0][4]="City";
		AdvAddressBooks[0][5]="Country";
		AdvAddressBooks[0][7]="Telephone Number";
		
		AdvAddressBooks[0][0]="7867";
		AdvAddressBooks[0][1]="Pooja";
		AdvAddressBooks[0][2]="Katkar";
		AdvAddressBooks[0][3]="Mumbai";
		AdvAddressBooks[0][4]="Mumbai";
		AdvAddressBooks[0][5]="India";
		AdvAddressBooks[0][7]="343432";
		
		AdvAddressBooks[0][0]="43543";
		AdvAddressBooks[0][1]="Priya";
		AdvAddressBooks[0][2]="Sharma";
		AdvAddressBooks[0][3]="Pune";
		AdvAddressBooks[0][4]="Pune";
		AdvAddressBooks[0][5]="India";
		AdvAddressBooks[0][7]="5635437";
		
		System.out.println("Welcome to my address book");
		System.out.println("\n");
		System.out.println("\n1 insert contact \n2 Search contact by last name \n3 Delete contact \n4 Show All contacts \n5 Exit");
		System.out.println("\n");
		System.out.println("\n Choose your options:");
		
		int option = input.nextInt();
		if (option == 1) {
			System.out.println("\n Enter your first name:");
		}
		if (option ==2) {
			
		}
		if(option ==3) {
			
		}
		if(option ==4) {
			
		
		System.out.println(AdvAddressBooks[1][0]+ "\t"+AdvAddressBooks[1][2]+","+AdvAddressBooks[1][1]+"\n\t"+AdvAddressBooks[1][3]+"\n\t"+AdvAddressBooks[1][4]+","+AdvAddressBooks[1][5]+""+AdvAddressBooks[1][6]+"\n\t"+AdvAddressBooks[1][7]);
	}
	if (option ==5) {
	}
	}
	
}


