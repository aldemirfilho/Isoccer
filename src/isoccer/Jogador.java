package isoccer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogador extends Funcionario implements Interface_func{

    private String pos;
    private int aptidao;

    Scanner input = new Scanner(System.in);

    public void ver_apt_inapt(java.util.ArrayList<Funcionario> Funcionarios) {
        int i;
        System.out.println("APTOS:");
        for (i = 0; i < Funcionarios.size(); i++) {
            if (Funcionarios.get(i).getTipo().equals("jogador") && ((Jogador) Funcionarios.get(i)).getAptidao() == 1) {
                System.out.println("-" + Funcionarios.get(i).getNome());
            }
        }
        System.out.println();
        System.out.println("INAPTOS:");
        for (i = 0; i < Funcionarios.size(); i++) {
            if (Funcionarios.get(i).getTipo().equals("jogador") && ((Jogador) Funcionarios.get(i)).getAptidao() == 0) {
                System.out.println("-" + Funcionarios.get(i).getNome());
            }
        }
    }

    public void relat_jogador(java.util.ArrayList<Funcionario> Funcionarios) {
        int i, resp = 0, cont_aux = 0;
        String lixo;
        for (i = 0; i < Funcionarios.size(); i++) {
            if (Funcionarios.get(i).getTipo().equals("jogador")) {
                System.out.println("CARGO: Jogador");
                System.out.println("NOME: " + Funcionarios.get(i).getNome());
                System.out.println("EMAIL: " + Funcionarios.get(i).getEmail());
                System.out.println("CPF: " + Funcionarios.get(i).getCpf());
                System.out.println("SALÁRIO: " + Funcionarios.get(i).getSalario());
                System.out.println("TELEFONE: " + Funcionarios.get(i).getTelefone());
                System.out.println("POSIÇÃO: " + ((Jogador) Funcionarios.get(i)).getPos());
                if (((Jogador) Funcionarios.get(i)).getAptidao() == 1) {
                    System.out.println("APTIDÃO: Apto");
                } else {
                    System.out.println("APTIDÃO: Inapto");
                }
                System.out.println("---------------------------");
            }
        }
        System.out.println("Deseja ver uma lista dos jogadores APTOS e INAPTOS\n SIM: Digite 1\n NÂO: Digite 2");
        while (cont_aux == 0) {
            try {
                resp = input.nextInt();
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDeseja ver uma lista dos jogadores APTOS e INAPTOS\n SIM: Digite 1\n NÂO: Digite 2");
            }
        }
        cont_aux = 0;
        lixo = input.nextLine();
        if (resp == 1) {
            Jogador jogador = new Jogador();
            jogador.ver_apt_inapt(Funcionarios);
        }
    }

    @Override
    public void creat_funcionario(String tipo, java.util.ArrayList<Funcionario> Funcionarios) {
        int cont_aux = 0;
        String lixo;
        Jogador jogador = new Jogador();
        jogador.setTipo(tipo);
        System.out.println("Digite o nome do jogador");
        jogador.setNome(input.nextLine());
        System.out.println("Digite o email do jogador");
        jogador.setEmail(input.nextLine());
        System.out.println("Digite o cpf do jogador");
        jogador.setCpf(input.nextLine());
        System.out.println("Digite o salario do jogador");
        while (cont_aux == 0) {
            try {
                jogador.setSalario(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite o salario do jogadors");
            }
        }
        cont_aux = 0;
        lixo = input.nextLine();
        System.out.println("Digite o telefone do jogador");
        jogador.setTelefone(input.nextLine());
        System.out.println("Digite a posicao do jogador (volante, zagueiro, meia, goleiro, atacante, lateral esquerdo, lateral direito)");
        jogador.setPos(input.nextLine());
        System.out.println("Digite 1 se o jogador está APTO para jogar, ou 0 se está INAPTO");
        while (cont_aux == 0) {
            try {
                jogador.setAptidao(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite 1 se o jogador está APTO para jogar, ou 0 se está INAPTO");
            }
        }
        cont_aux = 0;

        Funcionarios.add(jogador);
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getAptidao() {
        return aptidao;
    }

    public void setAptidao(int aptidao) {
        this.aptidao = aptidao;
    }
}
