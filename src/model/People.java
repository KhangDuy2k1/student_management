package model;
import java.time.LocalDate;
public class People {
    public static Integer currentId = 1;
    private Integer id;
    private String name;
    private LocalDate dateOfBird;
    private String address;
    private Double height;
    private Double weight;
    public People(){
    }
    public People(String name, LocalDate dateOfBird, String address, Double height, Double weight){
        this.id = currentId++;
        this.name = name;
        this.dateOfBird = dateOfBird;
        this.address = address;
        this.height = height;
        this.weight = weight;
    }
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBird() {
        return dateOfBird;
    }

    public void setDateOfBird(LocalDate dateOfBird) {
        this.dateOfBird = dateOfBird;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBird=" + dateOfBird +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
