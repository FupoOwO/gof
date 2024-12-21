public class Singleton {
    // Приватный статический экземпляр класса
    private static Singleton instance;

    // Приватный конструктор, чтобы предотвратить создание экземпляров извне
    private Singleton() {}

    // Публичный статический метод для получения единственного экземпляра
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}


