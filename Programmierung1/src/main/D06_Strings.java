package main;

public class D06_Strings {

	public static void main(String[] agrs) {
		
		String text = "Hello World";
		int length = text.length();
		
		char characterATIndex7 = text.charAt(7);
		char firstCharacter = text.charAt(0);
		char lastCharacter = text.charAt(length -1);
		
		System.out.println(length);
		System.out.println("characterATIndex7:" + characterATIndex7);
		System.out.println("firstCharacter:" + firstCharacter);
		System.out.println("lastCharacter:" + lastCharacter);

		String columns = "id";
		String table = "flight";
		String condition = "city = 'Ravensburg'";
		String sqlQuery = "Select " + columns + "\nFROM " + table + "\nWHERE " + condition + ";";
				
// 		String sqlQuery2 = STR."""
//		SELECT \{ columns } 
//		FROM \{ table } 
//		WHERE \{ condition };""";
		
		System.out.println(sqlQuery);
		// "" in einem String verwenden
		System.out.println("Hallo \"Peter\"");
		System.out.println("C:\\Temp");
		
	}
	
}
