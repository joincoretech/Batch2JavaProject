package class21.Demo1;

import class21.Demo1.Animals;

public class Dog extends Animals {

    Dog (String name){
        this.name=name;
    }

    void bark(){
        System.out.println(name+ " is barking");

    }
    void run(){
        System.out.println(name+ " is running");
    }
}
