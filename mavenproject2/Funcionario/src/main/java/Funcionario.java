import java.time.LocalDate;
import java.time.Period;

public class Funcionario {
    public String nome;
    public LocalDate nasc;
    public int salario;

    // Construtor
    public Funcionario(String nome, LocalDate nasc, int salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNasc() { 
        return nasc;
    }

    public void setNasc(LocalDate nasc) {
        this.nasc = nasc;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    // Método para imprimir o nome do funcionário e seu salário
    public void informarSalario() {
        System.out.println("Nome: " + nome);
        System.out.println("Valor do salário: " + salario);
    }

    // Método para calcular e imprimir idade do funcionário
    public void calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(nasc, dataAtual);
        System.out.println("Idade: " + periodo.getYears() + " anos \n");
    }

    public static void main(String[] args) {

        LocalDate nasc = LocalDate.of(1965, 1, 28);
        LocalDate nasc2 = LocalDate.of(1970, 2, 16);

        Funcionario Helena = new Funcionario("Helena Reis", nasc, 4000);
        Funcionario Mario = new Funcionario("Mário Sá", nasc2, 3000 );
        Helena.informarSalario();
        Helena.calcularIdade();
        Mario.informarSalario();
        Mario.calcularIdade();
    }
}

