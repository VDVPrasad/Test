


public class OrderClientPost {

	// http://localhost:8080/FictionalOrganization/bricks/customer/post
	public static void main(String[] args) {

	  try {

        URL url = new URL("http://localhost:8080/FictionalOrganization/bricks/customer/put");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
          String input = "{\"name\":Kiran,\"OrderId\":\"00001, \"numberOfBricks\"100000 \"}";
        OutputStreamWriter out = new OutputStreamWriter(
        httpCon.getOutputStream());
        out.write(input);
        out.close();
        httpCon.getInputStream();
          
			if (conn.getResponseCode() != HttpURLConnection.HTTP_UPDATED) {
			throw new RuntimeException("Failed : HTTP error code : "
				+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output;
		System.out.println("No of bricks are updated : \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();

	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();

	 }

	}

}
