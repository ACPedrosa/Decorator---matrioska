// Concrete Decorator B
public class BordaRecheada extends PizzaDecorator {
    public BordaRecheada(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com borda recheada";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 8.0;
    }
}