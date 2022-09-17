package ru.mirea.korenev.practic2;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//про окружности

        Autor first = new Autor("Dmitry", "dima4545.com", 'm' );
        String a = first.toString();
        System.out.println(a);


        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        Circle [] mass = new Circle[n];
        for(int i = 0; i<n ; i++) {
            System.out.println("Центр по х " + (i + 1) + "-ой окружности: ");
            double tempx = sc.nextDouble();
            System.out.println("Центр по y " + (i + 1) + "-ой окружности: ");
            double tempy = sc.nextDouble();
            Point b = new Point(tempx, tempy);
            System.out.println("Радиус " + (i + 1) + " окружности: ");
            double r = sc.nextDouble();
            double s = 3.14 * r * r;
            Circle temp_mass = new Circle(b, r, s);
            mass[i] = temp_mass;
        }



        System.out.println("Введите количество книг на полке: ");//про книги
        int size = sc.nextInt();
        System.out.println("Заполните данные по каждой книге");
        Book [] arr = new Book [size];
        for(int i = 0; i < size; i++){
            System.out.println("Автор книги - ");
            String autor = sc.next();
            System.out.println("Название книги - ");
            String name = sc.next();
            System.out.println("Год написания книги - ");
            int year = sc.nextInt();
            Book tempbook = new Book(autor,name,year);
            arr[i] = tempbook;
        }
        LowerShelf shelf = new LowerShelf(arr, size);
        System.out.println("Самая новая книга на нижней полке - " + shelf.Max_year().getName());
        System.out.println("Самая старая книга на нижней полке - " + shelf.Min_year().getName());
    }
}