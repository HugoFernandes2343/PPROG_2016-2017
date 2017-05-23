
import Dominio.CentroDeEventos;
import java.io.*;

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
   
    public static final String NOME_FICHEIRO_IN= "CentroDeEventosIn.bin";
    public static final String NOME_FICHEIRO_OUT= "CentroDeEventosOut.bin";

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
    public CentroDeEventos ler() {
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
