package is.ru.stringcalculator; public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",") || text.contains("\n")){
			return sum(splitNumbers(text));
		}
		else
			return toInt(text);
	}
	private static int toInt(String number){
		return Integer.parseInt(number);
	}
	private static String[] splitNumbers(String numbers){
		return numbers.split(",");
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
		String list = "";
        for(String number : numbers){
			if (toInt(number) > 1000)
			{
				
			}
			if (toInt(number) < 0)
			{
				list += number + ",";
			}
		    total += toInt(number);
		}
		if (list.length != 0)
		{
			throw new IllegalArgumentException ("Negatives not allowed" + list);
		}
		return total;
    }
