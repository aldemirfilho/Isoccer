package isoccer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ct {

    private String nome;
    private int qntd_dormitorio;
    private int disponibilidade;

    Scanner input = new Scanner(System.in);

    public void relat_cts(java.util.ArrayList<Ct> Centros) {
        int i;
        for (i = 0; i < Centros.size(); i++) {
            System.out.println("NOME: " + Centros.get(i).getNome());
            System.out.println("NUM. DE DORMITÓRIOS: " + Centros.get(i).getQntd_dormitorio());
            if (Centros.get(i).getDisponibilidade() == 1) {
                System.out.println("DISPONIBILIDADE: Disponivel.");
            } else {
                System.out.println("DISPONIBILIDADE: Indisponivel.");
            }
            System.out.println("---------------------------");
        }
    }

    public int search_centro(String nome, java.util.ArrayList<Ct> Centros) {
        int i, local = -1;
        for (i = 0; i < Centros.size(); i++) {
            if (Centros.get(i).getNome().equals(nome)) {
                local = i;
            }
        }
        return local;
    }

    public void edit_disp(java.util.ArrayList<Ct> Centros) {
        int local, cont_aux = 0;
        String nome, lixo;
        Ct ct = new Ct();
        System.out.println();
        System.out.println("CTs existentes: ");
        for (int i = 0; i < Centros.size(); i++) {
            System.out.println("-" + Centros.get(i).getNome());
        }
        System.out.println("Digite o nome do CT que deseja editar");
        nome = input.nextLine();
        local = ct.search_centro(nome, Centros);
        if (local != -1) {
            System.out.println("Digite a nova disponibilidade do CT:\n Disponivel: Digite 1\n Indisponivel: Digite 0");
            while (cont_aux == 0) {
                try {
                    Centros.get(local).setDisponibilidade(input.nextInt());
                    cont_aux++;
                } catch (InputMismatchException Exception) {
                    lixo = input.nextLine();
                    System.out.println();
                    System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite a nova disponibilidade do CT:\n Disponivel: Digite 1\n Indisponivel: Digite 0");
                }
            }
            cont_aux = 0;
        } else {
            System.out.println("Este CT não existe ou foi digitado incorretamente!");
        }
    }

    public void creat_ct(java.util.ArrayList<Ct> Centros) {
        int diff = 0, local, cont_aux = 0;
        String lixo;
        Ct ct = new Ct();
        System.out.println("Digite o nome do CT");
        while (diff == 0) {
            ct.setNome(input.nextLine());
            local = ct.search_centro(ct.getNome(), Centros);
            if (local != -1) {
                System.out.println("Este Nome de CT ja existe, diferencie-lhe");
                System.out.println("Digite o nome do CT:");
            }
            if (local == -1) {
                diff = 1;
            }
        }
        System.out.println("Digite a quantidade de dormitórios do CT");
        while (cont_aux == 0) {
            try {
                ct.setQntd_dormitorio(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite a quantidade de dormitórios do CT");
            }
        }
        cont_aux = 0;
        System.out.println("Digite a disponibilidade do CT:\n Disponivel: Digite 1\n Indisponivel: Digite 0");
        while (cont_aux == 0) {
            try {
                ct.setDisponibilidade(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite a disponibilidade do CT:\n Disponivel: Digite 1\n Indisponivel: Digite 0");
            }
        }
        cont_aux = 0;

        Centros.add(ct);
    }

    public int check_disp(java.util.ArrayList<Ct> Centros) {
        int i, cont = 0;
        for (i = 0; i < Centros.size(); i++) {
            if (Centros.get(i).getDisponibilidade() == 1) {
                cont++;
            }
        }
        return cont;
    }

    public int getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(int disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQntd_dormitorio() {
        return qntd_dormitorio;
    }

    public void setQntd_dormitorio(int qntd_dormitorio) {
        this.qntd_dormitorio = qntd_dormitorio;
    }
}
