package com.company;

public class Main {

    public static void main(String[] args) {
        String[] animalArray = new String[]{"Тигр","ррр","Собака","Гав","кошка","мяу",
                "попугай","кеша хороший","Лев","я король"};
        int len=animalArray.length;

        for(int i=0; i<len; i++) {
            Animal someAnimal = new Animal(animalArray[i],animalArray[++i]);
            someAnimal.Voice();
        }
    }
}
