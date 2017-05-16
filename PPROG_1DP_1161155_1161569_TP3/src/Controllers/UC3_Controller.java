
import Dominio.Evento;
import Dominio.Organizador;
import Dominio.Utilizador;

public class UC3_Controller {

    private Organizador organizador;
    private Evento evento;

    public UC3_Controller(Utilizador utilizador) {
        this.organizador = new Organizador(utilizador);
        this.evento=new Evento();
    }

    public static Evento[] mostrarListaEventosDoOrganizador() {
        // TODO - implement UC3_Controller.mostrarListaEventos
        throw new UnsupportedOperationException();
    }


    /**
     *
     * @param dadosCandidatura
     */
    public void fazerCandidatura(String dadosCandidatura) {
        // TODO - implement UC3_Controller.fazerCandidatura
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param evento
     */
    public void criarCandidatura(Evento evento) {
        // TODO - implement UC3_Controller.criarCandidatura
        throw new UnsupportedOperationException();
    }

}
