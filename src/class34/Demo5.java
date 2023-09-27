package class34;

public class Demo5 {

    public static void main(String[] args) {
        try {

            System.out.println(10 / 0);
            String str = null;
            System.out.println(str.length());
            int[] arr = {10, 5};
            System.out.println(arr[5]);
            System.out.println(arr[-1]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
