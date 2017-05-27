
import Dominio.*;
import UIs.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hugo Fernands; Hugo Carvalho
 */
public class TESTE {

    private static final Scanner in = new Scanner(System.in);

    /**
     * metodo main do programa
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        int op;
        FicheiroCentroEventos ficheiroCentroEventos = new FicheiroCentroEventos();
        CentroDeEventos centroEventos = lerFicheiro(ficheiroCentroEventos);
        if (centroEventos == null) { //Caso não seja encontrado o ficheiro ou este ainda não exista
            System.out.println("Objeto CentroEventos nulo");
        } else {
            Utilizador utilizador = login(centroEventos);
            do {
                op = menu();
                switch (op) {
                    case 1:
                        UC3_UI ui3 = new UC3_UI(utilizador, centroEventos);
                        ui3.run();
                        break;
                    case 2:
                        UC4_UI ui4 = new UC4_UI(utilizador, centroEventos);
                        ui4.run();
                        break;
                    case 3:
                        UC5_UI ui5 = new UC5_UI(utilizador, centroEventos);
                        ui5.run();
                        break;
                    case 0:
                        ficheiroCentroEventos.guardar(centroEventos);
                        break;
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }
            } while (op != 0);
        }
    }

    /**
     * menu de escolha da funcionalidade que deve ser realizada
     *
     * @return opcao escolhida
     */
    public static int menu() {
        String texto = "\nMENU: "
                + "\n    UC3 - Atribuir Candidaturas aos FAEs   1"
                + "\n    UC4 - Avaliar Candidaturas             2"
                + "\n    UC5 - Submeter Candidatura             3"
                + "\n    Terminar Sessao                        0"
                + "\n  Qual a sua opcao?";
        System.out.printf("%n%s%n", texto);
        int op = in.nextInt();
        in.nextLine();
        return op;
    }

    private static CentroDeEventos lerFicheiro(FicheiroCentroEventos ficheiroCentroEventos) throws FileNotFoundException {
        int op;
        CentroDeEventos centroEventos = new CentroDeEventos();
        do {
            op = menuLeitor();
            switch (op) {
                case 1:
                    centroEventos = ficheiroCentroEventos.lerFicheiroBin();
                    break;
                case 2:
                    centroEventos = ficheiroCentroEventos.lerFicheiroTxt();
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (op != 1 && op != 2);
        return centroEventos;
    }

    private static int menuLeitor() {
        String texto = "\nMENU: "
                + "\n    Ler de ficheiro binario     1"
                + "\n    Ler de ficheiro de texto    2"
                + "\n  Qual a sua opcao?";
        System.out.printf("%n%s%n", texto);
        int op = in.nextInt();
        in.nextLine();
        return op;
    }

    private static Utilizador login(CentroDeEventos centroEventos) {
        String usernameOuEmail;
        String password;
        Utilizador utilizador = new Utilizador();
        do {
            System.out.println("Introduza o username ou email");
            usernameOuEmail = in.nextLine();
            System.out.println("Introduza a password");
            password = in.nextLine();
            utilizador = centroEventos.procurarUtilizador(usernameOuEmail, password);
            if (utilizador == null) {
                System.out.println("Credenciais invalidas. Tente outra vez.");
            }
        } while (utilizador == null);
        return utilizador;
    }
}
