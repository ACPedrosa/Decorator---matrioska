public class Main {
    public static void main(String[] args) {
        // 1. Criamos uma pizza simples
        Pizza minhaPizza = new PizzaSimples();
        System.out.println(minhaPizza.getDescricao() + " | Custo: R$" + minhaPizza.getCusto());
        // Saída: Pizza de massa fina | Custo: R$30.0

        // 2. Agora, vamos decorar essa pizza com queijo extra
        minhaPizza = new QueijoExtra(minhaPizza);
        System.out.println(minhaPizza.getDescricao() + " | Custo: R$" + minhaPizza.getCusto());
        // Saída: Pizza de massa fina, com queijo extra | Custo: R$35.0

        // 3. E agora, vamos adicionar borda recheada NA MESMA pizza
        minhaPizza = new BordaRecheada(minhaPizza);
        System.out.println(minhaPizza.getDescricao() + " | Custo: R$" + minhaPizza.getCusto());
        // Saída: Pizza de massa fina, com queijo extra, com borda recheada | Custo: R$43.0

        // 4. Podemos criar outra combinação facilmente
        Pizza outraPizza = new BordaRecheada(new PizzaSimples());
        System.out.println(outraPizza.getDescricao() + " | Custo: R$" + outraPizza.getCusto());
        // Saída: Pizza de massa fina, com borda recheada | Custo: R$38.0
    }
}