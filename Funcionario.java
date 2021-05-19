package OOP.Polimorfismo.exercicio;

public class Funcionario {
    private Integer matricula;
    private String  nome;
    private double  salario;

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setsalario(double salario) {
        this.salario = salario;
    }

    public double calculaImposto() {
        return this.getSalario() * 0.01;
    }
}

