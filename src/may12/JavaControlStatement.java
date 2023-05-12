package may12;

public class JavaControlStatement {

    public static void main(String[] args) throws Exception{
        JavaControlStatement obj = new JavaControlStatement();
        //obj.rateOfHomeLoanInterest("boa");
        //obj.eligibleForHillTrackingTrip(40);
        //obj.print_1_to_100();
        obj.learnWhileLoop();
    }

    public void rateOfHomeLoanInterest(String bankName){

        if(bankName.equals("jpmc")){
            System.out.println("Home Loan Interest is =>"+7.8);
        }
        if(bankName.equals("wells fargo")){
            System.out.println("Home Loan Interest is =>"+9.8);
        }
        if(bankName.equals("boa")){
            System.out.println("Home Loan Interest is =>"+6.8);
        }

    }

    public void eligibleForHillTrackingTrip(int age){
        if(age<18 || age>60){
            System.out.println("Sorry , you are not eligible for the Trip as your age is :"+age);
        } else if (age>=18 && age<=60) {
            System.out.println("Congrats... , you are eligible for Tracking .....");
        }
        else {
            System.out.println("You are giving wrong input");
        }
    }


    public void print_1_to_100() {

        for (int a = 1; a <= 100; a++) {
            System.out.println("The current value of a is ===>" + a);
        }
    }

        public void learnWhileLoop(){
            int i=0 , n = 20;
            while (i<=n){
                System.out.println("The value of i is ==>"+i);
                i++;
            }
        }










}


