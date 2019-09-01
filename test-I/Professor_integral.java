public class Professor_integral extends Professor
{
   protected String m_departamento;


   Professor_integral(String nome, String matricula, int idade, 
	   double salario, String departamento)
   {
	super(nome, matricula, idade, salario);
	m_departamento = departamento;
   }

   // === Getter ===
   public String get_departamento()
   { return m_departamento; }


   // === Setters ====
    public void set_departamento( String departamento)
    { m_departamento = departamento;}
}
