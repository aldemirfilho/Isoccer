package isoccer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tecnico extends Funcionario implements Interface_func{

    Scanner input = new Scanner(System.in);

    public void relat_tecnico(java.util.ArrayList<Funcionario> Funcionarios) {
        int i;
        for (i = 0; i < Funcionarios.size(); i++) {
            if (Funcionarios.get(i).getTipo().equals("tecnico")) {
                System.out.println("CARGO: Técnico");
                System.out.println("NOME: " + Funcionarios.get(i).getNome());
                System.out.println("EMAIL: " + Funcionarios.get(i).getEmail());
                System.out.println("CPF: " + Funcionarios.get(i).getCpf());
                System.out.println("SALÁRIO: " + Funcionarios.get(i).getSalario());
                System.out.println("TELEFONE: " + Funcionarios.get(i).getTelefone());
            }
        }
    }

    @Override
    public void creat_funcionario(String tipo, java.util.ArrayList<Funcionario> Funcionarios) {
        int cont_aux = 0;
        String lixo;
        Tecnico tecnico = new Tecnico();
        tecnico.setTipo(tipo);
        System.out.println("Digite o nome do tecnico");
        tecnico.setNome(input.nextLine());
        System.out.println("Digite o email do tecnico");
        tecnico.setEmail(input.nextLine());
        System.out.println("Digite o cpf do tecnico");
        tecnico.setCpf(input.nextLine());
        System.out.println("Digite o salario do tecnico");
        while (cont_aux == 0) {
            try {
                tecnico.setSalario(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite o salario do tecnico");
            }
        }
        cont_aux = 0;
        lixo = input.nextLine();
        System.out.println("Digite o telefone do tecnico");
        tecnico.setTelefone(input.nextLine());

        Funcionarios.add(tecnico);
    }
}
