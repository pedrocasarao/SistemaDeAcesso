package sistemadeacesso.michael.pucrs.br;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	

	public static void main(String []args) throws IOException
	{
		
	    Caixa c1 = new Caixa();
		System.out.println("Digite seu nome: ");
	    BufferedReader bufnome = new BufferedReader(new InputStreamReader(System.in));  
	    String nome = bufnome.readLine();
	    System.out.println("Bom dia "+nome+", Digite sua idade:");
	    BufferedReader bufidade = new BufferedReader(new InputStreamReader(System.in));  
	    int idade = bufidade.read();
	    System.out.println("Bem vindo"+ nome+""+idade );
	    Cliente cli = new Cliente(idade,nome);
	    
	    c1.atendeCliente(cli);
	    System.out.println("Quantidade de cliente em espera"+c1.tamanhoDaFila());
	}
}
