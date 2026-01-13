package main;
import java.util.Scanner;

import services.riderservice;
public class main {

	public static void main(String[] args) {
		riderservice r=new riderservice();
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter ");
			System.out.println("\n1.Add Rider");
			System.out.println("\n2.View Riders");
			System.out.println("\n3.Update Rider");
			System.out.println("\n4.Delete Rider");
			System.out.println("\n5.Exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1: 
				System.out.println("Enter rider details");
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter Name");
				String name=sc.next();
				System.out.println("Enter phone number");
				int phone =sc.nextInt();
				System.out.println("Enter Status");
				String status=sc.next();
				r.addRider(id, name, phone, status);
				System.out.println("New Rider Added");
				break;
			case 2:
				System.out.println("Rider details");
				r.viewRider();
				break;
			case 3:
				System.out.println("Enter id to Update");
				int uid=sc.nextInt();
				System.out.println("Enter status to update");
				String uname=sc.next();
				r.updateRider(uid, uname);
				break;
			case 4:
				System.out.println("Enter id number to delete");
				int did=sc.nextInt();
				r.deleteRider(did);
				break;
			case 5:
				System.exit(0);
			}
			
		}
	}

}
