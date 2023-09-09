package class21;

public class ThisDemo2 {

    String name;

    ThisDemo2(String name){

        this.name=name;
        System.out.println(this.name);
    }

    ThisDemo2(){
       this("Nasratullah");
    }

    public static void main(String[] args) {

       ThisDemo2 thisDemo2=new ThisDemo2();
    }
}
