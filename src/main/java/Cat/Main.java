package Cat;

public class Main {
    public static void main(String[] args) {
       // Cat cat = new Cat();
        Cat cat = new Cat("Кабачок", 8, 5); //  можно указать данные
        System.out.println("Имя кота: " + cat.getName());
        System.out.println("Возраст кота: " + cat.getAge());
        System.out.println("Вес кота: " + cat.getWeight());

    }
}
