package class21.Demo1;

import class21.Demo1.Animals;

public class Lion extends Animals {

    Lion(String name){
        this.name=name;
    }

    void roar(){

        System.out.println(name+ " is roaring");
    }
}
