package br.edu.univas.main;

import br.edu.univas.login.*;
import br.edu.univas.view.*;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class StartApp {
	private static InterfaceView view = new InterfaceView ();
	private static Login login = new Login ();
	private static Scanner input = new Scanner(System.in);
	
	public static void main (String[]args) throws IOException   {

		int option = 0;
	
		do {	
			view.printHomeMenu();
			option = readInterger();
			
			if (option > 3 && option < 9 || option > 9) {
				view.wrongOption();			
			
			}else if(option == 1 ) {
				do{view.messegerUserLogin();
				login.setUserLogin(input.nextLine());
				view.printMessegerPassword();
				login.setPasswordLogin(input.nextLine());
					if (userValidation() != true) {
						view.messegerWrongUser();
					}else if (passwordValidation() != true) {
						view.messegerWrongPassword();
						
					}else if (passwordValidation() == true) {
						view.printLoginSucess();
					}
				
				}while(passwordValidation() == false);
				break;
				
			}else if (option == 2) {
				view.printMessegerUser();
				login.setUser(input.nextLine());
				
				do {
				view.printMenu();				
				view.printMessegerPassword();
				login.setPassword(input.nextLine());
				
				if (passwordlengthMin() != true) {
					view.messegerWrongPassword();
					System.out.printf("*Mínimo 8 caracteres\n");
					
				}else if (passwordlengthMax() !=  true) {
					view.messegerWrongPassword();
					System.out.printf("*Máximo 32 caracteres\n");
					
				}else if (passwordLowerCase() != true) {
					view.messegerWrongPassword();
					System.out.println("*Precisa de pelomenos uma letra Mínuscula");
					
				}else if (passwordUpperCase() != true) {
					view.messegerWrongPassword();
					System.out.println("*Precisa de pelomenos uma letra Máiuscula");
									
				}else if (passwordNumberCase() != true) {
					view.messegerWrongPassword();
					System.out.println("*Precisa de pelomenos um Número");
					
					
				}else if (passwordSpecialCaracterCase() != true) {
					view.messegerWrongPassword();
					System.out.println("*Precisa de pelomenos um Caracter especial");
							
				}
				
				}while(validationPassword() == false);
				
				savePassword();
			}
			
			
		}while(option != 9);
		
		//Validations
	}public static boolean passwordlengthMin() {
		if (login.getPassword().length() < 8 ) {

			return false;
		}
		return true;
		
	}public static boolean passwordlengthMax() {
		if (login.getPassword().length() > 32 ) {
			return false;
		}
		return true;
	
	}public static boolean passwordUpperCase () {
		for (char i : login.getPassword().toCharArray()) {
//			if (i >= 'A' && i <= 'Z') {
			if (i >= 'A') {
				return true;
			}
		}
		return false;
		
	}public static boolean passwordLowerCase () {
		for (char i : login.getPassword().toCharArray()) {
//			if (i >= 'a' && i <= 'z') {
			if (i >= 'a') {
				return true;
			}
		}
		return false;
		
	}public static boolean passwordNumberCase () {
		for (char i : login.getPassword().toCharArray()) {
//			if (i >= '1' && i <= '9') {
			if (i >= '1') {
				return true;
			}
		}
		return false;
		
	}public static boolean passwordSpecialCaracterCase () {
		for (char i : login.getPassword().toCharArray()) {
			if (i == '!' || i == '@' || i == '#' || i == '$' || i == '%' || i == '&' || i == '*' ) {
				return true;
			}
		}
		return false;
		
		//Save File
	}public static void savePassword () throws IOException {
		FileWriter file = new FileWriter("C:\\Users\\Lucas Lima\\Desktop\\Password.txt");
		PrintWriter saveFile = new PrintWriter (file);
		
		//Text within file
		saveFile.printf("Usuário: %s\n"
				+ "Senha: %s", login.getUser(), login.getPassword());
		file.close();
		
		//Text in console
		System.out.println("\nArquivo foi salvo com sucesso\n"
				+ "C:\\Users\\Lucas Lima\\Desktop\n");
	
	}public static boolean validationPassword () {
		if (passwordlengthMin() == true && passwordlengthMax() == true && passwordLowerCase() == true && passwordUpperCase() == true
				&& passwordNumberCase() == true && passwordSpecialCaracterCase() == true) {
			return true;
		}
		return false;
	
	//ValidationLogin
	}public static boolean userValidation () {
		if (login.getUserLogin().equals(login.getUser())) {
			return true;			
		}
	return false;
	
	}public static boolean passwordValidation () {
		if (login.getPasswordLogin().equals(login.getPassword())) {
			return true;
		}
		
		return false;
		
	}public static int readInterger() {
		int value = input.nextInt();
		input.nextLine();
		return value;

	}
	
}

