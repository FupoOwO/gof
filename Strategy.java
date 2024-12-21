// Интерфейс стратегии
interface Strategy {
    void execute();
}

// Конкретная стратегия A
class ConcreteStrategyA implements Strategy {
    public void execute() {
        System.out.println("Executing strategy A");
    }
}

// Конкретная стратегия B
class ConcreteStrategyB implements Strategy {
    public void execute() {
        System.out.println("Executing strategy B");
    }
}

// Контекст, использующий стратегии
class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}

// Использование
public class StrategyExample {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyA());
        context.executeStrategy();

        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();
    }
}

/*Strategy определяет семейство алгоритмов, инкапсулирует каждый из них и делает их взаимозаменяемыми. 
Strategy позволяет изменять алгоритмы независимо от клиентов, которые их используют.*/