
public class StringCalculator {

	public int add(String string) {
		if("".equals(string))
		return 0;
		String[]values = string.split(",");
int sum = 0;
for (String value :values) {
	sum +=Integer.valueOf(value);
}
return sum;
	
	}	
}
