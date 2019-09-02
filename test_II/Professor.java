import java.util.HashSet;

public class Professor extends Funcionario
{
    private HashSet<Aluno> m_alunos;

    public Professor()
    { m_alunos = new HashSet<Aluno>(); }

    public HashSet<Aluno> get_Aluno()
    { return m_alunos; }

//    public HashSet<Aluno> set_aluno( HashSet<Aluno> alunos)
//    { m_alunos = alunos; }

    public void add_aluno(Aluno a)
    { m_alunos.add(a); }

    public void remove_aluno(Aluno a)
    { m_alunos.remove(a); }
}
