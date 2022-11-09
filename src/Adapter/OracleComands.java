package Adapter;

public class OracleComands implements DBAdapter{

	
	public String insert() {
		return "INSERT FROM Oracle";	
	}
	
	public String update() {	
		return "UPDATE FROM Oracle";	
	}
	
	public String delete() {	
		return "DELETE FROM Oracle";		
	}
	
}
