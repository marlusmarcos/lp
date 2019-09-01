public class Professor

{
     protected String m_nome;
     protected String m_matricula;
     protected int m_idade;
     protected double m_salario;


    Professor(String nome, String matricula, int idade, double salario)
    {
	m_nome = nome;
	m_matricula = matricula;
	m_idade = idade;
	m_salario = salario;
    }

    // === Getters ===
    String get_nome()
    { return m_nome; }

    String get_matricula()
    { return m_matricula; }

    int get_idade()
    { return m_idade; }

    double get_salario()
    { return m_salario; }

    // === Setters ===
    void set_nome(String nome)
    { m_nome = nome; }

    void set_matricula(String matricula)
    { m_matricula = matricula; }

    void set_idade(int idade)
    { m_idade = idade; }

    void set_salario(double salario)
    { m_salario = salario; }
}
