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
### Classe Abstrata
```java

```
