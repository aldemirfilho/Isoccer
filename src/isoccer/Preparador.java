package isoccer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Preparador extends Funcionario implements Interface_func{

    Scanner input = new Scanner(System.in);

    @Override
    public void creat_funcionario(String tipo, java.util.ArrayList<Funcionario> Funcionarios) {
        int cont_aux = 0;
        String lixo;
        Preparador preparador = new Preparador();
        preparador.setTipo(tipo);
        System.out.println("Digite o nome do preparador");
        preparador.setNome(input.nextLine());
        System.out.println("Digite o email do preparador");
        preparador.setEmail(input.nextLine());
        System.out.println("Digite o cpf do preparador");
        preparador.setCpf(input.nextLine());
        System.out.println("Digite o salario do preparador");
        while (cont_aux == 0) {
            try {
                preparador.setSalario(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite o salario do preparador");
            }
        }
        cont_aux = 0;
        lixo = input.nextLine();
        System.out.println("Digite o telefone do preparador");
        preparador.setTelefone(input.nextLine());

        Funcionarios.add(preparador);
    }
}
