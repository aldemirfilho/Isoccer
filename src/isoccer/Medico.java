package isoccer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Medico extends Funcionario implements Interface_func{

    Scanner input = new Scanner(System.in);

    private String crm;

    @Override
    public void creat_funcionario(String tipo, java.util.ArrayList<Funcionario> Funcionarios) {
        int cont_aux = 0;
        String lixo;
        Medico medico = new Medico();
        medico.setTipo(tipo);
        System.out.println("Digite o nome do medico");
        medico.setNome(input.nextLine());
        System.out.println("Digite o email do medico");
        medico.setEmail(input.nextLine());
        System.out.println("Digite o cpf do medico");
        medico.setCpf(input.nextLine());
        System.out.println("Digite o salario do medico");
        while (cont_aux == 0) {
            try {
                medico.setSalario(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite o salario do medico");
            }
        }
        cont_aux = 0;
        lixo = input.nextLine();
        System.out.println("Digite o telefone do medico");
        medico.setTelefone(input.nextLine());
        System.out.println("Digite o crm do medico");
        medico.setCrm(input.nextLine());

        Funcionarios.add(medico);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
