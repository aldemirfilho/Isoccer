package isoccer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Presidente extends Funcionario implements Interface_func {

    Scanner input = new Scanner(System.in);
    
    @Override
    public void creat_funcionario(String tipo, java.util.ArrayList<Funcionario> Funcionarios) {
        int cont_aux = 0;
        String lixo;
        Presidente presidente = new Presidente();
        presidente.setTipo(tipo);
        System.out.println("Digite o nome do presidente");
        presidente.setNome(input.nextLine());
        System.out.println("Digite o email do presidente");
        presidente.setEmail(input.nextLine());
        System.out.println("Digite o cpf do presidente");
        presidente.setCpf(input.nextLine());
        System.out.println("Digite o salario do presidente");
        while (cont_aux == 0) {
            try {
                presidente.setSalario(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite o salario do presidente");
            }
        }
        cont_aux = 0;
        lixo = input.nextLine();
        System.out.println("Digite o telefone do presidente");
        presidente.setTelefone(input.nextLine());

        Funcionarios.add(presidente);
    }
}
