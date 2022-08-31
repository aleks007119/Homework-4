public class Main {
    public static void main(String[] args) {

        //Домашнее задание 1, 2 (Уже с конструцией else)
        System.out.println("Домашнее задание 1, 2 (Уже с конструцией else)");

        // Задание 1
        System.out.println("Задание 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать. ");
        }
        // Задание 2
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Человек ходит в университет");
        } else if (age >= 24) {
            System.out.println("Человек ходит на работу");
        }
        // Задание 3
        System.out.println("Задание 3");
        int capacityCar = 102;
        int sittingPlace = 60;
        int standPlace = capacityCar - sittingPlace;

        int sittingOccupied = 10;
        int standOccupied = 12;

        if (sittingOccupied < sittingPlace) {
            System.out.println("Есть еще " + (sittingPlace - sittingOccupied) + " сидячих мест.");
        } else {
            System.out.println("Сидячих мест нет");
        } if (standOccupied < standPlace) {
            System.out.println("Есть еще " + (standPlace - standOccupied) + " стоячих мест");
        } else {
            System.out.println("Стоячих мест нет");
        }

        // Домашнее задание 3
        System.out.println("Домашнее задание 3");

        // Задание 1
        System.out.println("Задание 1");
        int ageOfThePerson = 24;

        if (ageOfThePerson >= 2 && ageOfThePerson <= 6) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в детский сад");
        } else if (ageOfThePerson >= 7 && ageOfThePerson <= 18) {
            System.out.printf("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в школу");
        } else if (ageOfThePerson > 18 && ageOfThePerson < 24) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить на работу");
        }
        //Задание 2
        System.out.println("Задание 2");
        int ageOfTheChild = 15;

        if (ageOfTheChild < 5) {
            System.out.printf("Ребенок не может кататься на атракционе.");
        } else if (ageOfTheChild >= 5 && ageOfTheChild <= 14) {
            System.out.println("Ребенок может кататься на атракционе только в сопровождении взрослого.");
        } else {
            System.out.println("Ребенок может кататься на атракционе без сопровождения взрослого");
        }
        // Задание 3
        System.out.println("Задание 3");
        int one = 15;
        int two = 15;
        int three = 15;

        if (one > two && one > three) {
            System.out.println("Наибольшее число " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число " + two);
        } else {
            System.out.println("Наибольшее число " + three);
        }

    }
}