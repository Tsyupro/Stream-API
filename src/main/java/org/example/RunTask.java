package org.example;

import java.util.*;
import java.util.stream.Stream;

public abstract class RunTask {

    public static void runTask1(){
        int [] numbers = new Random().ints(10,-100,100).toArray();
        Arrays.stream(numbers).forEach(System.out::println);
        long posiyiveNumbers = Arrays.stream(numbers).filter(x->x>0).count();
        System.out.println("Кільість позитивних чисел: "+posiyiveNumbers);
        long negativeNumbers = Arrays.stream(numbers).filter(x->x<0).count();
        System.out.println("Кількість негативних значень: "+negativeNumbers);
        long twoNumbers = Arrays.stream(numbers).filter(x->x>=10 && x<=99).count();
        System.out.println("Кількість двохгачних чисел: "+ twoNumbers);
        long palindromeCount = Arrays.stream(numbers).filter(x -> isPalindrome(Integer.toString(x))).count();
        System.out.println("Кількість дзеркальних чисел: " + palindromeCount);
    }
    public static boolean isPalindrome(String str) {
        return str.contentEquals(new StringBuilder(str).reverse());
    }
    public static void runTask2(){
        List<String> products = Arrays.asList("Молоко", "Хліб", "Масло", "Печиво", "Молоко", "Сир", "Яблука");
        System.out.println("Всі продукти: ");
        products.forEach(System.out::println);
        System.out.println("Продукти менше 5 символів");
        products.stream().filter(p -> p.length()<5).forEach(System.out::println);
        System.out.println("Продукти які ввів користувач : ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть продукт :");
        String userInputProduct = scanner.nextLine().trim();
        long count = products.stream().filter(p -> p.equalsIgnoreCase(userInputProduct)).count();
        System.out.println("Продукт введений користувачем як: "+ userInputProduct + "Зустрічається у списку : "+ count + " разів");
        System.out.println("Продукт категорії молоко: ");
        products.stream().filter(p -> p.equalsIgnoreCase("Молоко")).forEach(System.out::println);



    }
    public static void runTask3(){
        List<Device> devices = Arrays.asList(
                new Device("iPhone 12", 2020, 699, "Black", "Smartphone"),
                new Device("Samsung Galaxy S21", 2021, 799, "White", "Smartphone"),
                new Device("MacBook Pro", 2021, 2399, "Silver", "Laptop"),
                new Device("Dell XPS 13", 2020, 999, "White", "Laptop"),
                new Device("Sony Bravia X90J", 2021, 1299, "Black", "Television"),
                new Device("LG C1 OLED", 2021, 1799, "Black", "Television"),
                new Device("Canon EOS R5", 2020, 3899, "Black", "Camera"),
                new Device("Nikon D850", 2017, 2799, "Black", "Camera"),
                new Device("Apple Watch Series 6", 2020, 399, "Red", "Smartwatch"),
                new Device("Samsung Galaxy Watch 3", 2020, 399, "Silver", "Smartwatch")
        );
        System.out.println("Всі пристрої");
        devices.forEach(System.out::println);
        System.out.println("Девайси по кольору White");
        devices.stream().filter(d -> d.getColor().equalsIgnoreCase("White")).forEach(System.out::println);
        System.out.println("Девайси по року 2020");
        devices.stream().filter(d -> d.getYear() == 2020).forEach(System.out::println);
        System.out.println("Пристрої дорожче ніж 400");
        devices.stream().filter(d-> d.getPrice()>400).forEach(System.out::println);
        System.out.println("Пристрої типу Laptop");
        devices.stream().filter(d -> d.getType().equalsIgnoreCase("Laptop")).forEach(System.out::println);
        System.out.println("пристрої за діапазон 2020-2021");
        devices.stream().filter(d-> d.getYear()>=2020 && d.getYear()<=2021).forEach(System.out::println);

    }
    public static void runTask4(){
        Projector[] projectorArray = {
                new Projector("Epson Home Cinema 5050UB", 2019, 2499.99, "Epson"),
                new Projector("BenQ HT3550", 2019, 1399.00, "BenQ"),
                new Projector("Optoma UHD50X", 2020, 1599.00, "Optoma"),
                new Projector("Sony VPL-VW295ES", 2019, 4999.99, "Sony"),
                new Projector("LG HU85LA", 2019, 5999.99, "LG"),
                new Projector("ViewSonic PX747-4K", 2018, 899.99, "ViewSonic"),
                new Projector("XGIMI Horizon Pro", 2021, 1699.00, "XGIMI"),
                new Projector("Acer H7850", 2018, 1999.99, "Acer"),
                new Projector("VAVA 4K UHD Laser TV Home Theatre Projector", 2020, 2599.00, "VAVA"),
                new Projector("JVC DLA-NX7", 2018, 8999.00, "JVC")
        };

        System.out.println("Всі проектори\n\n\n");
        Arrays.stream(projectorArray).forEach(System.out::println);
        System.out.println("Проектори виробника Sony\n\n\n");
        Arrays.stream(projectorArray).filter(projector -> projector.getManufacturer().equalsIgnoreCase("Sony")).forEach(System.out::println);
        System.out.println("Проектори року 2020\n\n\n");
        Arrays.stream(projectorArray).filter(projector -> projector.getYear()==2020).forEach(System.out::println);
        System.out.println("Проектори вказаної ціни вище ніж 2000\n\n\n");
        Arrays.stream(projectorArray).filter(projector -> projector.getPrice()>2000).forEach(System.out::println);
        System.out.println("Вивести всі проектори, відсортувати по ціна зростання\n\n\n");
        Arrays.stream(projectorArray).sorted(Comparator.comparing(Projector::getPrice)).forEach(System.out::println);
        System.out.println("Вивести всі проектори, відсортувати по ціні спадання\n\n\n");
        Arrays.stream(projectorArray).sorted(Comparator.comparing(Projector::getPrice).reversed()).forEach(System.out::println);
        System.out.println("Вивести всі проектори, відсортувати по року випуску по зростанню\n\n\n");
        Arrays.stream(projectorArray).sorted(Comparator.comparing(Projector::getYear)).forEach(System.out::println);
        System.out.println("Вивести всі проектори, відсортувати по року випуску по спаданню\n\n\n");
        Arrays.stream(projectorArray).sorted(Comparator.comparing(Projector::getYear).reversed()).forEach(System.out::println);
    }

}
