package hw2609;

public class Main {
    public static void main(String[] args) {

        Human maksim = new Human("Максим"," Минск ", "бренд менеджера", 1987);
        Human anna = new Human("Аня", " Москва", "методиста образовательных программ",1993);
        Human katya = new Human("Катя", " Калининград", "продакт-менеджера",1994);
        Human artem = new Human("Артем", " Москва", "директора по развитию бизнеса", 1995 );
        Human vladimir = new Human("Владимир", " Казань", "безработный", 2001);
        Human yuliia = new Human("Юлия", " null", "безработный", 0);

        printInfo(maksim);
        printInfo(anna);
        printInfo(katya);
        printInfo(artem);
        printInfo(vladimir);
        printInfo(yuliia);
    }

    private static void printInfo ( Human human) {
        System.out.println("Привет! Меня зовут " + human.getName() + ". Я из города " + human.getTown() +
                ". Я родился в " + human.getYearOfBirth() + " году.Я работаю на должности " + human.getJob() + ". Будем знакомы! ");

    }
}