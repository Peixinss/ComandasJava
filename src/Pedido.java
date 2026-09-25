public class Pedido {
    private int idPedido;
    private Comanda[] comandas;

    public Pedido(int idPedido){
        this.idPedido = idPedido;
        this.comandas = new Comanda[0];
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido){
        this.idPedido = idPedido;
    }

    public Comanda[] getComandas(){
        return comandas;
    }

    public void adicionarComanda(Comanda comandas){
        Comanda[] novoArray = new Comanda[this.comandas.length + 1];

        for(int i = 0; i < this.comandas.length; i++){
            novoArray[i] = this.comandas[i];
        }
        novoArray[this.comandas.length] = comandas;

        this.comandas = novoArray;
    }
    public double calcularTotalPedido(){
        double totalPedido= 0;

        for(int i = 0; i < comandas.length; i++){
            totalPedido = comandas[i].calcularTotal();
        }
        return totalPedido;
    }
}