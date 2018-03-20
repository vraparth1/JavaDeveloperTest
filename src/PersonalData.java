import java.util.ArrayList;

import javax.naming.ldap.StartTlsRequest;

import org.omg.Messaging.SyncScopeHelper;

public class PersonalData {

	String Name;
	int id;
	String address;
	public static ArrayList<PersonalData> al;
	
	public PersonalData(String Name, int id, String address) {
		this.Name=Name;
		this.id=id;
		this.address=address;
	}

	//toString() method returning string type data
	public String toString(){
		
		
		return "("+Name+","+id+","+address+")";
		
	}
	public static ArrayList<PersonalData> modify(ArrayList<PersonalData> bl,String name,String address)
	{
		
				
		int i=0;
		for(PersonalData obj:bl){
			
		if(obj.Name.equalsIgnoreCase("vandana"))
		{
			obj.address="Delhi";
			bl.set(0,obj);
			
		}
		
		i++;
		}
		
		return al;
		
	}
	
	public static void main(String args[])
	{
		al=new ArrayList();
		
		PersonalData p=new PersonalData("Vandana",100,"Hyderabad");
		PersonalData p1=new PersonalData("Ram",101,"Chennai");
		PersonalData p2=new PersonalData("Kajal",102,"Mubai");
		PersonalData p3=new PersonalData("Suraj",103,"Surat");
		PersonalData p4=new PersonalData("Punam",104,"Jaipur");
		al.add(p);
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		System.out.println("Original list@@@@@@@@@@@@@@");
		for(PersonalData obj:al){
			System.out.println(obj.toString());
		}
	
		
		al=PersonalData.modify(al,"Vandana","Delhi");
		
		System.out.println(" Modified list values");
		
		
		for(PersonalData obj:al){
			System.out.println(obj.toString());
		}
}
}
