package classes_aninhadas_estaticas;

public class ServicoEmail {

    public void enviar(Mensagem mensagem) {
        System.out.printf("Enviando de %s para %s: %s%n",
                mensagem.remetente, mensagem.getDestinatario(), mensagem.getTexto());
    }

    private static String gerarAssinatura() {
        return "\n--\nAlgaWorks";
    }

    public static class Mensagem { /* Temos uma Classe Estatica dentro de 'Mensagem' dentro da classe 'ServicoEmail '*/

        private final String remetente;
        private final String destinatario;
        private final String texto;

        public Mensagem(String remetente, String destinatario, String texto) {
            this.remetente = remetente;
            this.destinatario = destinatario;
            this.texto = texto;
        }

        public String getRemetente() {
            return remetente;
        }

        public String getDestinatario() {
            return destinatario;
        }

        public String getTexto() {
            return texto + gerarAssinatura(); // como estamos dentro da classe podemos ter acesso ao metodo
        }

    }

}