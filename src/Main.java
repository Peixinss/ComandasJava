//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    ItemConsumacao batata = new ItemConsumacao("batata", 12.50, 1);
    ItemConsumacao cocaCola = new ItemConsumacao("Coca Cola", 17.50, 1);


    Comanda comanda01 = new Comanda(1);

    Pedido pedido01 = new Pedido(1);

    comanda01.adicionarItem(batata);
    comanda01.adicionarItem(cocaCola);
    pedido01.adicionarComanda(comanda01);

    System.out.println("Itens Comanda: " + comanda01.getItens().length);
    System.out.println("Comandas no pedido: "+ pedido01.getComandas().length);
    System.out.println("Toal na comanda: " + comanda01.calcularTotal());

    System.out.println("Total:" + pedido01.calcularTotalPedido());
    pedido01.calcularTotalPedido();

    System.out.println(batata.getNome() + "R$" + batata.getSubtotal());



    }
}