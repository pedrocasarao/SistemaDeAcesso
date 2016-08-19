package sistemadeacesso.michael.pucrs.br;

import java.util.ArrayList;

public class Caixa {
	
	
	public void atendimentoPriorizado(ArrayList<Cliente> caixa)
	{
		for(int i =0 ; i < caixa.size();i++)
		{
			for(int j=1;i<caixa.size();i++)
			if(caixa.get(i).getIdade()> 60 && caixa.get(j).getIdade()< caixa.get(i).getIdade())
			{
				
			}
				
		}
		
	}
}
