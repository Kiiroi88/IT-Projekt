package Search;

import java.util.*;

public class Test_Fun {

	public static void main(String [] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Search for word: ");

		String inValue = scan.nextLine();

		Searcher searcher = new Searcher();
		Search_Fun search_fun = new Search_Fun();
		search_fun.connect();
		search_fun.select(); 
		ArrayList <String> temp = searcher.searchThrough(search_fun.groceryList, inValue);
		System.out.println("Groceries matched in the database: " + temp);

		search_fun.selectArticle(temp);
		search_fun.selectID(temp);
		search_fun.selectUnit(temp);
		search_fun.selectQuantity(temp);
		search_fun.selectFRP(temp);
		search_fun.selectPrice(temp);
		search_fun.selectType(temp);
		search_fun.selectStoredAt(temp);
	}
}

