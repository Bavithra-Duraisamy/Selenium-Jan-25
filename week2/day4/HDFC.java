package week2.day4;

public class HDFC implements RBI {

	@Override
	public void mandatoryKYC() {
		System.out.println("Passport");
		
	}

	@Override
	public void depositLimit() {
		System.out.println("10L");
		
	}
	
	public static void main(String[] args) {
		HDFC hdfcOptions = new HDFC();
		hdfcOptions.mandatoryKYC();
		hdfcOptions.depositLimit();
	}

}
