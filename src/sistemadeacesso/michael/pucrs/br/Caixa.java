package sistemadeacesso.michael.pucrs.br;

import java.util.ArrayList;

public class Caixa {
	
	
	public void atendimentoPriorizado(ArrayList<Cliente> caixa)
	{
		ArrayList<Cliente> aux = new ArrayList<>();
		for(int i =0 ; i < caixa.size();i++)
		{
			for(int j=1;i<caixa.size();i++)
			if(caixa.get(i).getIdade()> 60 && caixa.get(i).getIdade()> caixa.get(j).getIdade())
			{
				aux.add(caixa.get(i));
			}
				
		}
		
	}
}
