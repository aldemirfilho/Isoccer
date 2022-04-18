package isoccer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Estadio {

    private String nome;
    private int capacidade;
    private int qntd_banheiro;
    private int qntd_lanchonete;
    private int disponibilidade;

    Scanner input = new Scanner(System.in);

    public void relat_estadio(java.util.ArrayList<Estadio> Estadios) {
        int i;
        for (i = 0; i < Estadios.size(); i++) {
            System.out.println("NOME: " + Estadios.get(i).getNome());
            System.out.println("CAPACIDADE: " + Estadios.get(i).getCapacidade());
            System.out.println("NUM. DE BANHEIROS: " + Estadios.get(i).getQntd_banheiro());
            System.out.println("NUM. DE LANCHONETES: " + Estadios.get(i).getQntd_lanchonete());
            if (Estadios.get(i).getDisponibilidade() == 1) {
                System.out.println("DISPONIBILIDADE: Disponivel.");
            } else {
                System.out.println("DISPONIBILIDADE: Indisponivel.");
            }
            System.out.println("---------------------------");
        }
    }

    public int search_estadio(String nome, java.util.ArrayList<Estadio> Estadios) {
        int i, local = -1;
        for (i = 0; i < Estadios.size(); i++) {
            if (Estadios.get(i).getNome().equals(nome)) {
                local = i;
            }
        }
        return local;
    }

    public void edit_disp(java.util.ArrayList<Estadio> Estadios) {
        int local, cont_aux = 0;
        String nome, lixo;
        Estadio estadio = new Estadio();
        System.out.println();
        System.out.println("Estadios existentes: ");
        for (int i = 0; i < Estadios.size(); i++) {
            System.out.println("-" + Estadios.get(i).getNome());
        }
        System.out.println("Digite o nome do estadio que deseja editar");
        nome = input.nextLine();
        local = estadio.search_estadio(nome, Estadios);
        if (local != -1) {
            System.out.println("Digite a nova disponibilidade do estadio:\n Disponivel: Digite 1\n Indisponivel: Digite 0");
            while (cont_aux == 0) {
                try {
                    Estadios.get(local).setDisponibilidade(input.nextInt());
                    cont_aux++;
                } catch (InputMismatchException Exception) {
                    lixo = input.nextLine();
                    System.out.println();
                    System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite a nova disponibilidade do estadio:\n Disponivel: Digite 1\n Indisponivel: Digite 0");
                }
            }
            cont_aux = 0;
        } else {
            System.out.println("Este estadio não existe ou foi digitado incorretamente!");
        }
    }

    public void creat_estadio(java.util.ArrayList<Estadio> Estadios) {
        int diff = 0, local, cont_aux = 0;
        String lixo;
        Estadio estadio = new Estadio();
        System.out.println("Digite o nome do Estadio");
        while (diff == 0) {
            estadio.setNome(input.nextLine());
            local = estadio.search_estadio(estadio.getNome(), Estadios);
            if (local != -1) {
                System.out.println("Este Nome de estadio ja existe, diferencie-lhe");
                System.out.println("Digite o nome do Estadio:");
            }
            if (local == -1) {
                diff = 1;
            }
        }
        System.out.println("Digite a capacidade do Estadio");
        while (cont_aux == 0) {
            try {
                estadio.setCapacidade(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite a capacidade do Estadio");
            }
        }
        cont_aux = 0;
        System.out.println("Digite a quantidade de banheiros do Estadio");
        while (cont_aux == 0) {
            try {
                estadio.setQntd_banheiro(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite a quantidade de banheiros do Estadio");
            }
        }
        cont_aux = 0;
        System.out.println("Digite a quantidade de lanchonetes do Estadio");
        while (cont_aux == 0) {
            try {
                estadio.setQntd_lanchonete(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite a quantidade de lanchonetes do Estadio");
            }
        }
        cont_aux = 0;
        System.out.println("Digite a disponibilidade do Estadio:\n Disponivel: Digite 1\n Indisponivel: Digite 0");
        while (cont_aux == 0) {
            try {
                estadio.setDisponibilidade(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite a disponibilidade do Estadio:\n Disponivel: Digite 1\n Indisponivel: Digite 0");
            }
        }
        cont_aux = 0;

        Estadios.add(estadio);
    }

    public int check_disp(java.util.ArrayList<Estadio> Estadios) {
        int i, cont = 0;
        for (i = 0; i < Estadios.size(); i++) {
            if (Estadios.get(i).getDisponibilidade() == 1) {
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

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQntd_banheiro() {
        return qntd_banheiro;
    }

    public void setQntd_banheiro(int qntd_banheiro) {
        this.qntd_banheiro = qntd_banheiro;
    }

    public int getQntd_lanchonete() {
        return qntd_lanchonete;
    }

    public void setQntd_lanchonete(int qntd_lanchonete) {
        this.qntd_lanchonete = qntd_lanchonete;
    }
}
