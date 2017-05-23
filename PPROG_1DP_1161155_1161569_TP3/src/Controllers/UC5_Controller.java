package Controllers;

import Dominio.Candidatura;
import Dominio.CentroDeEventos;
import Dominio.Evento;
import Dominio.ListCandidaturas;
import java.util.ArrayList;
import Dominio.Utilizador;
public class UC5_Controller {

    private Utilizador utilizador;
    private CentroDeEventos centroDeEventos;
    private ArrayList<Evento> listaDeEventosAtivos = new ArrayList();
    private Evento evento;
    private ListCandidaturas listaCandidaturas;
    private Candidatura candidatura;

    /**
     * construtor do controller
     *
     * @param utilizador representante que esta a usar a app
     * @param centroDeEventos centro de eventos da app
     */
    public UC5_Controller(Utilizador utilizador, CentroDeEventos centroDeEventos) {
        this.utilizador = utilizador;
        this.centroDeEventos = centroDeEventos;
    }

    /**
     * mostra todos os eventos que ainda podem ter candidaturas submetidas neles
     *
     * @return lista de eventos que estao ativos
     */
    public ArrayList<Evento> mostrarListaEventosAtivos() {
        ArrayList<Evento> listaDeEventos = centroDeEventos.getRegistoEventos().getListaEventos();
        for (int i = 0; i < listaDeEventos.size(); i++) {
            boolean eventoAtivo = listaDeEventos.get(i).validaDataFimSubmissoes();
            if (eventoAtivo == false) {
                listaDeEventosAtivos.add(listaDeEventos.get(i));
            }
        }
        return listaDeEventosAtivos;
    }

    /**
     *  Define como evento escolhido o evento dado como parametro
     * @param evento evento escolhido
     */
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    /**
     * cria uma candidatura com os dados introduzidos
     *
     * @param dadosCandidatura dados da candidatura
     * @return candidatura defenida para confirmacao
     */
    public Candidatura defenirCandidatura(String dadosCandidatura) {
        listaCandidaturas = evento.getListCandidaturas();
        candidatura = listaCandidaturas.criarCandidatura();
        candidatura.setDadosCandidatura(dadosCandidatura);
        return candidatura;
    }

    /**
     * guarda permanentemente a candidatura
     */
    public void registarCandidatura() {
        listaCandidaturas.guardarCandidatura(candidatura);
    }
}
