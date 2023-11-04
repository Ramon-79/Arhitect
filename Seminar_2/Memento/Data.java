package Memento;

public class Data {
    private String name;
    private double height;
    private double weight;

    public Data(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    
    }

    public Data saveData(){
        Data saveData = new Data(name, height, weight);
        return saveData;
    }

    public Data loadData(Data Data){
        this.name = Data.name;
        this.height = Data.height;
        this.weight = Data.weight;
        return Data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
