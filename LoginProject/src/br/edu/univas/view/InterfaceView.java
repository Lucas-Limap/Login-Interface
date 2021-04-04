package br.edu.univas.view;

public class InterfaceView {
	
	public void printHomeMenu () {
		System.out.println("TELA INICIAL\n"
				+ "1 - Logar usuário\n"
				+ "2 - Cadastrar usuário\n"
				+ "9 - Sair\n");
		
	}public void printMessegerUser() {
		System.out.print("Informe o nome de usuário: ");
		
	}public void printMessegerPassword() {
		System.out.print("Digite a senha: ");
			
	}public void printMenu () {
		System.out.println("\nSENHA\n"
				+ "1.Tamanho minimo da senha 8 \n"
				+ "2.Tamanho máximo da senha 32\n"
				+ "3.Letras maiusculas\n"
				+ "4.Letras minusculas\n"
				+ "5.Números\n"
				+ "6.Caracteres especiais: ! @ # $ % & *\n");
	
	}public void messegerWrongPassword () {
		System.out.printf("Senha inválida\n");
	
	}public void messegerUserLogin () {
		System.out.printf("\nLOGIN\n"
				+ "Usário: ");
		
	}public void messegerPasswordLogin () {
		System.out.println("Senha: ");
	
	}public void messegerWrongUser () {
		System.out.println("Usuário inválido");
	
	}public void printLoginSucess () {
		System.out.println("Usuário Logado");
		
	}public void wrongOption () {
		System.out.println("Opção errada\n"
				+ "Selecione novamente.");
	}
	
}
