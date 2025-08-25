// Concrete Decorator A
public class QueijoExtra extends PizzaDecorator {
    public QueijoExtra(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        // Pega a descrição da pizza decorada e adiciona a sua
        return super.getDescricao() + ", com queijo extra";
    }

    @Override
    public double getCusto() {
        // Pega o custo da pizza decorada e soma o seu
        return super.getCusto() + 5.0;
    }
}