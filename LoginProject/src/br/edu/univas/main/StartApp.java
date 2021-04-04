package br.edu.univas.main;

import br.edu.univas.view.*;
import br.edu.univas.password.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
//import java.util.Iterator;

public class StartApp {
	private static InterfaceView view = new InterfaceView ();
	private static Password password = new Password ();
	private static Scanner input = new Scanner(System.in);
	
	public static void main (String[]args) throws IOException   {

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
		
		if (passwordlength() != true) {
			
		}else if (passwordLowerCase() != true) {
			
		}else if (passwordUpperCase() != true) {
			
		}else if (passwordNumberCase() != true) {
			
		}else if (passwordSpecialCaracterCase() != true) {
			
		}
		
		savePassword();
		
		//Validations
	}public static boolean passwordlength() {
		if (password.getPassword().length() < 8 ) {
			view.messegerWrongPassword();
			System.out.printf(": Mínimo 8 caracteres\n");
			return false;
		}
		if (password.getPassword().length() > 32 ) {
			view.messegerWrongPassword();
			System.out.printf(": Máximo 32 caracteres\n");
			return false;
		}
		return true;
	
	}public static boolean passwordUpperCase () {
		for (char i : password.getPassword().toCharArray()) {
			if (i >= 'A' && i <= 'Z') {
				//System.out.println("Maiuscula OK");
				return true;
			}
		}
		
		view.messegerWrongPassword();
		System.out.println("*Precisa de pelomenos uma letra Máiuscula");
		return false;
		
	}public static boolean passwordLowerCase () {
		for (char i : password.getPassword().toCharArray()) {
			if (i >= 'a' && i <= 'z') {
				//System.out.println("Minuscula OK");
				return true;
			}
		}
		view.messegerWrongPassword();
		System.out.println("*Precisa de pelomenos uma letra Mínuscula");
		return false;
		
	}public static boolean passwordNumberCase () {
		for (char i : password.getPassword().toCharArray()) {
			if (i >= '1' && i <= '9') {
				//System.out.println("Numero OK");
				return true;
			}
		}
		view.messegerWrongPassword();
		System.out.println("*Precisa de pelomenos um Número");
		return false;
		
	}public static boolean passwordSpecialCaracterCase () {
		for (char i : password.getPassword().toCharArray()) {
			if (i == '!' || i == '@' || i == '#' || i == '$' || i == '%' || i == '&' || i == '*' ) {
				//System.out.println("Especial OK");
				return true;
			}
		}
		view.messegerWrongPassword();
		System.out.println("*Precisa de pelomenos um Caracter especial");
		return false;
		
		//Save File
	}public static void savePassword () throws IOException {
		FileWriter file = new FileWriter("C:\\Users\\Lucas Lima\\Desktop\\Password.txt");
		PrintWriter saveFile = new PrintWriter (file);
		
		//Text within file
		saveFile.printf("Senha: %s", password.getPassword());
		file.close();
		
		//Text in console
		System.out.println("\nArquivo foi salvo com sucesso\n"
				+ "C:\\Users\\Lucas Lima\\Desktop");
		
	
	}public static int readInterger() {
		int value = input.nextInt();
		input.nextLine();
		return value;

	}
	
}
