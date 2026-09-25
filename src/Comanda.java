    public class Comanda {

    private int id;
    private int numeroComanda;
    private ItemConsumacao[] itens;

    public Comanda(int id){
        this.id = id;
        this.numeroComanda = numeroComanda;
        this.itens = new ItemConsumacao[0];
    }

    public int getId(){
        return id;
    }

    public int getNumeroComanda(){
        return numeroComanda;
    }

    public ItemConsumacao[] getItens() {
        return itens;
    }

    public void adicionarItem(ItemConsumacao itens){
        ItemConsumacao[] novoArray = new ItemConsumacao[this.itens.length + 1];

        System.out.println(novoArray);

        for (int i = 0; i < this.itens.length; i++) {
            novoArray[i] = this.itens[i];
        }

        novoArray[novoArray.length - 1] = itens;
        this.itens = novoArray;

    }

    public double calcularTotal(){
        double total = 0;

        for(int i = 0; i < itens.length; i++){
            total += itens[i].getSubtotal();
        }
        return total;
    }

}
