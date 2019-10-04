package com.cg.ibsproject.ui;

import java.util.Scanner;

public class Admin {
	private static Scanner read;
	public void init() {
		AdminOptions adminChoice = null;
		while (adminChoice != AdminOptions.EXIT) {
			System.out.println("Menu");
			System.out.println("--------------------");
			System.out.println("Choice");
			System.out.println("--------------------");
			for (AdminOptions menu : AdminOptions.values()) {
				System.out.println((menu.ordinal() + 1) + "\t" + menu);
			}
			System.out.println("Choice");
			int ordinal = read.nextInt();
			if (ordinal >= 1 && ordinal < (AdminOptions.values().length)+1) {
				adminChoice = AdminOptions.values()[ordinal-1];
				switch(adminChoice){
				case VERIFY_LOAN:
					break;
				case APPROVE_LOAN:
					break;
				case VERIFY_PRECLOSURE:
					break;
				case APPROVE_PRECLOSURE:
					break;
				case EXIT:
					System.out.println("Task Completed.");
					break;
				}
				
			}
			else
			{
				System.out.println("Invalid Option.");
				adminChoice = null;
			}
		}
	}
	public static void main(String[] args) {
		read = new Scanner(System.in);
		Admin admin = new Admin();
		admin.init();
		read.close();
	}
}