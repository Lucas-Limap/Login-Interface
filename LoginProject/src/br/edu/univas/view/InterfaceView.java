package br.edu.univas.view;

public class InterfaceView {
	
	public void printHomeMenu () {
		System.out.println("TELA INICIAL\n"
				+ "1 - Logar usu�rio\n"
				+ "2 - Cadastrar usu�rio\n"
				+ "9 - Sair\n");
		
	}public void printMessegerUser() {
		System.out.print("Informe o nome de usu�rio: ");
		
	}public void printMessegerPassword() {
		System.out.print("Digite a senha: ");
			
	}public void printMenu () {
		System.out.println("\nSENHA\n"
				+ "1.Tamanho minimo da senha 8 \n"
				+ "2.Tamanho m�ximo da senha 32\n"
				+ "3.Letras maiusculas\n"
				+ "4.Letras minusculas\n"
				+ "5.N�meros\n"
				+ "6.Caracteres especiais: ! @ # $ % & *\n");
	
	}public void messegerWrongPassword () {
		System.out.printf("Senha inv�lida\n");
	
	}public void messegerUserLogin () {
		System.out.printf("\nLOGIN\n"
				+ "Us�rio: ");
		
	}public void messegerPasswordLogin () {
		System.out.println("Senha: ");
	
	}public void messegerWrongUser () {
		System.out.println("Usu�rio inv�lido");
	
	}public void printLoginSucess () {
		System.out.println("Usu�rio Logado");
		
	}public void wrongOption () {
		System.out.println("Op��o errada\n"
				+ "Selecione novamente.");
	}
	
}
