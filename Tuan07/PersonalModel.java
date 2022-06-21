package Tuan07;

import java.util.ArrayList;

public class PersonalModel<T> {
    private ArrayList<T> list;

    public PersonalModel() {
        list = new ArrayList<T>();
    }

    public PersonalModel(ArrayList<T> list) {
        this.list = list;
    }

    public void add(T t) {
        list.add(t);
    }

    public void display() {
        for (T t : list) {
            System.out.println(t);

            
        }
    }
}
