[8:42 PM] SAMIA SHARMIN DOLA
public class Contact{
private String personName;
private String personId;
private int age;
private String mobileNumber[];
private char gender;
public Contact(){}
public Contact(String n, String id, int a, String m, char g)
{
	personName = n;
	personId = id;
	age = a;
	mobileNumber = x;
	gender = g;
}
public void ShowPersonInfo()
{
	System.out.println("" + personName);
	System.out.println("" + personId);
	System.out.println("" + age);
	System.out.println("" + mobileNumber);
	System.out.println("" + gender);
}
public void DetectMobileOperator() 
{
	if(mobileNumber[2] == "5")
	{
		System.out.println("Teletalk");
	}
	else if ( mobileNumber[2] == "7" )
	{
		System.out.println("GP");
	}
	else if(mobileNumber[2] == "8")
	{
		System.out.println("Robi");
	}
	else if(mobileNumber[2] == "9")
	{
		System.out.println("Banglalink");
	}
	else{System.out.println("Invalid Input");}
}
public static void main(String args[])
{
Contact c1 = new Contact("Aj", "3900", 20, "01955532841", 'M');
	c1.ShowPersonInfo();
}
}

