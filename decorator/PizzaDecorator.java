// Abstract Decorator
public abstract class PizzaDecorator implements Pizza {
    // A referência para o objeto que estamos decorando
    protected Pizza pizzaDecorada;

    public PizzaDecorator(Pizza pizza) {
        this.pizzaDecorada = pizza;
    }

    // O decorator delega a chamada para o objeto que ele contém
    @Override
    public String getDescricao() {
        return pizzaDecorada.getDescricao();
    }

    @Override
    public double getCusto() {
        return pizzaDecorada.getCusto();
    }
}