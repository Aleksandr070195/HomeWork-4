public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int personAge = 18;
        if (personAge <= 18) {
            System.out.println("Если возраст человека равен " + personAge + ", он совершеннолетний ");
        }
        if (personAge >= 18) {
            System.out.println("Если возраст человека равен " + personAge + ", он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int air = 5;
        if (air >= 5) {
            System.out.println("на улице " + air + " градусов, нужно надеть шапку");
            if (air <= 5)
                System.out.println("на улице " + air + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 60;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int child = 2;
        if (child >= 6) {
            System.out.println("Если возраст человека равен " + child + ", то ему нужно ходить в детский сад");
        } else {
            System.out.println("Если возраст человека равен " + child + ", то ему нужно ходить в детский сад");
        }
        int schoolboy = 7;
        if (schoolboy >= 18) {
            System.out.println("Если возраст человека равен " + schoolboy + ", то ему нужно ходить в школу");
        } else {
            System.out.println("Если возраст человека равен " + schoolboy + ", то ему нужно ходить в школу");
        }
        int student = 18;
        if (student <= 24) {
            System.out.println("Если возраст человека равен " + student + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + student + ", то ему нужно ходить в университет");
        }
        int manAdult = 24;
        if (manAdult > 24) {
            System.out.println("Если возраст человека равен " + manAdult + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + manAdult + ", то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int childAge = 12;
        boolean hasAdult = true;

        if (childAge < 5) {
            System.out.println("Ребенок не может кататься на аттракционе.");
        } else if (childAge >= 5 && childAge < 14 && hasAdult) {
            System.out.println("Ребенок может кататься на аттракционе в сопровождении взрослого.");
        } else if (childAge >= 5 && childAge < 14 && !hasAdult) {
            System.out.println("Ребенок не может кататься на аттракционе. Нет взрослого.");
        } else {
            System.out.println("Ребенок может кататься на аттракционе.");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int a = 1, b = 2, c = 3;

        if (a >= b) {
            if (a >= c)
                System.out.println(a + " большее число");
            else
                System.out.println(c + " большее число");
        } else {
            if (b >= c)
                System.out.println(b + " большее число");
            else
                System.out.println(c + " большее число");
        }
    }
}