package Memento;

public class Main {

    public static void main(String[] args) {
        Data data = new Data("Name", 111, 55);
        System.out.println(data);
        System.out.println("Изменили");
        data.setHeight(182);
        data.setWeight(94);
        System.out.println(data);
        System.out.println("Сохранили");
        Data save = data.saveData();
        System.out.println("Еще раз изменили");
        data.setHeight(155);
        data.setWeight(66);
        System.out.println(data);
        System.out.println("Загрузили сохраненное");
        data = data.loadData(save);
        System.out.println(data);
    }
}
