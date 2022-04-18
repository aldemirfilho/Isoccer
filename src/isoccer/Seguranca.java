package isoccer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seguranca extends Funcionario implements Interface_func{

    Scanner input = new Scanner(System.in);

   @Override
    public void creat_funcionario(String tipo, java.util.ArrayList<Funcionario> Funcionarios) {
        int cont_aux = 0;
        String lixo;
        Seguranca seguranca = new Seguranca();
        seguranca.setTipo(tipo);
        System.out.println("Digite o nome do seguranca");
        seguranca.setNome(input.nextLine());
        System.out.println("Digite o email do seguranca");
        seguranca.setEmail(input.nextLine());
        System.out.println("Digite o cpf do seguranca");
        seguranca.setCpf(input.nextLine());
        System.out.println("Digite o salario do seguranca");
        while (cont_aux == 0) {
            try {
                seguranca.setSalario(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite o salario do seguranca");
            }
        }
        cont_aux = 0;
        lixo = input.nextLine();
        System.out.println("Digite o telefone do seguranca");
        seguranca.setTelefone(input.nextLine());

        Funcionarios.add(seguranca);
    }
}
