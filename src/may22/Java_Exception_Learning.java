package may22;

public class Java_Exception_Learning {


    // I Opened Amazon.com
    // Validate Logo // Ther is some error/Exception / Xpath Change ...testScripts is Failing ...
    // Validate Header Navigations
    // Validate Login
    // Validate Footer Navigations ...
    // Quit / Close Amazon


    public static void main(String args[]){

        Java_Exception_Learning obj = new Java_Exception_Learning();
        obj.launch_Amazon();
        obj.validate_Amazon_Logo();
        obj.validate_Amazon_Header_Navigations();
        obj.login_Amazon();
        obj.validate_Amazon_Footer_Navigations();
        obj.quit_Amazon();

    }

    public void launch_Amazon(){
        System.out.println("Launching Amazon");
    }

    public void validate_Amazon_Logo(){

        try {
            int a = 5 / 0;
        }
        catch(Exception e){
            System.out.println("There is some error during Logo validation and the error is ==> "+e);
        }
    }

    public void validate_Amazon_Header_Navigations(){
        System.out.println("Amazon Header Validations ...");
    }

    public void login_Amazon(){
        System.out.println("Login into  Amazon");
    }

    public void validate_Amazon_Footer_Navigations(){
        System.out.println("Amazon Footer Validations ...");
    }

    public void quit_Amazon(){
        System.out.println("Quiting Amazon..............");
    }






}
