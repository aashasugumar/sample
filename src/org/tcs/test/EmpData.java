package org.tcs.test;


public class EmpData {
public void empDetail() {
	System.out.println("enter employee detail");

}

//data types 
public void empDetail(String name) 
{
	System.out.println("enter employee detail");

}
//dat atypes count increased
public void empDetail(String surname,int rollNum) 
{
	System.out.println("employee surname is"+surname);
System.out.println("employee rollnum"+rollNum);

}

public static void main(String[] args) {
	EmpData a=new EmpData();
	a.empDetail();
	a.empDetail("jhon");
	a.empDetail("jaya", 4567);
//<<<<<<< HEAD
//=======
	System.out.println("suceesss...");
	 System.out.println("new conflict by sugu");

//>>>>>>> 62a2199e0912e7e9ca44a28c6f422451c6056465
	
}



}
