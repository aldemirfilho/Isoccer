package isoccer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Isoccer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("                 Bem vindo ao ISoccer!!\n");
        System.out.println();
        System.out.println("->Realize o Login como operador, e administre o sistema Isoccer!!!\n");
        System.out.println("->Lembre-se do Login e senha, pois só aparecerão uma vez por questao de seguranca!");
        System.out.println();
        System.out.println("Este é seu Login: admin");
        int senha_aux = (int) (Math.random() * 10000);
        System.out.println("Esta é sua senha: " + senha_aux);
        System.out.println();
        int opcao = 0;
        String login, lixo;
        int senha = 0, cont = 0, cont_aux = 0;
        int[] taxas = new int[3];
        while (opcao != 10) {
            System.out.println("Realize o login para operar o sistema...");
            System.out.print("Login: ");
            login = input.nextLine();
            System.out.print("Senha: ");
            while (cont_aux == 0) {
                try {
                    senha = input.nextInt();
                    System.out.println();
                    cont_aux++;
                } catch (InputMismatchException Exception) {
                    lixo = input.nextLine();
                    System.out.println();
                    System.out.print("Foi digitado um elemento diferente de um numero! Tente novamente...\nSenha: ");
                }
            }
            cont_aux = 0;
            lixo = input.nextLine();
            System.out.println();
            if (login.equals("admin") && senha == senha_aux) {
                System.out.println("Login efetuado com sucesso!!!");
                System.out.println();
                System.out.println("           Opcoes:");
                System.out.print("1. Adição de Funcionários;\n");
                System.out.print("2. Adição de Sócio Torcedores / Ediçaõ de taxas;\n");
                System.out.print("3. Gerenciar Recursos Físicos;\n");
                System.out.print("4. Exibir Relatório;\n");
                System.out.print("5. Sair do Operador;\n");
                System.out.println();
                System.out.print("Digite a opcão desejada:\n Resp: ");
                while (cont_aux == 0) {
                    try {
                        opcao = input.nextInt();
                        System.out.println();
                        cont_aux++;
                    } catch (InputMismatchException Exception) {
                        lixo = input.nextLine();
                        System.out.println();
                        System.out.print("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite a opcão desejada:\n Resp: ");
                    }
                }
                cont_aux = 0;
                System.out.println();
                lixo = input.nextLine();

                java.util.ArrayList<Funcionario> Funcionarios = new java.util.ArrayList<>();
                java.util.ArrayList<Torcedor> Torcedores = new java.util.ArrayList<>();
                java.util.ArrayList<Onibus> Transportes = new java.util.ArrayList<>();
                java.util.ArrayList<Estadio> Estadios = new java.util.ArrayList<>();
                java.util.ArrayList<Ct> Centros = new java.util.ArrayList<>();

                while (opcao != 5) {
                    if (opcao == 1) {
                        String tipo;
                        System.out.print("Digite o tipo de funcionário que deseja adcionar ao sistema: (presidente, medico, tecnico, preparador, motorista, cozinheiro, advogado, segurança, jogador)\n Resp: ");;
                        tipo = input.nextLine();
                        System.out.println();
                        if (tipo.equals("presidente")) {
                            Presidente presidente = new Presidente();
                            presidente.creat_funcionario(tipo, Funcionarios);
                        }
                        if (tipo.equals("medico")) {
                            Medico medico = new Medico();
                            medico.creat_funcionario(tipo, Funcionarios);
                        }
                        if (tipo.equals("tecnico")) {
                            Tecnico tecnico = new Tecnico();
                            tecnico.creat_funcionario(tipo, Funcionarios);
                        }
                        if (tipo.equals("preparador")) {
                            Preparador preparador = new Preparador();
                            preparador.creat_funcionario(tipo, Funcionarios);
                        }
                        if (tipo.equals("motorista")) {
                            Motorista motorista = new Motorista();
                            motorista.creat_funcionario(tipo, Funcionarios);
                        }
                        if (tipo.equals("cozinheiro")) {
                            Cozinheiro cozinheiro = new Cozinheiro();
                            cozinheiro.creat_funcionario(tipo, Funcionarios);
                        }
                        if (tipo.equals("advogado")) {
                            Advogado advogado = new Advogado();
                            advogado.creat_funcionario(tipo, Funcionarios);
                        }
                        if (tipo.equals("seguranca")) {
                            Seguranca seguranca = new Seguranca();
                            seguranca.creat_funcionario(tipo, Funcionarios);
                        }
                        if (tipo.equals("jogador")) {
                            Jogador jogador = new Jogador();
                            jogador.creat_funcionario(tipo, Funcionarios);
                        }
                    }
                    if (opcao == 2) {
                        if (cont == 0) {
                            System.out.println("Por se tratar do seu primeiro acesso, cadastre qual taxa será paga por cada tipo de torcedor:");
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
                            cont++;
                        }
                        int escolha = 0;
                        String tipo;
                        System.out.print("Para cadastrar um novo torcedor Digite: 1\nPara editar as taxas Digite: 2\n Resp: ");
                        while (cont_aux == 0) {
                            try {
                                escolha = input.nextInt();
                                System.out.println();
                                cont_aux++;
                            } catch (InputMismatchException Exception) {
                                lixo = input.nextLine();
                                System.out.println();
                                System.out.print("Foi digitado um elemento diferente de um numero! Tente novamente...\nPara cadastrar um novo torcedor Digite: 1\nPara editar as taxas Digite: 2\n Resp: ");
                            }
                        }
                        cont_aux = 0;
                        System.out.println();
                        lixo = input.nextLine();
                        if (escolha == 1) {
                            System.out.print("Digite o tipo de torcedor: (junior, senior, elite)\n Resp: ");
                            tipo = input.nextLine();
                            System.out.println();
                            Torcedor torcedor = new Torcedor();
                            torcedor.creat_torcedor(taxas, tipo, Torcedores);
                        }
                        if (escolha == 2) {
                            Torcedor torcedor = new Torcedor();
                            taxas = torcedor.edit_taxas(taxas);
                        }
                    }
                    if (opcao == 3) {
                        System.out.println();
                        String tipo;
                        System.out.print("Digite qual tipo de recurso físico deseja criar/editar: (onibus, estadio, ct)\n Resp: ");
                        tipo = input.nextLine();
                        System.out.println();
                        if (tipo.equals("onibus")) {
                            System.out.println();
                            int resp = 0;
                            System.out.print("Voce deseja adicionar/editar um transporte ou verificar?\n Digite 1: adicionar/editar\n Digite 2: verificar\n Resp: ");
                            while (cont_aux == 0) {
                                try {
                                    resp = input.nextInt();
                                    System.out.println();
                                    cont_aux++;
                                } catch (InputMismatchException Exception) {
                                    lixo = input.nextLine();
                                    System.out.println();
                                    System.out.print("Foi digitado um elemento diferente de um numero! Tente novamente...\nVoce deseja adicionar/editar um transporte ou verificar?\n Digite 1: adicionar/editar\n Digite 2: verificar\n Resp: ");
                                }
                            }
                            cont_aux = 0;
                            System.out.println();
                            lixo = input.nextLine();
                            if (resp == 1) {
                                int escolha = 0;
                                System.out.print("Adicionar: Digite 1\nEditar: Digite 2\n Resp: ");
                                while (cont_aux == 0) {
                                    try {
                                        escolha = input.nextInt();
                                        System.out.println();
                                        cont_aux++;
                                    } catch (InputMismatchException Exception) {
                                        lixo = input.nextLine();
                                        System.out.println();
                                        System.out.print("Foi digitado um elemento diferente de um numero! Tente novamente...\nAdicionar: Digite 1\nEditar: Digite 2\n Resp: ");
                                    }
                                }
                                cont_aux = 0;
                                System.out.println();
                                lixo = input.nextLine();
                                if (escolha == 1) {
                                    System.out.println();
                                    Onibus onibus = new Onibus();
                                    onibus.creat_onibus(Transportes);
                                }
                                if (escolha == 2) {
                                    System.out.println();
                                    Onibus onibus = new Onibus();
                                    onibus.edit_disp(Transportes);
                                }
                            }
                            if (resp == 2) {
                                System.out.println();
                                int disp;
                                if (Transportes.size() == 0) {
                                    System.out.println("Não há transportes disponiveis");
                                } else {
                                    Onibus onibus = new Onibus();
                                    disp = onibus.check_disp(Transportes);
                                    if (disp != 0) {
                                        System.out.println("Há os seguintes transportes disponiveis");
                                        for (int i = 0; i < Transportes.size(); i++) {
                                            if (Transportes.get(i).getDisponibilidade() == 1) {
                                                System.out.println("-" + Transportes.get(i).getModelo());
                                            }
                                        }
                                    } else {
                                        System.out.println("Não há transportes disponiveis");

                                    }
                                }
                            }
                        }
                        if (tipo.equals("estadio")) {
                            System.out.println();
                            int resp = 0;
                            System.out.print("Voce deseja adicionar/editar um estadio ou verificar?\n Digite 1: adicionar/editar\n Digite 2: verificar\n Resp: ");
                            while (cont_aux == 0) {
                                try {
                                    resp = input.nextInt();
                                    System.out.println();
                                    cont_aux++;
                                } catch (InputMismatchException Exception) {
                                    lixo = input.nextLine();
                                    System.out.println();
                                    System.out.print("Foi digitado um elemento diferente de um numero! Tente novamente...\nVoce deseja adicionar/editar um estadio ou verificar?\n Digite 1: adicionar/editar\n Digite 2: verificar\n Resp: ");
                                }
                            }
                            cont_aux = 0;
                            System.out.println();
                            lixo = input.nextLine();
                            if (resp == 1) {
                                int escolha = 0;
                                System.out.print("Adicionar: Digite 1\nEditar: Digite 2\n Resp: ");
                                while (cont_aux == 0) {
                                    try {
                                        escolha = input.nextInt();
                                        System.out.println();
                                        cont_aux++;
                                    } catch (InputMismatchException Exception) {
                                        lixo = input.nextLine();
                                        System.out.println();
                                        System.out.print("Foi digitado um elemento diferente de um numero! Tente novamente...\nAdicionar: Digite 1\nEditar: Digite 2\n Resp: ");
                                    }
                                }
                                cont_aux = 0;
                                System.out.println();
                                lixo = input.nextLine();
                                if (escolha == 1) {
                                    System.out.println();
                                    Estadio estadio = new Estadio();
                                    estadio.creat_estadio(Estadios);
                                }
                                if (escolha == 2) {
                                    System.out.println();
                                    Estadio estadio = new Estadio();
                                    estadio.edit_disp(Estadios);
                                }
                            }
                            if (resp == 2) {
                                System.out.println();
                                int disp;
                                if (Estadios.size() == 0) {
                                    System.out.println("Não há Estadio disponivel");
                                } else {
                                    Estadio estadio = new Estadio();
                                    disp = estadio.check_disp(Estadios);
                                    if (disp != 0) {
                                        System.out.println("Há os seguintes Estadios disponiveis:");;
                                        for (int i = 0; i < Estadios.size(); i++) {
                                            if (Estadios.get(i).getDisponibilidade() == 1) {
                                                System.out.println("-" + Estadios.get(i).getNome());
                                            }
                                        }
                                    } else {
                                        System.out.println("Não há Estadio disponivel");

                                    }
                                }
                            }
                        }
                        if (tipo.equals("ct")) {
                            System.out.println();
                            int resp = 0;
                            System.out.print("Voce deseja adicionar/editar um CT ou verificar?\n Digite 1: adicionar/editar\n Digite 2: verificar\n Resp: ");
                            while (cont_aux == 0) {
                                try {
                                    resp = input.nextInt();
                                    System.out.println();
                                    cont_aux++;
                                } catch (InputMismatchException Exception) {
                                    lixo = input.nextLine();
                                    System.out.println();
                                    System.out.print("Foi digitado um elemento diferente de um numero! Tente novamente...\nVoce deseja adicionar/editar um CT ou verificar?\n Digite 1: adicionar/editar\n Digite 2: verificar\n Resp: ");
                                }
                            }
                            cont_aux = 0;
                            System.out.println();
                            lixo = input.nextLine();
                            if (resp == 1) {
                                int escolha = 0;
                                System.out.print("Adicionar: Digite 1\nEditar: Digite 2\n Resp: ");
                                while (cont_aux == 0) {
                                    try {
                                        escolha = input.nextInt();
                                        System.out.println();
                                        cont_aux++;
                                    } catch (InputMismatchException Exception) {
                                        lixo = input.nextLine();
                                        System.out.println();
                                        System.out.print("Foi digitado um elemento diferente de um numero! Tente novamente...\nAdicionar: Digite 1\nEditar: Digite 2\n Resp: ");
                                    }
                                }
                                cont_aux = 0;
                                System.out.println();
                                lixo = input.nextLine();
                                if (escolha == 1) {
                                    System.out.println();
                                    Ct ct = new Ct();
                                    ct.creat_ct(Centros);
                                }
                                if (escolha == 2) {
                                    System.out.println();
                                    Ct ct = new Ct();
                                    ct.edit_disp(Centros);
                                }
                            }
                            if (resp == 2) {
                                System.out.println();
                                int disp;
                                if (Centros.size() == 0) {
                                    System.out.println("Não há Estadio disponivel");
                                } else {
                                    Ct ct = new Ct();
                                    disp = ct.check_disp(Centros);
                                    if (disp != 0) {
                                        System.out.println("Há os seguintes CTs disponiveis");
                                        for (int i = 0; i < Centros.size(); i++) {
                                            if (Centros.get(i).getDisponibilidade() == 1) {
                                                System.out.println("-" + Centros.get(i).getNome());
                                            }
                                        }
                                    } else {
                                        System.out.println("Não há CT disponivel");

                                    }
                                }
                            }
                        }
                    }
                    if (opcao == 4) {
                        String resp;
                        System.out.println();
                        System.out.println("Você pode solicitar relatórios do estado atual dos recursos do clube");
                        System.out.print("Digite o recurso que deseja analisar: funcionarios, recursos fisicos, torcedor, todos juntos\n Resp: ");
                        resp = input.nextLine();
                        System.out.println();

                        Tecnico tecnico = new Tecnico();
                        Jogador jogador = new Jogador();
                        Presidente presidente = new Presidente();

                        Onibus onibus = new Onibus();
                        Estadio estadio = new Estadio();
                        Ct ct = new Ct();

                        Torcedor torcedor = new Torcedor();

                        if (resp.equals("funcionarios")) {
                            int escolha = 0;
                            System.out.print("Escolha:\n Funcionarios do time: Digite 1\n Funcionarios de serviços gerais: Digite 2\n Resp: ");
                            while (cont_aux == 0) {
                                try {
                                    escolha = input.nextInt();
                                    System.out.println();
                                    cont_aux++;
                                } catch (InputMismatchException Exception) {
                                    lixo = input.nextLine();
                                    System.out.println();
                                    System.out.print("Foi digitado um elemento diferente de um numero! Tente novamente...\nEscolha:\n Funcionarios do time: Digite 1\n Funcionarios de serviços gerais: Digite 2\n Resp: ");
                                }
                            }
                            cont_aux = 0;
                            System.out.println();
                            lixo = input.nextLine();
                            if (escolha == 1) {
                                System.out.println("-------------TÉCNICO---------------");
                                tecnico.relat_tecnico(Funcionarios);
                                System.out.println("-------------JOGADORES---------------");
                                jogador.relat_jogador(Funcionarios);
                            }
                            if (escolha == 2) {
                                //CLASSE QUALQUER
                                System.out.println("---------------------------");
                                presidente.relat_func_gerais(Funcionarios);
                            }
                        }
                        if (resp.equals("recursos fisicos")) {
                            int escolha = 0;
                            System.out.print("Escolha:\n Transporte: Digite 1\n Estadio: Digite 2\n CT: Digite 3\n Resp: ");
                            while (cont_aux == 0) {
                                try {
                                    escolha = input.nextInt();
                                    cont_aux++;
                                } catch (InputMismatchException Exception) {
                                    lixo = input.nextLine();
                                    System.out.println();
                                    System.out.print("Foi digitado um elemento diferente de um numero! Tente novamente...\nEscolha:\n Transporte: Digite 1\n Estadio: Digite 2\n CT: Digite 3\n Resp: ");
                                }
                            }
                            cont_aux = 0;
                            System.out.println();
                            lixo = input.nextLine();
                            if (escolha == 1) {
                                System.out.println("---------------------------");
                                onibus.relat_transportes(Transportes);
                            }
                            if (escolha == 2) {
                                System.out.println("---------------------------");
                                estadio.relat_estadio(Estadios);
                            }
                            if (escolha == 3) {
                                System.out.println("---------------------------");
                                ct.relat_cts(Centros);
                            }
                        }
                        if (resp.equals("torcedor")) {
                            int escolha = 0;
                            System.out.print("Escolha:\n Dados gerais básicos(Quantidade, Adimplente, Inadimplente): Digite 1\n Lista com dados individuais: Digite 2\n Resp: ");
                            while (cont_aux == 0) {
                                try {
                                    escolha = input.nextInt();
                                    System.out.println();
                                    cont_aux++;
                                } catch (InputMismatchException Exception) {
                                    lixo = input.nextLine();
                                    System.out.println();
                                    System.out.print("Foi digitado um elemento diferente de um numero! Tente novamente...\nEscolha:\n Dados gerais básicos(Quantidade, Adimplente, Inadimplente): Digite 1\n Lista com dados individuais: Digite 2\n Resp: ");
                                }
                            }
                            cont_aux = 0;
                            System.out.println();
                            lixo = input.nextLine();
                            if (escolha == 1) {
                                System.out.println("---------------------------");
                                torcedor.dados_basicos(Torcedores);
                                System.out.println("---------------------------");
                            }
                            if (escolha == 2) {
                                System.out.println("---------------------------");
                                torcedor.dados_individuais(Torcedores);
                            }
                        }
                        if (resp.equals("todos juntos")) {
                            System.out.println("-------------TÉCNICO---------------");
                            tecnico.relat_tecnico(Funcionarios);
                            System.out.println();
                            System.out.println("-------------JOGADORES---------------");
                            jogador.relat_jogador(Funcionarios);
                            System.out.println();
                            System.out.println("-------------SERVIÇOS GERAIS---------------");
                            presidente.relat_func_gerais(Funcionarios);
                            System.out.println();
                            System.out.println("-------------TRANSPORTES---------------");
                            onibus.relat_transportes(Transportes);
                            System.out.println();
                            System.out.println("-------------ESTÁDIOS---------------");
                            estadio.relat_estadio(Estadios);
                            System.out.println();
                            System.out.println("-------------CENTROS DE TREINAMENTO---------------");
                            ct.relat_cts(Centros);
                            System.out.println();
                            System.out.println("-------------DADOS BASICOS DA TORCIDA---------------");
                            torcedor.dados_basicos(Torcedores);
                            System.out.println();
                            System.out.println("-------------TORCEDORES---------------");
                            torcedor.dados_individuais(Torcedores);
                            System.out.println();
                        }
                    }
                    System.out.println();
                    System.out.println("           Opcoes:");
                    System.out.print("1. Adição de Funcionários;\n");
                    System.out.print("2. Adição de Sócio Torcedores / Ediçaõ de taxas;\n");
                    System.out.print("3. Gerenciar Recursos Físicos;\n");
                    System.out.print("4. Exibir Relatório;\n");
                    System.out.print("5. Sair do Operador;\n");
                    System.out.println();
                    System.out.print("Digite a opcão desejada\n Resp: ");
                    while (cont_aux == 0) {
                        try {
                            opcao = input.nextInt();
                            System.out.println();
                            cont_aux++;
                        } catch (InputMismatchException Exception) {
                            lixo = input.nextLine();
                            System.out.println();
                            System.out.print("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite a opcão desejada\n Resp: ");
                        }
                    }
                    cont_aux = 0;
                    System.out.println();
                    lixo = input.nextLine();
                }
                if (opcao == 5) {
                    System.out.println();
                }
            } else {
                System.out.println("Login ou senha inválidos");
            }
        }
    }
}
