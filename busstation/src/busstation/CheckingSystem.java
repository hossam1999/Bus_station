    package busstation;
    public class CheckingSystem {
	private static String PasscodeManager="12345";
	private static String Visa_idManager="1234";
	
	private static String PasscodeEmployee="5678";
	private static String Visa_idEmployee="hs";
	
	private static String PasscodeClient="9999";
	private static String Visa_idClient="bo";
	
	public boolean ManagerCheckPasscode(String s,String k) {
		
		if(PasscodeManager.equals(k)&& Visa_idManager.equals(s)) {
			return true;
		}
		return false;
		}
	
     public boolean EmployeeCheckPasscode(String s,String k) {
		
		if(PasscodeEmployee.equals(k)&& Visa_idEmployee.equals(s)) {
			return true;
		}
		return false;
		}


  public boolean ClientCheckPasscode(String s,String k) {
	
	if(PasscodeClient.equals(k)&& Visa_idClient.equals(s)) {
		return true;
	}
	return false;
	}
	
			
	 
}




