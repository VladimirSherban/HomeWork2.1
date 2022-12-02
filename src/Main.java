public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 12;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeighOfBoxers = firstBoxer + secondBoxer;
        var weightDifferent = secondBoxer - firstBoxer;
        System.out.println("Общий вес боксеров = " + totalWeighOfBoxers + "кг" + " Разница между весами бойцов = " + weightDifferent + "кг");
    }

    public static void task7() {
        System.out.println(" Задача 7");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var weightDifferent = secondBoxer - firstBoxer;
        var weightDifferent2 = secondBoxer % firstBoxer;
        System.out.println("Вычитание из большего веса меньшего " + weightDifferent);
        System.out.println("С помощь функции остаток от деления " + weightDifferent2);
    }

    public static void task8() {
        System.out.println("Задача 8");
        var workingHours = 640.0;
        var timeOfOneEmployee = 8.0;
        var totalEmployees = workingHours / timeOfOneEmployee;
        System.out.println("Всего работников в компании : " + totalEmployees + " сотрудников");

        var newWorkers = 94.0;
        totalEmployees = totalEmployees + newWorkers;
        var openingHours = totalEmployees * timeOfOneEmployee;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + openingHours +
                " часов работы может быть поделено между сотрудниками");
    }
}
