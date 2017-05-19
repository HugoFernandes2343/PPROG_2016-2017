package Dominio;

import java.util.ArrayList;

public class RegistoDeEventos {

    private static ArrayList<Evento> LISTA_EVENTOS;

    public ArrayList<Evento> getListaEventos() {
        return LISTA_EVENTOS;
    }

    /**
     *
     * @param tipoEvento
     */
    public void criarEvento(String tipoEvento) {
        // TODO - implement RegistoDeEventos.criarEvento
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param evento
     */
    public void registarEventos(Evento evento) {
        // TODO - implement RegistoDeEventos.registarEventos
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param evento
     */
    public void validarEvento(Evento evento) {
        // TODO - implement RegistoDeEventos.validarEvento
        throw new UnsupportedOperationException();
    }

    public void addEvento(Evento evento) {
        LISTA_EVENTOS.add(evento);
    }

    /**
     *
     * @param nomeOrganizador
     */
    public Evento[] procurarEventosDoOrganizador(Organizador nomeOrganizador) {
        // TODO - implement RegistoDeEventos.procurarEventos
        throw new UnsupportedOperationException();
    }

    public Evento[] procurarEventosDentroDaDataDeSubmissao() {
        // TODO - implement RegistoDeEventos.procurarEventosComFAEDentroDaDataDeSubmissao
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param FAE
     * @return
     */
    public ArrayList<Evento> mostrarListaEventosDoFAE(FAE FAE) {
        ArrayList<Evento> listaEventosDoFAE = new ArrayList();
        for (int i = 0; i < LISTA_EVENTOS.size(); i++) {
         boolean FAEPertenceAoEvento = LISTA_EVENTOS.get(i).getListFAE().validaFAE(FAE);
         if(FAEPertenceAoEvento = true){
             listaEventosDoFAE.add(LISTA_EVENTOS.get(i));
         }
        }
        return listaEventosDoFAE;
    }

}
