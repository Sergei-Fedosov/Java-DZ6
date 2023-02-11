import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class Task0 {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 8, "Windows10", "HP"));
        set.add(new Notebook("Notebook 2", 16, "Windows10", "Asus"));
        set.add(new Notebook("Notebook 3", 32, "linux","Lenovo"));
        set.add(new Notebook("Notebook 4", 64, "linux", "Lenovo"));


    }

    public List<Notebook> initListNotebooks(){

        return null;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){

        return null;
    }

}