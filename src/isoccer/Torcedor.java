package isoccer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Torcedor {

    private String tipo;
    private int valor;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String endereco;
    private int estado;

    Scanner input = new Scanner(System.in);

    public void dados_individuais(java.util.ArrayList<Torcedor> Torcedores) {
        int i;
        for (i = 0; i < Torcedores.size(); i++) {
            System.out.println("TIPO: " + Torcedores.get(i).getTipo());
            System.out.println("NOME: " + Torcedores.get(i).getNome());
            System.out.println("EMAIL: " + Torcedores.get(i).getEmail());
            System.out.println("CPF: " + Torcedores.get(i).getCpf());
            System.out.println("TELEFONE: " + Torcedores.get(i).getTelefone());
            System.out.println("VALOR: " + Torcedores.get(i).getValor());
            System.out.println("ENDEREÇO: " + Torcedores.get(i).getEndereco());
            if (Torcedores.get(i).getEstado() == 1) {
                System.out.println("SITUAÇÃO: ADIMPLENTE.");
            } else {
                System.out.println("SITUAÇÃO: INADIMPLENTE.");
            }
            System.out.println("---------------------------");
        }
    }

    public void dados_basicos(java.util.ArrayList<Torcedor> Torcedores) {
        int i, cont1 = 0, cont2 = 0;
        for (i = 0; i < Torcedores.size(); i++) {
            if (Torcedores.get(i).getEstado() == 1) {
                cont1++;
            }
            if (Torcedores.get(i).getEstado() == 0) {
                cont2++;
            }
        }
        System.out.println("QUANTIDADE: " + Torcedores.size());
        System.out.println("ADIMPLENTES: " + cont1);
        System.out.println("INADIMPLENTES: " + cont2);
    }

    public void creat_torcedor(int[] taxas, String tipo, java.util.ArrayList<Torcedor> Torcedores) {
        int cont_aux = 0;
        String lixo;
        Torcedor torcedor = new Torcedor();
        System.out.println("Digite o nome do torcedor");
        torcedor.setNome(input.nextLine());
        System.out.println("Digite o email do torcedor");
        torcedor.setEmail(input.nextLine());
        if (tipo.equals("junior")) {
            torcedor.setTipo("junior");
            torcedor.setValor(taxas[0]);
        }
        if (tipo.equals("senior")) {
            torcedor.setTipo("senior");
            torcedor.setValor(taxas[1]);
        }
        if (tipo.equals("elite")) {
            torcedor.setTipo("elite");
            torcedor.setValor(taxas[2]);
        }
        System.out.println("Digite o cpf do torcedor");
        torcedor.setCpf(input.nextLine());
        System.out.println("Digite o telefone do torcedor");
        torcedor.setTelefone(input.nextLine());
        System.out.println("Digite o Endereço do torcedor");
        torcedor.setEndereco(input.nextLine());
        System.out.println("Digite 1 se o jogador está ADIMPLENTE, ou 0 se está INADIMPLENTE");
        while (cont_aux == 0) {
            try {
                torcedor.setEstado(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite 1 se o jogador está ADIMPLENTE, ou 0 se está INADIMPLENTE");
            }
        }
        cont_aux = 0;

        Torcedores.add(torcedor);
    }

    public int[] edit_taxas(int taxas[]) {
        int cont_aux = 0;
        String lixo;
        System.out.println("Digite a taxa de cada tipo de torcedor:");
        System.out.print("Junior: ");
        while (cont_aux == 0) {
            try {
                taxas[0] = input.nextInt();
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nJunior: ");
            }
        }
        cont_aux = 0;
        System.out.println();
        System.out.print("Senior: ");
        while (cont_aux == 0) {
            try {
                taxas[1] = input.nextInt();
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nSenior: ");
            }
        }
        cont_aux = 0;
        System.out.println();
        System.out.print("elite: ");
        while (cont_aux == 0) {
            try {
                taxas[2] = input.nextInt();
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nelite: ");
            }
        }
        cont_aux = 0;
        System.out.println();

        return taxas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
