package gr.aueb.cf.ch17.clonable;

import java.util.Objects;

public class Trainee implements Cloneable{

    private String name;
    private City city;

    public Trainee() {}

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public Trainee (Trainee trainee) {
        this.name = trainee.getName();
        this.city = new City((trainee.getCity()));  //deep copy
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    protected Trainee clone() throws CloneNotSupportedException {
        // return (Trainee) super.clone();

        Trainee trainee = (Trainee) super.clone();  //shallow copy

        trainee.setCity(new City(this.getCity().getName()));    //solves the shallow copy problem

        return trainee;
    }


    @Override
    public boolean equals(Object o) {   //from intellij
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        return Objects.equals(name, trainee.name) && Objects.equals(city, trainee.city);
    }

    @Override
    public int hashCode() {     //from java
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
