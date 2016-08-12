package sistemadeacesso.michael.pucrs.br;

import java.util.ArrayList;

public class Caixa {
	
	
	
	ArrayList<Cliente> lstCliente = new ArrayList<>();
	public Caixa()
	{
		
	}
	public boolean atendeCliente(Cliente c)
	{
		if(lstCliente.size()>0)
		{
			lstCliente.add(c);
			return true;
		}
		else 
			return false;
	}
	public boolean removeCliente(Cliente c)
	{
		if(lstCliente.size()<1)
		{
			return true;
		}else
			return false;
		
	}
	public int tamanhoDaFila()
	{
		return lstCliente.size();
		
	}
}
