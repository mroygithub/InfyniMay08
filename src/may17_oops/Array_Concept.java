package may17_oops;

public class Array_Concept {

    int Roll = 10;
    String name = "Raja";
    // dataType[] arrayName;
    public String[] studentsName;
    public static void main(String[] args) throws Exception{

        Array_Concept obj = new Array_Concept();
        obj.I_Am_Learning_An_Array(5);
    }
    public void I_Am_Learning_An_Array(int num) {

        studentsName = new String[num];

        for (int a = 0; a < studentsName.length; a++) {
            System.out.println(a);
            studentsName[a] = "StudentName_" + a;
            System.out.println(studentsName);

        }

        for (int i = 0; i < studentsName.length; i++) {

            System.out.println("The Student Name is ==>" + studentsName[i]);
            System.out.println(i);


        }
    }

}
