package package_B;

public class Day1 {

    // Data Types ...

    String studentName="Ravi";
    int studentRoll = 1;
    String address = "1719 doublin blvd , Louisville , KY";
    float marks = 9.5f;
    boolean grade_result = true;


    public static void main(String[] args) throws Exception{

        // Create an object of the Class ...

        Day1 obj = new Day1(); // Creating an object of Class Day1
        May_10_Basics objMay10 = new May_10_Basics();  // Creating an object of Class May_10_Basics

        obj.add_two_numers();
        System.out.println("I am learning Java Programming ....");
        System.out.println("The Address is ==>"+obj.address);


        System.out.println("The School Address is ===>"+objMay10.schoolAddress);
        objMay10.rateOfBankInterest();

    }

    // This is void type method ...

    public void add_two_numers(){

        int sum = 5+5;
        System.out.println(sum);
    }

    // This is a String type method ...

    public String AStringTypeProgram(){

        return "Welcome to java";
    }

    // This is a int type method ...

    public int AnIntegerTypeProgram(){

        return 20;
    }

    public void doLoginToMySystem(){



    }


    public void addItemToTheCart(){


    }






}
