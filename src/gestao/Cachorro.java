package gestao;

import repositorio.RepositorioCachorros;
import repositorio.RepositorioCachorrosLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cachorro {
    Cachorro cp;
    List listaDogs = new ArrayList();
    //Atributos
    private String nome;
    private String raca;
    private String porte;
    private float altura;
    private float peso;
    protected float recorde;
    private int ID;
    private int idade;
    protected int qMedalhas;
    private int vitorias;
    private int derrotas;
    private boolean filhote;
    

    Scanner scan = new Scanner(System.in);
    //Método Construtor
    
    public Cachorro(String nome, String raca, float altura, float peso, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
    }
    
    public Cachorro(){
    
    }
    
    //Métodos gerais
 
    public void ganharCorrida(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderCorrida(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    //Métodos especiais(y) 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
        this.setPorte();
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getRecorde() {
        return recorde;
    }

    public void setRecorde(float recorde) {
        this.recorde = recorde;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte() {
        this.porte = porte;
        if(this.altura<25f){
            this.porte = "Inválido";
        }else if(this.altura <=41f){
            this.porte = "Pequeno";
        }else if(this.altura <=56f){
            this.porte = "Médio";
        }else if(this.altura <= 76f){
            this.porte = "Grande";
        }else{
            this.porte = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
        
    }

    public void setIdade(int idade) {
        this.idade = idade;
        this.setFilhote();
    }

    public int getqMedalhas() {
        return qMedalhas;
    }

    public void setqMedalhas(int qMedalhas) {
        this.qMedalhas = qMedalhas;
    }
    
    public int getVitorias(){
        return vitorias;
    }
    
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
    
    public int getDerrotas(){
        return derrotas;
    }
    
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isFilhote() {
        return filhote;
    }

    public void setFilhote() {
        this.filhote = filhote;
        if(idade<12){
            this.filhote = true;
        }else{
            this.filhote = false;
        }
    }
       
    //Métodos (CRUD)
    public void cadastrar(RepositorioCachorros listaCachorros){
        cp = new Cachorro();
        System.out.println("Cadastrar novo cachorro:");
        System.out.print("Insira o nome do Cachorro: ");
        nome = scan.next();
        cp.setNome(nome);
        System.out.print("Insira a raça do Cachorro: ");
        raca = scan.next();
        cp.setRaca(raca);
        System.out.print("Insira a altura do Cachorro (em Cm): ");
        altura = scan.nextFloat();
        cp.setAltura(altura);
        System.out.print("Insira o peso do Cachorro (em Kg): ");
        peso = scan.nextFloat();
        cp.setPeso(peso);
        System.out.print("Insira a idade do Cachorro: ");
        idade = scan.nextInt();
        cp.setIdade(idade);  
        listaCachorros.inserir(cp);
        ID++;
        cp.setID(ID);
        System.out.println("Cachorro cadastrado com sucesso\nID:"+ ID);
    }
    public void exibir(RepositorioCachorros listaCachorros){
        int temp=0;
        for(int i = 0;i<listaDogs.size();i++){
        System.out.println("Cachorros Cadastrados: "
            + listaDogs.get(temp));
        temp++;
        }
        
    }
    public void atualizar(){
        int r;
        System.out.println( "Insira o id do cachorro que deseja atualizar");
        r = scan.nextInt();
        System.out.print("Insira o nome do Cachorro: ");
        nome = scan.next();
        cp.setNome(nome);
        System.out.print("Insira a raça do Cachorro: ");
        raca = scan.next();
        cp.setRaca(raca);
        System.out.print("Insira a altura do Cachorro (em Cm): ");
        altura = scan.nextFloat();
        cp.setAltura(altura);
        System.out.print("Insira o peso do Cachorro (em Kg): ");
        peso = scan.nextFloat();
        cp.setPeso(peso);
        System.out.print("Insira a idade do Cachorro: ");
        idade = scan.nextInt();
        cp.setIdade(idade);    
    }
    public void deletar(RepositorioCachorros listaCachorros){
        int r;
        System.out.println( "Insira o id do cachorro que deseja deletar");
        ID = scan.nextInt();
        listaCachorros.remover(ID);
        
    }
    
}
