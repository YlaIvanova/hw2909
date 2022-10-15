package transport;

import java.time.LocalDate;

public class Car {

    private final String brand;
    private final String model;
    public double engineVolume;
    public String color;
    private final Integer productionYear;
    private final String productionCountry;

    public String transmission;

    private final String bodyType;

    public String registrationNumber = "х000хх000";

    private final int numberOfSeats;

    public String rubberSeason;

    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, Integer productionYear,
               String productionCountry, String transmission, String bodyType, int registrationNumber,
               int numberOfSeats, String rubberSeason) {
        this.brand = brand;
        this.model = model;
        if (isNullOrEmpty()) {
            this.engineVolume = 1.50;
        } else {
            this.engineVolume = engineVolume;
            this.color = color;
            this.productionYear = productionYear;
            this.productionCountry = productionCountry;
            this.transmission = transmission;
            this.bodyType = bodyType;
            this.registrationNumber = registrationNumber;
            this.numberOfSeats = numberOfSeats;
            this.rubberSeason = rubberSeason;


            public String getBrand () {
                return brand;
            }


            public String getModel () {
                return model;
            }

            public double getEngineVolume () {
                return engineVolume;
            }

            public void setEngineVolume ( double engineVolume){
                this.engineVolume = engineVolume;
            }

            public String getColor () {
                return color;
            }

            public void setColor (String color){
                this.color = color;
            }

            public int getProductionYear () {
                return productionYear;
            }

            public String getProductionCountry () {
                return productionCountry;
            }

            public String getTransmission () {
                return transmission;
            }

            public void setTransmission (String transmission){
                this.transmission = transmission;
            }

            public String getBodyType () {
                return bodyType;
            }

            public int getRegistrationNumber () {
                return registrationNumber;
            }

            public void setRegistrationNumber ( int registrationNumber){
                this.registrationNumber = registrationNumber;
            }

            public int getNumberOfSeats () {
                return numberOfSeats;
            }

            public String getRubberSeason () {
                return rubberSeason;
            }

            public void setRubberSeason (String rubberSeason){
                this.rubberSeason = rubberSeason;
            }

        }
        public static boolean isNullOrEmpty (String value){
            return value == null || value.isBlank();

        }

        public void changeTyres () {
            this.rubberSeason = !this.rubberSeason;


        }
        public boolean checkNumber () {
            //x000xx11
            if (this.registrationNumber.length() < 9) {
                System.out.println(" Это неправильный регистрациоонный номер");
                return false;
            }
            char[] number = this.registrationNumber.toCharArray();
            if (!Character.isAlphabetic(number[0])) {
                System.out.println(" Это неправильный регистрациоонный номер");
                return false;
            }
            if (!Character.isDigit(number[1])) {
                System.out.println(" Это неправильный регистрациоонный номер");
                return false;
            }
            if (!Character.isDigit(number[2])) {
                System.out.println(" Это неправильный регистрациоонный номер");
                return false;
            }
            if (!Character.isDigit(number[3])) {
                System.out.println(" Это неправильный регистрациоонный номер");
                return false;
            }
            if (!Character.isAlphabetic(number[4])) {
                System.out.println(" Это неправильный регистрациоонный номер");
                return false;
            }
            if (!Character.isAlphabetic(number[5])) {
                System.out.println(" Это неправильный регистрациоонный номер");
                return false;
            }
            if (!Character.isDigit(number[6])) {
                System.out.println(" Это неправильный регистрациоонный номер");
                return false;
            }
            if (!Character.isDigit(number[7])) {
                System.out.println(" Это неправильный регистрациоонный номер");
                return false;
            }

            return true;
        }

        public Key getKey() {
            return key;
        }

        public void setKey(Key key) {
            this.key = key;
        }

        public Insurance getInsurance() {
            return insurance;
        }

        public void setInsurance(Insurance insurance) {
            this.insurance = insurance;
        }


        public static class Key {

        private boolean remoteEngineStart;

        private boolean keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            if (remoteEngineStart == null) {
                this.remoteEngineStart = "remoteEngineStart";
            }
                if (keylessAccess == null) {
                    this.keylessAccess = "keylessAccess";
                }
            }
        }

            public static class Insurance {

                private final LocalDate validOnTil;

                private final double cost;

                private final String insuranceNumber;

                public Insurance(LocalDate validOnTil, double cost, String insuranceNumber) {
                    this.validOnTil = validOnTil;
                    if (validOnTil.isBefore(LocalDate.now())){
                        System.out.println("Срочно оформить страховку!");
                    }
                    if (insuranceNumber.length()<9){
                        System.out.println("Номер стрховки неправильный!");
                    }
                    this.cost = cost;
                    this.insuranceNumber = insuranceNumber;
                }
            }

}


