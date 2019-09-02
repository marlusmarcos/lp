import java.util.ArrayList;

public class NatalFitness 
{
    
    public static ArrayList<Funcionario> funcionarios;
    public static void main(String[] args)
    {

	// jjjjjjjjjjjjjjj
	funcionarios = new ArrayList<Funcionario>();

	Funcionario f1 = new Recepcionista();
	f1.set_matricula("001");
	f1.set_nome("Mamadona");

	Funcionario f2 = new Gerente();
	f2.set_matricula("002");
	f2.set_nome("Tim Maia");
	
	Aluno a1 = new Aluno();
	a1.set_nome("Neymar");
	a1.gerar_atividade("07:00", "Nado Livre");
	a1.gerar_atividade("11:00", "hipertrofia");
	a1.gerar_atividade("11:00", "hipertrofia");

	Aluno a2 = new Aluno();
	a2.gerar_atividade("07:00", "Nado Livre");
	a2.gerar_atividade("08:00", "Nado costa");
	a2.gerar_atividade("09:00", "Nado crau");

	Professor pf1 = new ProfessorMusculacao();
	pf1.set_matricula("003");
	pf1.set_nome("cleiton");
	pf1.add_aluno(a1);

	Professor pf2 = new ProfessorNatacao();
	pf1.set_matricula("004");
	pf1.set_nome("Arnaldo");
	pf1.add_aluno(a2);

	funcionarios.add(f1);
	funcionarios.add(f2);
	funcionarios.add(pf1);
	funcionarios.add(pf2);

	// print funcionarios
	imprimir_funcionarios();	
//	imprimir_atividades();	

    }

    private static void imprimir_funcionarios() 
    {
	System.out.println("##################################################");

	for(Funcionario f : funcionarios)
	{ System.out.println("Matricula: " + f.get_matricula() + " Nome: " + f.get_nome() + " Tipo: " + f.getClass()); }

	System.out.println("##################################################");
    }

//    private static void imprimir_atividades() 
//    {
//	System.out.println("################################################################################");
//	for(Funcionario f : funcionarios)
//	{ 
//	    if( f instanceof Professor)
//	    { System.out.println("Professor [" + f.get_nome() + "]"); }
//	    for( Aluno aluno : ((Professor) f).get_aluno());
//	    {
//		System.out.println("Aluno >>> " + aluno.get_nome() +
//			aluno.get_horarios);
//	    }
//	}
//	System.out.println("################################################################################");
//    }

}
