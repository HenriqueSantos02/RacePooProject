package principal;
import java.util.List;
import telas.View;
import gestao.Cachorro;
import gestao.Corrida;
import java.util.ArrayList;
import java.util.Scanner;
import repositorio.RepositorioCachorros;
import repositorio.RepositorioCachorrosLista;

public class TesteRace {

    public static void main(String[] args) {
        RepositorioCachorros repositorioCachorros = new RepositorioCachorrosLista();
        Cachorro dog = new Cachorro();
        Corrida race = new Corrida();
        View tela = new View();
        Scanner scan = new Scanner(System.in);
        int x;
        String resposta;
        do{
            tela.menu();
            x = scan.nextInt();
            switch(x){
                case 1:dog.cadastrar(repositorioCachorros);break;
                case 2:dog.deletar(repositorioCachorros);break;
                case 3:dog.atualizar();break;
                case 4:dog.exibir(repositorioCachorros);break;
                case 5:race.marcarCorrida();break;
                case 6:System.exit(0);break;
                default:System.out.println("Opção inválida, insira uma opção válida");
            }
            System.out.print("\nDeseja realizar outra operação?: ");
            resposta = scan.next();
        }while(resposta.equalsIgnoreCase("SIM"));  
    }   
}
