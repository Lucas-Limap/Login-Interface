package br.edu.univas.view;

//import javax.swing.JOptionPane;

public class InterfaceView {
	
	public void printHomeMenu () {
		System.out.println("TELA INICIAL\n"
				+ "1 - Logar usu�rio\n"
				+ "2 - Cadastrar usu�rio\n"
				+ "3 - Sair\n\n");
		
	}public void printMessegerUser() {
		System.out.print("Informe o nome do usu�rio: ");
		
	}public void printMessegerPassword() {
		System.out.print("Digite a senha: ");
		
//	}public void printMenuPopUp () {
//		String menu = JOptionPane.showInputDialog("SENHA\n"
//				+ "1.Tamanho minimo da senha\n"
//				+ "2.Tamanho m�ximo da senha\n"
//				+ "3.Letras maiusculas\n"
//				+ "4.Letras minusculas\n"
//				+ "5.N�meros\n"
//				+ "6.Caracteres especiais: ! @ # $% & *");
//		System.out.println(menu);
	
	}public void printMenu () {
		System.out.println("SENHA\n"
				+ "1.Tamanho minimo da senha 8 \n"
				+ "2.Tamanho m�ximo da senha 32\n"
				+ "3.Letras maiusculas\n"
				+ "4.Letras minusculas\n"
				+ "5.N�meros\n"
				+ "6.Caracteres especiais: ! @ # $% & *");
	
	}public void messegerWrongPassword () {
		System.out.printf("Senha inv�lida ");
	
	}
	
}
