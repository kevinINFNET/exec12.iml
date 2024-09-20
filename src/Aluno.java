import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;

    // Método que calcula a média das notas
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
}
