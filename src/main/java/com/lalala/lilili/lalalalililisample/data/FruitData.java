package com.lalala.lilili.lalalalililisample.data;

import com.lalala.lilili.lalalalililisample.model.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitData {

    public static List<Fruit> data = new ArrayList<>();

    public static Fruit addFruit(Fruit fruit){
        fruit.setId(data.size());
        data.add(fruit);
        return fruit;
    }

    public static Fruit updateFruit(Fruit fruit){
        data.set(fruit.getId(),fruit);
        return fruit;
    }

    public static void deleteFruit(Integer id){
        data.remove(id);
    }
}
