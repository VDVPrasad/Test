
@Path("/brick/customer")
Public Class Customer
{

public String name:
public long orderId:
public long numberOfBricks:

@Get
@Path("/get")
@Produces("bricks/order")
public long getOrderId(){

return orderId;
}

@Get
@Path("/get")
@Produces("bricks/name")

public String getName(){
return name;
}

@Get
@Path("/get")
@Produces("bricks/NumberOfBricks")

public long getNumberOfBricks(){
return numberOfBricks;
}

public setName(String name ){
this.name=name; 
}
public setOrderId(long orderId)
{
this.orderId=orderId;
}
