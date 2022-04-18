package isoccer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cozinheiro extends Funcionario implements Interface_func{

    Scanner input = new Scanner(System.in);

    @Override
    public void creat_funcionario(String tipo, java.util.ArrayList<Funcionario> Funcionarios) {
        int cont_aux = 0;
        String lixo;
        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.setTipo(tipo);
        System.out.println("Digite o nome do cozinheiro");
        cozinheiro.setNome(input.nextLine());
        System.out.println("Digite o email do cozinheiro");
        cozinheiro.setEmail(input.nextLine());
        System.out.println("Digite o cpf do cozinheiro");
        cozinheiro.setCpf(input.nextLine());
        System.out.println("Digite o salario do cozinheiro");
        while (cont_aux == 0) {
            try {
                cozinheiro.setSalario(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite o salario do cozinheiro");
            }
        }
        cont_aux = 0;
        lixo = input.nextLine();
        System.out.println("Digite o telefone do cozinheiro");
        cozinheiro.setTelefone(input.nextLine());

        Funcionarios.add(cozinheiro);
    }
}
