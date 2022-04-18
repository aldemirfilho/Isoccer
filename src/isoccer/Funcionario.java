package isoccer;

public abstract class Funcionario {

    private String nome;
    private String email;
    private String cpf;
    private int salario;
    private String telefone;
    private String tipo;

    public void relat_func_gerais(java.util.ArrayList<Funcionario> Funcionarios) {
        int i;
        for (i = 0; i < Funcionarios.size(); i++) {
            if (!(Funcionarios.get(i).getTipo().equals("tecnico")) && !(Funcionarios.get(i).getTipo().equals("jogador"))) {
                System.out.println("CARGO: " + Funcionarios.get(i).getTipo());
                System.out.println("NOME: " + Funcionarios.get(i).getNome());
                System.out.println("EMAIL: " + Funcionarios.get(i).getEmail());
                System.out.println("CPF: " + Funcionarios.get(i).getCpf());
                System.out.println("SALÁRIO: " + Funcionarios.get(i).getSalario());
                System.out.println("TELEFONE: " + Funcionarios.get(i).getTelefone());
                if (Funcionarios.get(i).getTipo().equals("medico")) {
                    System.out.println("CRM: " + ((Medico) Funcionarios.get(i)).getCrm());
                }
                if (Funcionarios.get(i).getTipo().equals("motorista")) {
                    System.out.println("NÚMERO DA HABILITAÇÃO: " + ((Motorista) Funcionarios.get(i)).getNum_hab());
                }
                System.out.println("---------------------------");
            }
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
