class Professor_horista extends Professor
{
    private int m_horas_trabalhadas;
    private double m_valor_hora = 25;

    Professor_horista(String nome, String matricula, int idade,
	     int horas_trabalhadas)
    {
	super(nome, matricula, idade, 0);

	m_horas_trabalhadas = horas_trabalhadas;
	set_salario(horas_trabalhadas);
    }

    // === Getter ===
    int get_horas_trabalhadas()
    { return m_horas_trabalhadas; }

    double get_valor_hora()
    { return m_valor_hora; }


    // === Setters ===
    void set_horas_trabalhadas(int horas_trabalhadas)
    { m_horas_trabalhadas = horas_trabalhadas; }

    // calcular salario
    void set_salario(double horas_trabalhadas)
    { m_salario = horas_trabalhadas * m_valor_hora; }

}
