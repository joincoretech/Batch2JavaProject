package class27;

public class EncapsulationDemo1 {

    private int field1;
    private int field2;
    private int field3;

    public void setField1(int field1){
        this.field1=field1;
    }

    public void getField1(){
        System.out.println(this.field1);
    }

    public void setField2(int field2){
        this.field2=field2;
    }

    public int getField2(){
        return this.field2;
    }

    public void setField3(int field3){
        this.field3=field3;
    }

    public int getField3(){
        return this.field3;
    }

}
