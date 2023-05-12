package may12;

public class testClass {



    private String applicationToken = null;

    public static void main(String args[]) throws Exception{

        testClass obj = new testClass();
        obj.applicationToken = obj.applicationTokenNumber();

        actionClass act = new actionClass(obj.applicationToken);

        System.out.println("The value of Global Token Number =="+act.global_Token_Number);

    }

    public String applicationTokenNumber(){

        return "AA0122345001";
    }






}
