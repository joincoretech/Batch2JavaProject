package class21.Demo2;

public class TeacherTester {

    public static void main(String[] args) {

        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.name="Aslam";
        mathTeacher.subject="math";
        mathTeacher.teach();
        mathTeacher.teachMath();

        ChemoTeacher chemoTeacher=new ChemoTeacher();
        chemoTeacher.name="Iqbal";
        chemoTeacher.subject="chemistry";
        chemoTeacher.teachChemistry();
        chemoTeacher.teach();
    }
}
