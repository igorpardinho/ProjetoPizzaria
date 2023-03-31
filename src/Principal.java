public class Principal {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        pizza1.adicionarIngrediente("peperonni");
        pizza1.adicionarIngrediente("mussarela");
        pizza1.adicionarIngrediente("cream cheese");

        Pizza pizza2 = new Pizza();
        pizza2.adicionarIngrediente("mussarela");
        pizza2.adicionarIngrediente("calabresa");


        Pizza pizza3 = new Pizza();
        pizza3.adicionarIngrediente("milho");
        pizza3.adicionarIngrediente("lombo");
        pizza3.adicionarIngrediente("parmesão");
        pizza3.adicionarIngrediente("ervilha");
        pizza3.adicionarIngrediente("manjericao");

        System.out.println("Total de ingredientes usados: " + Pizza.quantidadeIngredientes);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.calculoValorTotal(pizza1);
        carrinho.calculoValorTotal(pizza2);
        carrinho.calculoValorTotal(pizza3);
        System.out.println("Valor total das pizzas: " + carrinho.total);


    }
}