public class ItemConsumacao {
    private String nome;
    private double preco;
    private int quantidade;

    public ItemConsumacao(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public String getNome(){
        return nome;
     }

     public void setNome(){
        this.nome = nome;
     }

    public double getSubtotal(){
        return preco + quantidade;
    }

    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(){
        this.quantidade = quantidade;
    }
}
