
import Dominio.Evento;
import Dominio.Organizador;
import Dominio.Utilizador;

public class UC3_Controller {

    private Organizador organizador;
    
    private static Evento EVENTO;

    public UC3_Controller(Organizador organizador) {
        this.organizador =  organizador;
        
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
