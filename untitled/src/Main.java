


//1. Базовое задание: Абстрактный класс
//Создайте абстрактный класс Shape с методом calculateArea().
// Реализуйте два наследника: Circle и Rectangle.
// В классе Circle метод должен вычислять площадь круга,
// а в Rectangle — площадь прямоугольника.
//
//        2. Интерфейс для животных
//Создайте интерфейс Animal с методами:
//
//makeSound()
//move()
//Создайте классы Dog и Bird, которые реализуют этот интерфейс. Реализуйте методы так, чтобы собака лаяла, а птица пела.
//
//3. Абстрактный класс + интерфейс
//Создайте абстрактный класс Vehicle с методом startEngine(). Добавьте интерфейс Flyable с методом fly(). Реализуйте два класса:
//
//Car (наследует Vehicle)
//Plane (наследует Vehicle и реализует Flyable).
//        4. Список сотрудников
//Создайте абстрактный класс Employee с методами getSalary() и getRole(). Реализуйте два класса:
//
//Manager
//        Developer
//Каждый класс должен возвращать свою зарплату и роль.
//
//        5. Управление устройствами
//Создайте интерфейс Switchable с методами turnOn() и turnOff(). Реализуйте классы:
//
//LightBulb
//        Fan
//Каждый класс должен менять свое состояние (включено/выключено).
//
//        6. Геометрические фигуры
//Создайте интерфейс Drawable с методом draw(). Реализуйте классы:
//
//Circle
//        Square
//Метод draw() должен выводить текстовое описание фигуры (например, "Рисуем круг").
//
//        7. Работа с базой данных
//Создайте интерфейс Database с методами:
//
//connect()
//disconnect()
//Реализуйте классы:
//
//MySQLDatabase
//        PostgreSQLDatabase
//Каждый класс должен выводить сообщения о подключении и отключении.
//
//8. Спортивные соревнования
//Создайте интерфейс Athlete с методами:
//
//run()
//jump()
//Реализуйте классы:
//
//Runner
//        Jumper
//Каждый класс должен реализовать соответствующие методы.
//
//        9. Магазин
//Создайте абстрактный класс Product с методами:
//
//getPrice()
//getName()
//Создайте классы Electronics и Clothing, которые наследуют Product и реализуют методы.
//
//        10. Зоопарк
//Создайте абстрактный класс Animal с методами:
//
//eat()
//sleep()
//Добавьте интерфейс SoundMaker с методом makeSound(). Реализуйте классы:
//
//Lion
//        Elephant
//Каждое животное должно реализовать свои звуки, приемы пищи и сон.//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or


//1. Базовое задание: Абстрактный класс
//Создайте абстрактный класс Shape с методом calculateArea().
// Реализуйте два наследника: Circle и Rectangle.
// В классе Circle метод должен вычислять площадь круга,
// а в Rectangle — площадь прямоугольника.


abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;


    }
}

//        2. Интерфейс для животных
//Создайте интерфейс Animal с методами:
//
//makeSound()
//move()
//Создайте классы Dog и Bird, которые реализуют этот интерфейс.
// Реализуйте методы так, чтобы собака лаяла, а птица пела.
interface Animal {
    void makeSound();

    void move();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("собака лает");
    }

    @Override
    public void move() {
        System.out.println("собака передвигается на 4 лапах");
    }
}

class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Птица чирикает");
    }

    @Override
    public void move() {
        System.out.println("птица летает");
    }


}

//3. Абстрактный класс + интерфейс
//Создайте абстрактный класс Vehicle с методом startEngine().
// Добавьте интерфейс Flyable с методом fly(). Реализуйте два класса:
//Car (наследует Vehicle)
//Plane (наследует Vehicle и реализует Flyable).
abstract class Vehicle {
    public abstract void startEngine();
}

interface Flyable {
    void fly();
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Двигатель авто запущен");
    }
}

class Plane extends Vehicle implements Flyable {

    @Override
    public void startEngine() {
        System.out.println("Двигатель самолета запущен");
    }

    @Override
    public void fly() {
        System.out.println("Самолет летит ");
    }
}

//     4. Список сотрудников
//Создайте абстрактный класс Employee с методами getSalary() и getRole().
// Реализуйте два класса:
//
//Manager
//        Developer
//Каждый класс должен возвращать свою зарплату и роль.
abstract class Employee {
    public abstract int getSalary();

    public abstract String getRole();
}

class Manager extends Employee {
    private int salary;

    public Manager(int salary) {
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String getRole() {
        return "Manager";
    }
}

class Developer extends Employee {
    private int salary;

    public Developer(int salary) {
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String getRole() {
        return "Developer";
    }
}

//        5. Управление устройствами
//Создайте интерфейс Switchable с методами turnOn() и turnOff(). Реализуйте классы:
//LightBulb
//        Fan
//Каждый класс должен менять свое состояние (включено/выключено).
interface Switchable {
    void turnOn();

    void turnOff();
}

class LightBulb implements Switchable {
    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("LightBulb включена");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("LightBulb выключена");

    }
}

class Fan implements Switchable {
    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Fan включен");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Fan выключен");
    }
}

//        6. Геометрические фигуры
//Создайте интерфейс Drawable с методом draw(). Реализуйте классы:
//
//Circle
//        Square
//Метод draw() должен выводить текстовое описание фигуры (например, "Рисуем круг").
interface Drawable {
    void draw();
}

class Circle2 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Рисуем квадрат");
    }
}

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        System.out.println("площадь круга =" + circle.calculateArea());
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("площадь прямоугольника =" + rectangle.calculateArea());
        Animal dog = new Dog();
        dog.makeSound();
        dog.move();
        Animal bird = new Bird();
        bird.makeSound();
        bird.move();
        Vehicle car = new Car();
        car.startEngine();
        Plane plane = new Plane();
        plane.startEngine();
        plane.fly();
        Employee manager = new Manager(1000);
        Employee developer = new Developer(10000);
        System.out.println(manager.getRole() + " получает зп " + manager.getSalary());
        System.out.println(developer.getRole() + " получает зп " + developer.getSalary());
        Switchable lightBulb = new LightBulb();
        Switchable Fan = new Fan();
        lightBulb.turnOn();
        lightBulb.turnOff();
        Fan.turnOn();
        Fan.turnOff();
        Drawable circle2 = new Circle2();
        Drawable square = new Square();
        circle2.draw();
        square.draw();

    }
}