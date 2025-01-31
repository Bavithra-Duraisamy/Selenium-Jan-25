package week2.day4;

public class DatabaseImplementation implements DatabseConnection {

	@Override
	public void connect() {
		System.out.println("DB Connected Successfully");
		
	}

	@Override
	public void disconnect() {
		System.out.println("DB disconnected Successfully");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("DB executed the update Successfully");
		
	}
	
	public static void main(String[] args) {
		DatabaseImplementation dbImpl = new DatabaseImplementation();
		dbImpl.connect();
		dbImpl.disconnect();
		dbImpl.executeUpdate();
	}

}
