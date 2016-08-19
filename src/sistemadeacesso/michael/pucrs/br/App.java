package sistemadeacesso.michael.pucrs.br;

import java.util.Scanner;
import java.util.*;
public class App {
	
	public static void main(String []args) 
	{
		ArrayList<Cliente> caixa = new ArrayList<>();
		System.out.println("Digite sua idade: ");
		Scanner lerIdade  = new 	Scanner(System.in);
		int idade = lerIdade.nextInt();
		System.out.println("sua idade é " +idade+", Digite o seu nome: ");
		Scanner lerNome = new Scanner(System.in);
		String nome = lerNome.nextLine();
		
		System.out.println("Bom dia "+nome +", sua idade é: "+idade);
		Cliente c = new Cliente(nome,idade);
		caixa.add(c);
		
		
		System.out.println("tamanho da fila é  :"+caixa.size());
	}
}
