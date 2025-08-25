# Padrão Decorator - A Matrioska dos Padrões de Projeto

O **Decorator** é um padrão de projeto estrutural que possibilita adicionar responsabilidades extras a um objeto de forma dinâmica, **sem modificar sua estrutura original**.  
Ele funciona como uma **boneca russa (matrioska)**, onde um objeto pode ser encapsulado por outro, sucessivamente, ganhando novas funcionalidades.

---

## Conceitos Principais

- **Componente (Interface/Classe Base):** define a interface que será implementada pelos objetos concretos e decoradores. 
- **Classe Concreta:** implementação padrão do componente.  
- **Decorator Abstrato:** mantém uma referência a um componente e implementa a mesma interface.  
- **Decorator Concreto:** adiciona novas funcionalidades ao componente, sem alterar o código original.

---

## Analogias

- **Boneca Russa:** cada nova boneca adicionada representa um **decorator** que encapsula a anterior.  
- **Pizza do Seu João:** cada novo ingrediente extra é um **decorator** que se soma ao pedido original.

---

## Implementação: Pizza

### Interface
```java
public interface Pizza {
    String getDescricao();
    double getCusto();
}
```
### Classe Concreta

```java
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
```
### Decorator Abstrata
```java
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
```
### Decorators Concretos
```java
public class QueijoExtra extends PizzaDecorator {
    public QueijoExtra(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com queijo extra";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 5.0;
    }
}

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

```
### Uso

```java
public class Main {
    public static void main(String[] args) {
        Pizza minhaPizza = new PizzaSimples();
        System.out.println(minhaPizza.getDescricao() + " | Custo: R$" + minhaPizza.getCusto());

        minhaPizza = new QueijoExtra(minhaPizza);
        System.out.println(minhaPizza.getDescricao() + " | Custo: R$" + minhaPizza.getCusto());

        minhaPizza = new BordaRecheada(minhaPizza);
        System.out.println(minhaPizza.getDescricao() + " | Custo: R$" + minhaPizza.getCusto());

        Pizza outraPizza = new BordaRecheada(new PizzaSimples());
        System.out.println(outraPizza.getDescricao() + " | Custo: R$" + outraPizza.getCusto());
    }
}

```
### Saída
```java
Pizza de massa fina | Custo: R$30.0
Pizza de massa fina, com queijo extra | Custo: R$35.0
Pizza de massa fina, com queijo extra, com borda recheada | Custo: R$43.0
Pizza de massa fina, com borda recheada | Custo: R$38.0
```
