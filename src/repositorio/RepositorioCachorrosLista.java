package repositorio;

import gestao.Cachorro;

import java.util.ArrayList;
import java.util.List;

public class RepositorioCachorrosLista implements RepositorioCachorros {
    
    private List<Cachorro> cachorros;
    Cachorro cachorro;
    
    public RepositorioCachorrosLista(){
        cachorros = new ArrayList<Cachorro>();
    }

    @Override
    public void inserir(Cachorro cachorro) {
        cachorros.add(cachorro);
    }

    @Override
    public Cachorro procurar(int ID) {
        Cachorro achou = null;
        for (Cachorro cachorro: cachorros){
            if (cachorro.getID() == ID){
                achou = cachorro;
            } 
        }
        return achou;
    }

    @Override
    public void remover(int ID) {
        int pos = -1;

        for (Cachorro cachorro: cachorros){
            if (cachorro.getID() == ID){
                pos = cachorros.indexOf(cachorro);
                break;
            }
        }

        if (pos != -1){
            cachorros.remove(pos);
        }
    }
    public List<Cachorro> listarCachorros(){
    return this.cachorros;
    }
}
