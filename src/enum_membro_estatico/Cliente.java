package enum_membro_estatico;

public class Cliente {

    public enum Status { /* ele sempre vai ser static de forma implicita, porque estamos declarando de forma aninhada */
        ATIVO, BLOQUEADO
    }

    private final String nome;
    private final int idade;
    private Status status = Status.ATIVO;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

}