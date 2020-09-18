package checkout_b;

public class checkout {
   
   static int runningtotal=0;
	public void add(Integer count, int price1) {
		runningtotal+=(count.intValue()*price1);
	}
	public int total()
	{
		return runningtotal;
		}
	

	

}
