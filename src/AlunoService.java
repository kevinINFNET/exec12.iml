import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AlunoService {

    public Aluno buscarAlunoPorMatricula(List<Aluno> alunos, int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }

    public List<Aluno> ordenarAlunosPorNome(List<Aluno> alunos) {
        return alunos.stream()
                .sorted(Comparator.comparing(Aluno::getNome)) // Usa Comparator aqui
                .collect(Collectors.toList());
    }

    public List<Aluno> buscarAlunosComMediaMaiorOuIgual(List<Aluno> alunos, double nota) {
        return alunos.stream()
                .filter(aluno -> aluno.calcularMedia() >= nota)
                .collect(Collectors.toList());
    }
}
