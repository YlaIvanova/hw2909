package hw2609;

public class Main1 {

    public static void main(String[] args) {
        Flower[] flowers = new Flower[10];

        Flower rose = new Flower("Роза обыкновенная", null, " Голандия", 35.59, 0);
        Flower chrysanthemum = new Flower(" Хризантема ", null, null, 15.00, 5);
        Flower pion = new Flower(" Пион", null, " Англия", 69.90, 1);
        Flower gypsophila = new Flower(" Гипсофила", null, " Турция", 19.50, 10);
        flowers[0] = rose;
        flowers[1] = chrysanthemum;
        flowers[2] = pion;
        flowers[3] = gypsophila;

        calculate  (flowers);
    }

    private static void calculate (Flower[] flowers){
        int lifeSpan= Integer.MAX_VALUE;
        double sum = 0;
        String text = "Букет состоит: \n";
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null){
                text += " " + flowers[i].getFlowerName() + " " + " из " + flowers[i].getCountry() + " \n";
                if (flowers[i].getLifeSpan()<lifeSpan){
                    lifeSpan = flowers[i].getLifeSpan();
                }
                sum += flowers[i].getCost();
            }
        }
        sum = sum *1.10;
        text += "\n";
        text += "Сумма букета = " + String.format(" %.2f",sum);
        text += "\n";
        text += "Срок годноости" + lifeSpan;
        System.out.println(text);



    }
}