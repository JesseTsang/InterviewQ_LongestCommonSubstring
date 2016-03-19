import java.util.List;

public class driver 
{
	public static void main(String[] args) 
	{
		String testString1 = "LCLCABCDEABCXXY";
		String testString2 = "CLCLABCDEABCXYZ";
		List<String> testResult1 = null;
		
		findCommonSubstring test1 = new findCommonSubstring(testString1, testString2);
		testResult1 = test1.commonSubstring();
		
		System.out.print("The longest string is: ");
		
		for (int i=0; i<testResult1.size(); i++)
		{
			System.out.print(testResult1);
		}
	}
}
