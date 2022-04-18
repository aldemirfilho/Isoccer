package isoccer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Onibus {

    private String modelo;
    private int ano;
    private int disponibilidade;

    Scanner input = new Scanner(System.in);

    public void relat_transportes(java.util.ArrayList<Onibus> Transportes) {
        int i;
        for (i = 0; i < Transportes.size(); i++) {
            System.out.println("MODELO: " + Transportes.get(i).getModelo());
            System.out.println("ANO: " + Transportes.get(i).getAno());
            if (Transportes.get(i).getDisponibilidade() == 1) {
                System.out.println("DISPONIBILIDADE: Disponivel.");
            } else {
                System.out.println("DISPONIBILIDADE: Indisponivel.");
            }
            System.out.println("---------------------------");
        }
    }

    public int search_onibus(String modelo, java.util.ArrayList<Onibus> Transportes) {
        int i, local = -1;
        for (i = 0; i < Transportes.size(); i++) {
            if (Transportes.get(i).getModelo().equals(modelo)) {
                local = i;
            }
        }
        return local;
    }

    public void edit_disp(java.util.ArrayList<Onibus> Transportes) {
        int local, cont_aux = 0;
        String modelo, lixo;
        Onibus onibus = new Onibus();
        System.out.println();
        System.out.println("Modelos existentes: ");
        for (int i = 0; i < Transportes.size(); i++) {
            System.out.println("-" + Transportes.get(i).getModelo());
        }
        System.out.println("Digite o modelo do transporte que deseja editar");
        modelo = input.nextLine();
        local = onibus.search_onibus(modelo, Transportes);
        if (local != -1) {
            System.out.println("Digite a nova disponibilidade do transporte:\n Disponivel: Digite 1\n Indisponivel: Digite 0");
            while (cont_aux == 0) {
                try {
                    Transportes.get(local).setDisponibilidade(input.nextInt());
                    cont_aux++;
                } catch (InputMismatchException Exception) {
                    lixo = input.nextLine();
                    System.out.println();
                    System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite a nova disponibilidade do transporte:\n Disponivel: Digite 1\n Indisponivel: Digite 0");
                }
            }
            cont_aux = 0;
        } else {
            System.out.println("Este modelo não existe ou foi digitado incorretamente!");
        }
    }

    public void creat_onibus(java.util.ArrayList<Onibus> Transportes) {
        int diff = 0, local, cont_aux = 0;
        String lixo;
        Onibus onibus = new Onibus();
        System.out.println("Digite o modelo do Onibus:");
        while (diff == 0) {
            onibus.setModelo(input.nextLine());
            local = onibus.search_onibus(onibus.getModelo(), Transportes);
            if (local != -1) {
                System.out.println("Este Nome de modelo ja existe, diferencie-lhe");
                System.out.println("Digite o modelo do Onibus:");
            }
            if (local == -1) {
                diff = 1;
            }
        }
        System.out.println("Digite o ano do Onibus:");
        while (cont_aux == 0) {
            try {
                onibus.setAno(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite o ano do Onibus:");
            }
        }
        cont_aux = 0;
        System.out.println("Digite a disponibilidade do Onibus:\n Disponivel: Digite 1\n Indisponivel: Digite 0");
        while (cont_aux == 0) {
            try {
                onibus.setDisponibilidade(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite a disponibilidade do Onibus:\n Disponivel: Digite 1\n Indisponivel: Digite 0");
            }
        }
        cont_aux = 0;

        Transportes.add(onibus);
    }

    public int check_disp(java.util.ArrayList<Onibus> Transportes) {
        int i, cont = 0;
        for (i = 0; i < Transportes.size(); i++) {
            if (Transportes.get(i).getDisponibilidade() == 1) {
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
