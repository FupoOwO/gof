// Product: Определяет интерфейс объектов, которые будут создаваться.
interface Product {
    void use();
}

// ProductA и ProductB: Реализуют интерфейс продукта и предоставляют конкретные реализации.
class ProductA implements Product {
    public void use() {
        System.out.println("Используем конкретный продукт A");
    }
}

class ProductB implements Product {
    public void use() {
        System.out.println("Используем конкретный продукт B");
    }
}

//Creator: Объявляет фабричный метод factoryMethod, который должен быть переопределен в подклассах. 
//Метод someOperation использует продукт, созданный factoryMethod
abstract class Creator {
    public abstract Product factoryMethod();

    public void someOperation() {
        Product product = factoryMethod();
        product.use();
    }
}


//ConcreteCreatorA и ConcreteCreatorB: Переопределяют фабричный метод для создания 
//конкретных продуктов (ProductA и ProductB соответственно).
class ConcreteCreatorA extends Creator {
    public Product factoryMethod() {
        return new ProductA();
    }
}

class ConcreteCreatorB extends Creator {
    public Product factoryMethod() {
        return new ProductB();
    }
}

public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation(); // Используем конкретный продукт A

        Creator creatorB = new ConcreteCreatorB();
        creatorB.someOperation(); // Используем конкретный продукт B   
    }
}
/*Паттерн Factory Method используется, когда:

Класс не знает, какие подклассы ему нужно создать.

Класс делегирует создание объектов подклассам.

Требуется предоставить пользователям возможность расширять функциональность приложения, 
создавая новые подклассы продуктов.
Этот паттерн помогает следовать принципу инверсии зависимостей и упрощает добавление новых классов 
продуктов без изменения существующего кода создателя.