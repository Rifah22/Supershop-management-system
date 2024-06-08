
import java.lang.*;
public class Mobile{
	private String mobileOwnerName;
	private String mobileNumber;
	private double mobileBalance;
	private String mobileOSName;
	private boolean lock;

public Mobile(){
	
System.out.println("Empty-Mobile");

}

public Mobile(String mobileOwnerName , String mobileNumber ,double mobileBalance, String mobileOSName, boolean lock ){
	
	this.mobileOwnerName=mobileOwnerName;
	this.mobileNumber=mobileNumber;
	this.mobileBalance=mobileBalance;
	this.mobileOSName=mobileOSName;
    this.lock=lock;
	
System.out.println("Parameterized-mobile");

}

public void setMobileOwnerName(String mobileOwnerName )
	{
	this.mobileOwnerName=mobileOwnerName;
	}
public void setMobileNumber(String mobileNumber )
	{
		this.mobileNumber=mobileNumber;
		}
public void setMobileBalance(double mobileBalance )
	{
		this.mobileBalance=mobileBalance;
	}
public void setMobileOSName(String mobileOSName)
	{
		this.mobileOSName=mobileOSName;
	}
public void setLock(boolean lock)
	{
		this.lock=lock;
	}

public String getmobileOwnerName(){return mobileOwnerName ;}
public String getmobileNumber(){return mobileNumber;}
public double getmobileBalance(){return mobileBalance;}
public String getmobileOSName(){return mobileOSName;}
public boolean getlock(){return lock;}



public void recharge(int balance){
if(lock=false){
	
mobileBalance=mobileBalance+balance;

}

else
{
	System.out.println("Phone is locked you can't recharge");
}
}
public void callSomeone(int timeduration){
	if(lock=false){

System.out.println("Balance after call");
double cost=timeduration*0.5;
mobileBalance=mobileBalance-cost;
}

else{
	System.out.println("Phone is locked you can't call");
}
}




    public void showInfo()
	{
	System.out.println("MobileOwnerName:"+mobileOwnerName);
    System.out.println("MobileNumber:"+mobileNumber);
	System.out.println("MobileBalance:"+mobileBalance);
	System.out.println("MobileOSName:"+mobileOSName);
	
	System.out.println("");
    }
}

