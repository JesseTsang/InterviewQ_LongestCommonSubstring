import java.util.ArrayList;
import java.util.List;

public class findCommonSubstring 
{
	private String s1 = null;
	private String s2 = null;
	
	private int length1 = 0;
	private int length2 = 0;
	private int max = Integer.MIN_VALUE; //Maximum length of the common substring
	private ArrayList<String> result = null; //Store the longest common substring
	
	public findCommonSubstring(String s1, String s2) 
	{
		this.s1 = s1;
		this.s2 = s2;
		length1 = this.s1.length();
		length2 = this.s2.length();
	}

	public List<String> commonSubstring()
	{
		Integer match[][] = new Integer[s1.length()][s2.length()];
		
		//Start by row 1 ... then 2 ... and so on
		for(int i=0; i<length1; i++)
		{
			//At row 1, start looping through the columns
			for(int j=0; j<length2; j++)
			{
				//When there is a match
				if(s1.charAt(i) == s2.charAt(j))
				{
					//If it's first row or first column ...
					if(i==0 || j==0)
					{
						match[i][j] = 1; //This marks the starting point of the common substring
					}
					else
					{
						match[i][j] = match[i-1][j-1] + 1; //Set the value as previous diagonal value by 1
					}
					
					//This keeps check of the maximum length of the common substring
					if(match[i][j] >= max)
					{
						max = match[i][j];
						result = new ArrayList<String>();
						result.add(s1.substring(i-max + 1, i + 1));
					}
				}
				else
				{
					match[i][j] = 0; //No match
				}
			}//ends inner for-loop
		}//ends outer for-loop
		
		return result;
	}
}
