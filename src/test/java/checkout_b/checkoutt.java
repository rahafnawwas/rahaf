package checkout_b;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkoutt {
	private int price1=0;
	private checkout checkout_price;
	private String fruit;
	private ArrayList<fruit_price_array> fruits=new ArrayList<fruit_price_array>();
	@Given("the price of a {string} is {int}")
	public void thepriceofAls(String fruits , Integer price)
	{
		fruit=fruits;
		price1=price;
		fruit_price_array a=new fruit_price_array(fruit,price1);
		this.fruits.add(a);
	}

	
			@When("I checkout {int} {string}")
			public void iCheckout(Integer int1, String string) {
			int price_f=0;
			
			checkout_price=new checkout();
			for(fruit_price_array t :fruits)
			{
				if(t.fruit.equalsIgnoreCase(string))
					price_f=t.price;
			}
			 checkout_price.add(int1,price_f);
			}




	@Then("the total price should be {int}")
	public void theTotalPriceShouldBe(Integer price)
	{
		assertEquals(price.intValue(),checkout_price.total());
		checkout_price.runningtotal=0;
	} 


}
