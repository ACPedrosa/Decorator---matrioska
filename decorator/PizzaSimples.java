// Concrete Component
public class PizzaSimples implements Pizza {
    @Override
    public String getDescricao() {
        return "Pizza de massa fina";
    }

    @Override
    public double getCusto() {
        return 30.0;
    }
}