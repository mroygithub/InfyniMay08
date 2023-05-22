package may22;

public class Call_Encapsulation {

    // You want to See the Mobile Data Balance .....

    public static void main(String args[]){

        Encapsulation_Learn obj = new Encapsulation_Learn();
        obj.setMobileData(12345 , "#123*");
        System.out.println("You still have balance of ==>"+obj.getMobileData()+" "+"GB");


    }







}
