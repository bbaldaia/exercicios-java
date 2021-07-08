package ex;

public class Cliente {

    String nome;
    String telefone;
    String cpf;
    String endereco;
    int idade;

    public void incluirNomedoCliente(String novonome) {

        this.nome = novonome;


    }

    public void incluirTelefonedocliente(String novoTelefone) {

        this.telefone = novoTelefone;

    }

    public void incluirCpf(String novocpf) {

        this.cpf = novocpf;

    }

    public void incluirEndereco(String novoendereco) {

        this.endereco = novoendereco;


    }

    public void incluirIdade(int novaidade) {

        this.idade = novaidade;

    }

}
