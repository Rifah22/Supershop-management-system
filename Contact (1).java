public class Contact
{
	private String personName;
	private String personId;
	private int age;
	private String mobileNumber;
	private char gender;
	public Contact()
	{
	}
	public Contact(String personName,String personId,int age,String mobileNumber,char gender)
	{
		this.personName=personName;
		this.personId=personId;
		this.age=age;
		this.mobileNumber=mobileNumber;
		this.gender=gender;
	}
	public void setPersonName(String personName)
	{
		this.personName=personName;
	}
	public void setPersonId(String personId)
	{
		this.personId=personId;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setMobileNumber(String mobileNumber)
	{
		this.mobileNumber=mobileNumber;
	}
	public void setGender(char gender)
	{
		this.gender=gender;
	}
	
	public String getPersonName()
	{
		return personName;
	}
	public String getPersonId()
	{
		return personId;
	}
	public int setAge()
	{
		return age;
	}
	public String getMobileNumber()
	{
		return mobileNumber;
	}
	public char getGender()
	{
		return gender;
	}
	
	public void showPersonInfo()
	{
		System.out.println("Name of person: "+personName);
		System.out.println("ID number of person: "+personId);
		System.out.println("Age of person: "+age);
		System.out.println("Mobile number of person: "+mobileNumber);
		System.out.println("Gender of person: "+gender);
	}
	public void detectMobileOperator()
	
	
	
	{
		int n = Integer.parseInt(mobileNumber);
		mobile[n];
	//if(number[2] == 5)
	//{
	//	System.out.println("Teletalk");
	//}
	//else if ( mobileNumber[2] == 7 )
	//{
	//	System.out.println("GP");
	//}
	//else if(mobileNumber[2] == 8)
	//{
	//	System.out.println("Robi");
	//}
	//else if(mobileNumber[2] == 9)
	//{
	//	System.out.println("Banglalink");
	//}
	//else{System.out.println("Invalid format");
	//}

}
}
		