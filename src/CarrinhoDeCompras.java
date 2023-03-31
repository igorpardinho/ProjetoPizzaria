import java.util.ArrayList;

import java.util.List;

public class CarrinhoDeCompras {

    public int total = 0;
    private List<Integer> valorPizzas = new ArrayList<>();


    public int calculoValorTotal(Pizza pizza) {

        valorPizzas.add((int) pizza.getPreco());

        int soma = 0;
        for (int i = 0; i < valorPizzas.size(); i++) {
            soma += valorPizzas.get(i);
        }
        total = soma;
        return total;

    }


}
