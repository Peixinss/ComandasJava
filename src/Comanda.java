public class Comanda {

    private int id;
    private int numeroComanda;
    private ItemConsumacao[] itens;

    public Comanda(int id, int numeroComando){
        this.id = id;
        this.numeroComanda = numeroComando;
        this.itens = itens;
    }

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public int getNumeroComanda(){
        return numeroComanda;
    }

    public void setNumeroComanda(){
        this.numeroComanda = numeroComanda;
    }

    public void adicionarItem(ItemConsumacao item){
        ItemConsumacao[] novoArray = new ItemConsumacao[this.itens.length + 1];

        for(int i = 0; i < this.itens.length; i++){
            novoArray[i] = this.itens[i];
        }

        novoArray[novoArray.length - 1] = item;
        this.itens = novoArray;
    }
    public double calcularTotal(){
        double total = 0;

        for(int i = 0; i < itens.length; i++){
            total = itens[i].getSubtotal();
        }
        return total;
    }

}
