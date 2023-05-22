package may22;

public class Learn_Method_OverLoading {

    public static void main(String args[]) throws Exception{

        Learn_Method_OverLoading obj  = new Learn_Method_OverLoading();
        System.out.println(obj.AddNumbers(5,2,"subs"));
    }

    public int AddNumbers(int a , int b){
        return a+b;
    }
    public int AddNumbers(int a , int b , int c){
        return a+b+c;
    }
    public int AddNumbers(int a , int b , String typeOFCalculation){
        int c=0;
        if(typeOFCalculation.equals("add")){
            c = a+b;}
        if(typeOFCalculation.equals("subs")){
            c = a-b;}
        if(typeOFCalculation.equals("multi")){
            c = a*b;}
        return c;
    }













}
