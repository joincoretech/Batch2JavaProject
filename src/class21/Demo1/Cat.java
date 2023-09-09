package class21.Demo1;

import class21.Demo1.Animals;

public class Cat extends Animals {


    Cat(String name){
        this.name=name;
    }

    void meow(){
        System.out.println(name+ " is meowing");
    }

    void hunt(){
        System.out.println(name+ " is hunting");
    }

}
