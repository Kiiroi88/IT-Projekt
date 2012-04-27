package Searches;
import java.util.*;

public class Searcher 
{
	ArrayList <String> resultList = new ArrayList <String>();

	// Searches through the input list from database, compares and returns a list of matched words with the
	// searched word. 
	public ArrayList <String> searchThrough(ArrayList <String> list, String searchWord)
	{
		int countLetters = searchWord.length();
		for (int i = 0; i < list.size(); i++) 
		{
			String word = list.get(i);

			try 
			{	
				String substring = word.substring(0, countLetters);

				if (substring.equalsIgnoreCase(searchWord)) 
				{
					resultList.add(word);
				}
			}
			catch (Exception e){
				System.out.println("Exception catched, no word found");
			}
		}
		return resultList;
	}
}

