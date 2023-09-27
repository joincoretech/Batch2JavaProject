package class34;

public class Demo4 {
    public static void main(String[] args) {

        int [] arr={10,15};

        try{
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("the element you look for is bigger the array size");
        }




    }
}
