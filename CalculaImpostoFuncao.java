package OOP.Polimorfismo.exercicio;

public class CalculaImpostoFuncao {

    public static void main(String[] args) {

        Funcionario gerente = new Funcionario();
        gerente.setMatricula(5251);
        gerente.setNome("Neilor R. Marangoni");
        gerente.setsalario(1500.00);
        System.out.println(gerente.getMatricula() + " - " + gerente.getNome() + " = Vlr. Imposto R$: " + gerente.calculaImposto());

        Funcionario supervisor = new Funcionario();
        supervisor.setMatricula(5000);
        supervisor.setNome("Joao da Silva");
        supervisor.setsalario(1000.00);
        System.out.println(supervisor.getMatricula() + " - " + supervisor.getNome() + " = Vlr. Imposto R$: " + supervisor.calculaImposto());

        Funcionario atendente = new Funcionario();
        atendente.setMatricula(5500);
        atendente.setNome("Maria Aparecida");
        atendente.setsalario(500.00);
        System.out.println(atendente.getMatricula() + " - " + atendente.getNome() + " = Vlr. Imposto R$: " + atendente.calculaImposto());

    }
}
