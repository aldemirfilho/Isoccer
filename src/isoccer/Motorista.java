package isoccer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Motorista extends Funcionario implements Interface_func{

    private String num_hab;

    Scanner input = new Scanner(System.in);

    @Override
    public void creat_funcionario(String tipo, java.util.ArrayList<Funcionario> Funcionarios) {
        int cont_aux = 0;
        String lixo;
        Motorista motorista = new Motorista();
        motorista.setTipo(tipo);
        System.out.println("Digite o nome do motorista");
        motorista.setNome(input.nextLine());
        System.out.println("Digite o email do motorista");
        motorista.setEmail(input.nextLine());
        System.out.println("Digite o cpf do motorista");
        motorista.setCpf(input.nextLine());
        System.out.println("Digite o salario do motorista");
        while (cont_aux == 0) {
            try {
                motorista.setSalario(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite o salario do motorista");
            }
        }
        cont_aux = 0;
        lixo = input.nextLine();
        System.out.println("Digite o telefone do motorista");
        motorista.setTelefone(input.nextLine());
        System.out.println("Digite o numero da habilitação do motorista");
        motorista.setNum_hab(input.nextLine());

        Funcionarios.add(motorista);
    }

    public String getNum_hab() {
        return num_hab;
    }

    public void setNum_hab(String num_hab) {
        this.num_hab = num_hab;
    }
}
