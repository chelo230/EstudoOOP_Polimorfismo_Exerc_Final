package OOP.Polimorfismo.exercicio;

public class Gerente extends Funcionario {

    public double calculaImposto() {
        return this.getSalario() * 0.10;
    }

}
