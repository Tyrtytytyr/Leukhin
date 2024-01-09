package _9;



public class Main {
    public static void main(String[] args) {
        // Тестирование интерфейса Nameable
        Planet earth = new Planet("Земля");
        Car bmw = new Car("BMW");

        System.out.println("Имя планеты: " + earth.getName());
        System.out.println("Имя машины: " + bmw.getName());

        // Тестирование интерфейса Priceable
        Animal dog = new Animal("Собака", 500);
        Product laptop = new Product("Ноутбук", 1000);

        System.out.println("Цена собаки: " + dog.getPrice());
        System.out.println("Цена ноутбука: " + laptop.getPrice());
    }
}
