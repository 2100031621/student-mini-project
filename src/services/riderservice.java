package services;
import dao.Riderdao;
import model.Rider;
public class riderservice {

	Riderdao da=new Riderdao();
	public void addRider(int id,String name,int phone,String status)
	 {
		 Rider r=new Rider(id,name,phone,status);
		 da.addrider(r);
		 
	 }
	public void viewRider()
	{
		da.viewrider();
	}
	public void updateRider(int id,String status)
	{
		da.updaterider(id, status);
	}
	public void deleteRider(int id)
	{
		da.deleterider(id);
	}
}
