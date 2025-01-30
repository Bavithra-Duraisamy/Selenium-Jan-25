package week2.day3;

public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println("Only endpoint!..");
	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Endpoint, Request body and Request Status");
	}

	public static void main(String[] args) {
		APIClient api = new APIClient();
		api.sendRequest("S0");
		api.sendRequest("S1", "s2", false);

	}

}
