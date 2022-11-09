package Adapter;

public class MySQLAdapter implements DBAdapter{

	private MySQLComands MySQL;
	
	
	public MySQLAdapter(MySQLComands MySQL) {
		this.MySQL = MySQL;
	}
	
	
	public String insert() {
		return this.MySQL.insertMySQL();
	}
	
	public String update() {	
		return this.MySQL.updateMySQL();
	}
	
	public String delete() {	
		return this.MySQL.deleteMySQL();		
	}
	
	
}
