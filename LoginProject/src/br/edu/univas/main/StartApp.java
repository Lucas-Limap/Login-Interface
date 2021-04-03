package br.edu.univas.main;

import br.edu.univas.view.*;
import br.edu.univas.password.*;

//import java.util.Iterator;
import java.util.Scanner;

public class StartApp {
	private static InterfaceView view = new InterfaceView ();
	private static Password password = new Password ();
	private static Scanner input = new Scanner(System.in);
	
	
	public static void main (String[]args) {
		//int option = 0;
		
		//view.printMenuPopUp();
//		do {
//			
//			view.printHomeMenu();
//			option = readInterger();
//			if(option == 1 ) {
//				view.printMessegerUser();
//				password.setUser(input.nextLine());
//				view.printMessegerPassword();
//				password.setPassword(input.nextLine());
//			}else if (option == 2) {
//				view.printMenu();				
//				password.setPassword(input.nextLine());
//			}
//			
//		}while(option != 3);
		
		view.printMenu();				
		password.setPassword(input.nextLine());
		
		//Validations Test print	
		System.out.println(password.getPassword());
		
		//System.out.println(passwordlength());
		//System.out.println(passwordUpperCase());
		
		passwordlength();
		passwordLowerCase();
		passwordUpperCase();
		passwordNumberCase();
		passwordSpecialCaracterCase();		
		
		//Validations
	}public static boolean passwordlength() {
		if (password.getPassword().length() < 8 ) {
			view.messegerWrongPassword();
			System.out.printf(": Mínimo 8 caracteres\n");
			return false;
		}else if (password.getPassword().length() > 32 ) {
			view.messegerWrongPassword();
			System.out.printf(": Máximo 32 caracteres\n");
			return false;
		}
		System.out.println("Tamanho ok");
		return true;
	
	}public static boolean passwordUpperCase () {
		for (char i : password.getPassword().toCharArray()) {
			if (i >= 'A' && i <= 'Z') {
				System.out.println("Maiuscula OK");
				return true;
			}
		}
			
		view.messegerWrongPassword();
		System.out.println(); // temporario
		return false;
		
	}public static boolean passwordLowerCase () {
		for (char i : password.getPassword().toCharArray()) {
			if (i >= 'a' && i <= 'z') {
				System.out.println("Minuscula OK");
				return true;
			}
		}
		view.messegerWrongPassword();
		System.out.println(); // temporario
		return false;
		
	}public static boolean passwordNumberCase () {
		for (char i : password.getPassword().toCharArray()) {
			if (i >= '1' && i <= '9') {
				System.out.println("Numero OK");
				return true;
			}
		}
		view.messegerWrongPassword();
		System.out.println(); // temporario
		return false;
		
	}public static boolean passwordSpecialCaracterCase () {
		for (char i : password.getPassword().toCharArray()) {
			if (i == '!' || i == '@' || i == '#' || i == '$' || i == '%' || i == '&' || i == '*' ) {
				System.out.println("Especial OK");
				return true;
			}
		}
		view.messegerWrongPassword();
		System.out.println(); // temporario
		return false;
		
	}public static int readInterger() {
		int value = input.nextInt();
		input.nextLine();
		return value;

	}
	
}
