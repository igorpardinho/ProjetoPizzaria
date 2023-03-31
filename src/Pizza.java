


public class Pizza {

   protected static int quantidadeIngredientes;
    public int preco;


    public String adicionarIngrediente(String ingrediente) {
        contabilizarIngrediente();

        return ingrediente;
    }

    public double getPreco() {

        if (quantidadeIngredientes <= 2) {
            return preco = 15;
        } else if (quantidadeIngredientes > 2 && quantidadeIngredientes <= 5) {
            return preco = 20;
        } else {
            return preco = 23;
        }
    }

    public static void contabilizarIngrediente() {

        quantidadeIngredientes++;

    }
}
