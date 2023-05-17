package may17_oops;

public class iPhone15_Child extends iPhone14_Parents{

    public static void main(String args[]) throws Exception{

        iPhone15_Child mithun =  new iPhone15_Child();
        mithun.call_using_Phone();
        mithun.HD_Picture();

    }

    public void security_By_FingerPrint(){
        System.out.println("We can unlock using finger Touch");
    }

    public void HD_Picture(){
        System.out.println("We can capture HD Picture");
    }

    public void Lock_By_DoubleShake(){
        System.out.println("We can lock using double shake");
    }




}
