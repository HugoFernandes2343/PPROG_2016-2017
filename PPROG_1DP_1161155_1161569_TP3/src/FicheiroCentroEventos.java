
import Dominio.Candidatura;
import Dominio.CentroDeEventos;
import Dominio.Congresso;
import Dominio.Evento;
import Dominio.Exposicao;
import Dominio.FAE;
import Dominio.GestorDeEventos;
import Dominio.Organizador;
import Dominio.Utilizador;
import java.io.*;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Hugo Carvalho
 */
public class FicheiroCentroEventos {

    /**
     * Nome do ficheiro onde ficará guardada a instância de CentroEventos a ser
     * considerada e no qual tanto vai ser guardada como obtida a instância
     * CentroEventos em questão
     */
    public static final Scanner in = new Scanner(System.in);
    public static final String NOME_FICHEIRO_IN = "CentroDeEventosIn.bin";
    public static final String NOME_FICHEIRO_OUT = "CentroDeEventosOut.bin";
    public static final String NOME_FICHEIRO_TXT = "Dados.txt";

    /**
     * Cria uma instância de FicheiroCentroEventos sem receber qualquer
     * parâmetro.
     */
    public FicheiroCentroEventos() {
    }

    /**
     * Método que permite ler do ficheiro a instância de Centro de Eventos
     * criada/guardada anteriormente.
     *
     * @return Instância de CentroEventos cujos eventos irão ser geridos
     */
    public CentroDeEventos lerFicheiroBin() {
        CentroDeEventos ce;
        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(NOME_FICHEIRO_IN));
            try {
                ce = (CentroDeEventos) in.readObject();
            } finally {
                in.close();
            }
            return ce;
        } catch (IOException | ClassNotFoundException ex) {
            return null;
        }
    }

    public CentroDeEventos lerFicheiroTxt() throws FileNotFoundException {
        String marcador = null;
        Scanner ficheiro = new Scanner(new File(NOME_FICHEIRO_TXT));
        ArrayList<Utilizador> utilizadores = new ArrayList();
        ArrayList<Evento> eventos = new ArrayList();
        ArrayList<GestorDeEventos> gestores = new ArrayList();
        CentroDeEventos centroEventos = new CentroDeEventos();
        while (ficheiro.hasNext()) {
            String dados = ficheiro.nextLine();
            marcador = verificarMarcador(dados, marcador);
            // Se linha não está em branco trata-a
            if (dados.length() > 0) {
                if (marcador.equals("--Utilizadores--") && dados.compareTo(marcador) != 0) {
                    Utilizador user = instanciarUtilizador(dados);
                    utilizadores.add(user);
                }
                if (marcador.equals("--GestorDeEventos--") && dados.compareTo(marcador) != 0) {
                    GestorDeEventos gestor = instanciarGestorDeEventos(dados, utilizadores);
                    if (gestor != null) {
                        gestores.add(gestor);
                    }
                }
                if (marcador.equals("--Exposicao--") && dados.compareTo(marcador) != 0) {
                    Exposicao exposicao = instanciarExposicao(utilizadores, ficheiro, marcador, dados);
                    centroEventos.registarEvento(exposicao);
                }
                if (marcador.equals("--Congresso--") && dados.compareTo(marcador) != 0) {
                    Congresso congresso = instanciarCongresso(utilizadores, ficheiro, marcador, dados);
                    centroEventos.registarEvento(congresso);
                }
            }
        }
        ficheiro.close();
        centroEventos.setListGestorDeEventos(gestores);
        centroEventos.setRegistoUtilizadores(utilizadores);
        return centroEventos;
    }

    public Utilizador instanciarUtilizador(String dados) {
        String[] dadosIndiv = dados.split(";");
        String nome = dadosIndiv[0].trim();
        String username = dadosIndiv[1].trim();
        String email = dadosIndiv[2].trim();
        String password = dadosIndiv[3].trim();
        Utilizador utilizador = new Utilizador(nome, username, email, password);
        return utilizador;
    }

    public GestorDeEventos instanciarGestorDeEventos(String dados, ArrayList<Utilizador> utilizadores) {
        GestorDeEventos gestor = null;
        for (int i = 0; i < utilizadores.size(); i++) {
            Utilizador utilizador = utilizadores.get(i);
            if (utilizador.getUsername().equals(dados)) {
                gestor = new GestorDeEventos(utilizador);
            }
        }
        return gestor;
    }

    public Exposicao instanciarExposicao(ArrayList<Utilizador> utilizadores, Scanner ficheiro, String marcador, String dados) {
        ArrayList<Organizador> organizadores = new ArrayList();
        ArrayList<FAE> FAEs = new ArrayList();
        ArrayList<Candidatura> candidaturas = new ArrayList();
        String titulo, descricao, local, dataInicio, dataFim, dataLimiteCandidaturas;
        String[] dadosIndiv = dados.split(";");
        titulo = dadosIndiv[0];
        descricao = dadosIndiv[1];
        local = dadosIndiv[2];
        dataInicio = dadosIndiv[3];
        dataFim = dadosIndiv[4];
        dataLimiteCandidaturas = dadosIndiv[5];
        Exposicao exp = new Exposicao(titulo, descricao, local, dataInicio, dataFim, dataLimiteCandidaturas);
        while (!marcador.equals("--Evento--")) {
                dados = ficheiro.nextLine();
                marcador = verificarMarcador(dados, marcador);
                if (marcador.equals("--FAE--") && dados.compareTo(marcador) != 0) {
                    FAE FAE = instanciarFAE(dados, utilizadores);
                    if (FAE != null) {
                        FAEs.add(FAE);
                    }
                }
                if (marcador.equals("--Organizador--") && dados.compareTo(marcador) != 0) {
                    Organizador organizador = instanciarOrganizador(dados, utilizadores);
                    if (organizador != null) {
                        organizadores.add(organizador);
                    }
                }
                if (marcador.equals("--Candidatura--") && dados.compareTo(marcador) != 0) {
                    Candidatura candidatura = instanciarCandidatura(dados, utilizadores);
                    if (candidatura != null) {
                        candidaturas.add(candidatura);
                    }
                }
            }
        
        exp.addFAEs(FAEs);
        exp.addOrganizadores(organizadores);
        for (int i = 0; i < candidaturas.size(); i++) {
            Candidatura candidatura = candidaturas.get(i);
            exp.registaCandidatura(candidatura);
        }
        return exp;
    }

    public Congresso instanciarCongresso(ArrayList<Utilizador> utilizadores, Scanner ficheiro, String marcador, String dados) {
        ArrayList<Organizador> organizadores = new ArrayList();
        ArrayList<FAE> FAEs = new ArrayList();
        ArrayList<Candidatura> candidaturas = new ArrayList();
        String titulo, descricao, local, dataInicio, dataFim, dataLimiteCandidaturas;
        String[] dadosIndiv = dados.split(";");
        titulo = dadosIndiv[0];
        descricao = dadosIndiv[1];
        local = dadosIndiv[2];
        dataInicio = dadosIndiv[3];
        dataFim = dadosIndiv[4];
        dataLimiteCandidaturas = dadosIndiv[5];
        Congresso cong = new Congresso(titulo, descricao, local, dataInicio, dataFim, dataLimiteCandidaturas);
        while (!marcador.equals("--Evento--")) {
            dados = ficheiro.nextLine();
            marcador = verificarMarcador(dados, marcador);
        
            if (marcador.equals("--FAE--") && dados.compareTo(marcador) != 0) {
                FAE FAE = instanciarFAE(dados, utilizadores);
                if (FAE != null) {
                    FAEs.add(FAE);
                }
            }
            if (marcador.equals("--Organizador--") && dados.compareTo(marcador) != 0) {
                Organizador organizador = instanciarOrganizador(dados, utilizadores);
                if (organizador != null) {
                    organizadores.add(organizador);
                }
            }
            if (marcador.equals("--Candidatura--") && dados.compareTo(marcador) != 0) {
                Candidatura candidatura = instanciarCandidatura(dados, utilizadores);
                if (candidatura != null) {
                    candidaturas.add(candidatura);
                }
            }
        }
        cong.addFAEs(FAEs);
        cong.addOrganizadores(organizadores);
        for (int i = 0; i < candidaturas.size(); i++) {
            Candidatura candidatura = candidaturas.get(i);
            cong.registaCandidatura(candidatura);
        }
        return cong;
    }

    public FAE instanciarFAE(String dados, ArrayList<Utilizador> utilizadores) {
        FAE FAE = null;
        String[] dadosIndiv = dados.split(";");
        String username = dadosIndiv[0];
        int qualidade = Integer.parseInt(dadosIndiv[1]);
        for (int i = 0; i < utilizadores.size(); i++) {
            Utilizador utilizador = utilizadores.get(i);
            if (utilizador.getUsername().equals(username)) {
                FAE = new FAE(utilizador, qualidade);
            }
        }
        return FAE;
    }

    public Organizador instanciarOrganizador(String dados, ArrayList<Utilizador> utilizadores) {
        Organizador organizador = null;
        for (int i = 0; i < utilizadores.size(); i++) {
            Utilizador utilizador = utilizadores.get(i);
            if (utilizador.getUsername().equals(dados)) {
                organizador = new Organizador(utilizador);
            }
        }
        return organizador;
    }

    public Candidatura instanciarCandidatura(String dados, ArrayList<Utilizador> utilizadores) {
        Candidatura candidatura = null;
        String[] dadosIndiv = dados.split(";");
        String username = dadosIndiv[0];
        String descricao = dadosIndiv[1];
        for (int i = 0; i < utilizadores.size(); i++) {
            Utilizador utilizador = utilizadores.get(i);
            if (utilizador.getUsername().equals(username)) {
                candidatura = new Candidatura(utilizador);
                candidatura.setDadosCandidatura(descricao);
            }
        }
        return candidatura;
    }

    public String verificarMarcador(String dados, String marcador) {
        if (dados.equals("--Utilizadores--")) {
            marcador = "--Utilizadores--";
        }
        if (dados.equals("--GestorDeEventos--")) {
            marcador = "--GestorDeEventos--";
        }
        if (dados.equals("--Exposicao--")) {
            marcador = "--Exposicao--";
        }
        if (dados.equals("--Congresso--")) {
            marcador = "--Congresso--";
        }
        if (dados.equals("--Evento--")) {
            marcador = "--Evento--";
        }
        if (dados.equals("--Candidatura--")) {
            marcador = "--Candidatura--";
        }
        if (dados.equals("--Organizador--")) {
            marcador = "--Organizador--";
        }
        if (dados.equals("--FAE--")) {
            marcador = "--FAE--";
        }
        return marcador;
    }

    /**
     * Método que permite guardar uma instância de CentroEventos num ficheiro.
     *
     * @param ce Instância de CentroEventos a ser guardada num ficheiro
     * @return Boolean indicando o sucesso da operação
     */
    public boolean guardar(CentroDeEventos ce) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(NOME_FICHEIRO_OUT));
            try {
                out.writeObject(ce);
            } finally {
                out.close();
            }
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
}
