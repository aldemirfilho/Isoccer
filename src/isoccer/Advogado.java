package isoccer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Advogado extends Funcionario implements Interface_func{

    Scanner input = new Scanner(System.in);

    @Override
    public void creat_funcionario(String tipo, java.util.ArrayList<Funcionario> Funcionarios) {
        int cont_aux = 0;
        String lixo;
        Advogado advogado = new Advogado();
        advogado.setTipo(tipo);
        System.out.println("Digite o nome do advogado");
        advogado.setNome(input.nextLine());
        System.out.println("Digite o email do advogado");
        advogado.setEmail(input.nextLine());
        System.out.println("Digite o cpf do advogado");
        advogado.setCpf(input.nextLine());
        System.out.println("Digite o salario do advogado");
        while (cont_aux == 0) {
            try {
                advogado.setSalario(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite o salario do advogado");
            }
        }
        cont_aux = 0;
        lixo = input.nextLine();
        System.out.println("Digite o telefone do advogado");
        advogado.setTelefone(input.nextLine());

        Funcionarios.add(advogado);
    }
}
