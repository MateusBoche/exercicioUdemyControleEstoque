package Entidades;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double totalValorEstoque(){
        double valor = preco * quantidade;
        return valor;
    }

    public void addProdutos(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeProdutos(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome + ", $ " + String.format("%.2f",preco) + ", " + quantidade +  " unidade, total: $ " +String.format("%.2f",totalValorEstoque()) ;
    }
}
