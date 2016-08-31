package sistemadeacesso.michael.pucrs.br;

import java.util.Scanner;
import java.util.*;
public class App {
	
	public static void main(String []args) 
	{
		int opcao=0;
		ArrayList<Cliente> caixa = new ArrayList<>();
		
		switch (opcao) {
		case 1:
			//adcionar cliente
			
			System.out.println("Digite sua idade: ");
			Scanner lerIdade  = new 	Scanner(System.in);
			int idade = lerIdade.nextInt();
			System.out.println("sua idade é " +idade+", Digite o seu nome: ");
			Scanner lerNome = new Scanner(System.in);
			String nome = lerNome.nextLine();
			Cliente e = new Cliente(nome, idade);
			caixa.add(e);
			break;
		case 2:
			// remover cliente
			String nome="";
			System.out.println("digite o nome do cliente que voce atendeu:"+nome);
			
			for(int i=0; i<caixa.size();i++){	
				if(caixa.get(i).getNome() = nome)
				caixa.remove(e);
			}
			
			break;	
			

		case 3:
			// verificar lista de espera
			caixa.size();

			System.out.println("tamanho da fila é  :"+caixa.size());
			break;
		default:
		
			break;
		}
		
		
	
		
		
	}
}
