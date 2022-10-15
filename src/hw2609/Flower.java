package hw2609;

public class Flower {

    private String flowerName;

    private String flowerColor;

    private String country;

    private double cost;

    public int lifeSpan;

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null) {
            this.flowerColor = " белый ";
        } else {
            this.flowerColor = flowerColor;
        }
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country){
            if (country == null) {
                this.country = " Россия ";
            } else {
                this.country = country;
            }
        }
    public double getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(Integer lifeSpan) {
        this.lifeSpan = lifeSpan;

    }

    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerName = flowerName;
        if (isNullOrEmpty(flowerColor)) {
            this.flowerColor = " белый ";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty()) {
            this.country = " Россия ";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1.00;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.isBlank();
    }
}



