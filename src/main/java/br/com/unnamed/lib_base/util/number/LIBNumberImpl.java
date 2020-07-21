package br.com.unnamed.lib_base.util.number;

class LIBNumberImpl {
	public static boolean isNumber(String value) {
		String newValue = value.replace(",", ".");

		try {
			Double.parseDouble(newValue);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public static boolean isInteger(String value) {
		String newValue = value.replace(",", ".");

		if(!isNumber(newValue)) {
			return false;
		}
		return Double.parseDouble(newValue) % 1 == 0;
	}
	
	public static boolean isInteger(Double value) {
		if(value == null) {
			return false;
		}
		
		return value % 1 == 0;
	}
	
	public static int toInt(String value) {
		String newValue = value.replace(",", ".");

		if(!isNumber(newValue) || !isInteger(newValue)) {
			return 0;
		}
		return Integer.parseInt(newValue);
	}
	
	public static double toDouble(String value) {
		String newValue = value.replace(",", ".");

		if(!isNumber(newValue)) {
			return 0;
		}
		return Double.parseDouble(newValue);
	}
	
	public static boolean isNumeroImpar(Integer value) {
		return isNumeroImpar(new Double(value));
	}
	
	public static boolean isNumeroImpar(Double value) {
		if(value == null) {
			return false;
		}
		
		return value % 2 == 0;
	}
}
