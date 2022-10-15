package hw2609;

public class Human {

    private String name;
    private String town;
    private String job;
    private int yearOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if (name == null) {
            this.name = " Информация не указана ";
        }else {
            this.name = name;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null) {
            this.town = " Информация не указана ";
        }else {
            this.town = town;
        }
    }
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        if (job == null) {
            this.job = " Информация не указана ";
        } else {
            this.job = job;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0) {
            this.yearOfBirth = 0;
        }else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public Human(String name, String town, String job, int yearOfBirth) {
        this.setName(name);
        this.setTown(town);
        this.setJob(job);
        this.setYearOfBirth(yearOfBirth);


        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +
                ". Я родился в " + yearOfBirth + " году.Я работаю на должности " + job + ". Будем знакомы! ");

    }

}





