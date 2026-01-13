package model;

public class Rider {

int id;
String name;
int phone;
String status;
public Rider(int id, String name,int phone,String status)
{
	this.id=id;
	this.name=name;
	this.phone=phone;
	this.status=status;
}
public int getId() {
return id;
}
public String getName()
{
	return name;
}
public int getPhone()
{
	return phone;
}
public String getStatus()
{
	return status;
}
	}


