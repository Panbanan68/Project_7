package com.company;

public class Main {

    public static void main(String[] args) {
        Shape[] arr = new Shape[] {new Circle(), new Square(), new Triangle()};
        for (int i = 0; i < arr.length; i++ )
            arr[i].draw();
        // Полиморфизм.Классы наследники. Код вызывает метод draw, он срабатывает и переопределяется для каждого класса

    }
}
