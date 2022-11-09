package Adapter;

public class Client {

	public static void main(String[] args) {

		OracleComands Oracle = new OracleComands();
		
		System.out.println(Oracle.insert());
		
		
		MySQLComands MySQLComands = new MySQLComands();
		
		/*
		* MySQL.insert();    
		
		* Esse comando n�o existe, como fazer para chamar a classe 
		MySQLComands sem quebrar a interface 
		
		*/
		
		MySQLAdapter MySQL = new MySQLAdapter(MySQLComands);
		System.out.println(MySQL.insert());
		
		//dessa maneira conseguimos chamar o insert sem quebrar o codigo
		
	}

}
