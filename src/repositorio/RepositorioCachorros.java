package repositorio;

import gestao.Cachorro;

public interface RepositorioCachorros {
    void inserir(Cachorro cachorro);
    Cachorro procurar(int ID);
    void remover(int ID);
}
