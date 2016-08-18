package leetcode;

public class RecurringDecimal {
	
	public static void main(String[] args) {
		RecurringDecimal rc = new RecurringDecimal();
		System.out.println(rc.fractionToDecimal(2 , 3));
	}
	
	
	public String fractionToDecimal(int numerator, int denominator) {
		int[] flag = new int[10];
		if (denominator == 0) {
			return "";
		}
		if (denominator == 1) {
			return String.valueOf(numerator);
		}
		StringBuffer sb = new StringBuffer();
		String result = "";
		if (numerator > denominator) {
			result += String.valueOf(numerator / denominator);
			sb.append(result);
			if (numerator == 1) {
				return sb.toString();
			} else {
				sb.append(".");
				numerator = numerator / denominator;
			}
		} else {
			sb.append(".");
		}
		StringBuffer decimals = new StringBuffer();
		while (numerator < denominator) {
			int num = (numerator * 10) / denominator;
			if (flag[num] != 0) {
				// Repeating.
				String decimalString = decimals.toString();
				for(int i = 0; i < decimalString.length(); i++) {
					System.out.println((char)num);
					if (decimalString.charAt(i) == (char)num) {
						decimals.append('(');
					}
					decimals.append(String.valueOf(decimalString.charAt(i)));
				}
				decimals.append(')');
				break;
			} else {
				flag[num] = 1;
				decimals.append(num);
			}
		}
		return sb.toString() + decimals.toString();

		// 2 / 3 - 20 /3 = 6 2/3 = 6 22/3 = 6;
	}
}
