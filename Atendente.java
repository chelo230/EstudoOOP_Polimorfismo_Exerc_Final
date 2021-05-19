package OOP.Polimorfismo.exercicio;

public class Atendente extends Funcionario {

    public double calculaImposto() {
        return this.getSalario();
    }
}
