package telas;

import java.util.Scanner;

public class View {
    //Menuzinho brabo
    Scanner scan = new Scanner(System.in);
    public void menu(){
            System.out.println("*===========================*");
            System.out.println("*=== Corrida de cachorro ===*");
            System.out.println("*=== O que deseja fazer? ===*");
            System.out.println("*===========================*");
            System.out.println("*     1 Cadastrar dados     *");
            System.out.println("*     2 Excluir cadastro    *");
            System.out.println("*     3 Alterar cadastro    *");
            System.out.println("*     4 Exibir cadastro     *");
            System.out.println("*     5 Marcar corrida      *");
            System.out.println("*     6 Sair                *");
            System.out.println("*===========================*");
    }
}
