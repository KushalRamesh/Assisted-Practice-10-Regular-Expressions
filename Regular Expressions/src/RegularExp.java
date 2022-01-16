import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	public class RegularExp {
	  public static void main(String[] args)
	  {
	    String stringToSearch = "Four score and seven years ago our fathers ...";

	    Pattern p = Pattern.compile("score");   
	    Matcher m = p.matcher(stringToSearch);
	    if (m.find())
	      System.out.println("Found a match");
	    else
	      System.out.println("Did not find a match");
	  }
	}