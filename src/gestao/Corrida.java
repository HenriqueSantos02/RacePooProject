package gestao;
import repositorio.RepositorioCachorros;
import gestao.Cachorro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Corrida {
    int r1,r2;
    Scanner scan = new Scanner(System.in);
    List listaDogs = new ArrayList();

    public void marcarCorrida(){
        //listaDogs.size();
        System.out.println("Selecione o ID do cachorro desafiante");
        r1 = scan.nextInt();
        //RepositorioCachorros.procurar();
        System.out.println("Selecione o ID do cachorro desafiado");
        r2 = scan.nextInt();
    }
}
