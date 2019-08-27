import java.util.ArrayList;

public class Escola
{
    private ArrayList<Professor> m_professores;

    public Escola()
    { m_professores = new ArrayList<Professor>(); }
	
    public void adicionar_professor(Professor prof)
    { m_professores.add(prof); }

    public void remover_professor(Professor prof)
    {
	m_professores.remove(prof); 
	System.out.println("Professor removido");
    }

    public int quantidade_professores()
    { return m_professores.size(); }

    
    public Professor maiorSalario()
    {
	Professor p = null;
	if (m_professores.size() > 0)
	{
	    double maior = 0;
	    for(int i = 0; i < m_professores.size(); ++i)
	    {
		if(m_professores.get(i).get_salario() >= maior)
		{
		    p = m_professores.get(i);
		    maior = p.get_salario();
		}
	    }
	}
	return p;
    }

    public Professor maisNovo()
    {
	Professor p = null;
	if (m_professores.size() > 0)
	{
	    int menor = 100;
	    for(int i = 0; i < m_professores.size(); ++i)
	    {
		if(m_professores.get(i).get_idade() < menor)
		{
		    p = m_professores.get(i);
		    menor = p.get_idade();
		}
	    }
	}
	return p;
    }

    public static void main(String args[])
    {
	Escola escola = new Escola();
	Professor_horista prof1 = new Professor_horista("jao", "123123", 12, 5);
	System.out.println(prof1.get_nome());
    }
}
