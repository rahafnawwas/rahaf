package test_project;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class check {

	Checkout c = new Checkout ();

	ArrayList<item> items = new ArrayList<item>();

	@Given("the price of a {string} is {int}")
	public void thePriceOfAIs(String string, Integer int1) {
		item a = new item (string , int1 );
		items.add(a);
		
	}




	@When("I checkout {int} {string}")
	public void iCheckout(Integer int1, String string) {
		int p = c.findPrice(string, items);
		c.add(int1.intValue(), p);


	}




	@Then("the total price should be {int}")
	public void theTotalPriceShouldBe(Integer int1) {
		
		assertEquals(int1.intValue(),c.finalPrice());
		items.clear();
	}



}
