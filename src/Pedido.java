public class Pedido {
    private int idPedido;
    private Comanda[] comanda;

    public Pedido(int idPedido){
        this.idPedido = idPedido;
        this.comanda = comanda;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(){
        this.idPedido = idPedido;
    }

    public Comanda[] getComanda(){
        return comanda;
    }

    public void adicionarComanda(Comanda comanda){
        Comanda[] novoArray = new Comanda[this.comanda.length + 1];

        for(int i = 0; i < this.comanda.length; i++){
            novoArray[i] = this.comanda[i];
        }
    }
    public calcularTotalPedido(){
        double total = 0;

        for(int i = 0; i < comanda.length; i++){
            total = comanda[i].getSubtotal();
        }
        return total;
    }
}