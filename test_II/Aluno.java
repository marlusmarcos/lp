import java.util.HashMap;

public class Aluno
{
    private String m_nome;
    private HashMap<String, String> m_horarios;

    public Aluno()
    { m_horarios = new HashMap<String, String>(); }

    public String get_nome()
    { return m_nome; }

    public void set_nome(String nome)
    { m_nome = nome; }

    public HashMap<String, String> get_m_horarios()
    { return m_horarios; }

    public void set_m_horarios(HashMap<String, String> horarios)
    { m_horarios = horarios; }
    
    public void gerar_atividade(String hora, String atividade)
    { m_horarios.put(hora, atividade); }
}
