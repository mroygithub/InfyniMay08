package may22;

import java.sql.Date;
import java.sql.SQLData;

public class Encapsulation_Learn {

    // This is The Place Where AT&T Are Keeping Private Data for Every Customers ....
    private int mobileData=0;
    private float hike;

    // Getter Method ...
    public float getHike(){
        return hike;
    }

    // Setter Method ..

    public void setHike(int empID , Date DOB , String PW){

        this.hike = getHikeDataFromDB(empID,DOB,PW);
    }


    // Getter Method ...
    public int getMobileData(){
        return mobileData;
    }
    // Setter Method ...
    public void setMobileData(int MobileNumber , String code){

        this.mobileData = getTheDataFromPrivateDataBase(MobileNumber,code);
    }
    private int getTheDataFromPrivateDataBase(int MobileNumber , String code){

        int data = 0;
        // data = SQLData;
        return 12;
    }

    private float getHikeDataFromDB(int MobileNumber , Date DOB , String Passsword){

        int individual_Hike = 0;
        // individual_Hike = SQLData;
        return 8.2f;
    }





}
