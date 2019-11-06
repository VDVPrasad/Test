public class StopUpdateDispatchedOrderService {

        @POST
	@Path("/post")
	@Consumes("application/stopUdateDispatchedOrder")
	public Response stopUpdateDispatchedService(Customer customer) {

		String result = "Stop Updated Dispatched customer : " + customer;
		return Response.status(201).entity(result).build();
		
	}
