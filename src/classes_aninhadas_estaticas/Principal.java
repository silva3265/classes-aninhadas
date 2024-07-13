package classes_aninhadas_estaticas;

public class Principal {

    public static void main(String[] args) {
        ServicoEmail servico = new ServicoEmail();

        ServicoEmail.Mensagem mensagem = new ServicoEmail.Mensagem( /* Pra poder chamar vai ficar assim 'ServicoEmail.Mensagem', Nome da classe e em seguida o nome da classe aninhada  */
                "joao@algaworks.com", "maria@algaworks.com",
                "Olá, tudo bem?");

        servico.enviar(mensagem);
    }

}