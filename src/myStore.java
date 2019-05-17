
import Factory.Pizza;

import Factory.PizzaStore;

import Pizza.FamilySizePizza;
import Pizza.LargeSizePizza;
import Pizza.MediumSizePizza;
import Pizza.SmallSizePizza;
import Toppings.Anchovies;
import Toppings.Beer;
import Toppings.BlackOlives;
import Toppings.CanadianBacon;
import Toppings.Cheese;
import Toppings.GreenOlives;
import Toppings.GreenPepper;
import Toppings.Hamburger;
import Toppings.Mushrooms;
import Toppings.Onions;
import Toppings.Pepperoni;
import Toppings.Sausage;

//create pizza with ingredients based on the choice of the user

public class myStore extends PizzaStore {
	

	@Override
	protected Pizza createPizza(String item,Pizza pizza) {
		
		if(item.equals("small"))
			pizza=new SmallSizePizza();
	
		else if(item.equals("medium"))
			pizza=new MediumSizePizza();
		
		else if(item.equals("large"))
			pizza=new LargeSizePizza();
		
		else if(item.equals("family"))
			pizza=new FamilySizePizza();

			else if(item.equals("Cheese"))
				pizza=new Cheese(pizza);
		
			else if(item.equals("Pepperoni"))
				pizza=new Pepperoni(pizza);
		
			else if(item.equals("Hamburger"))
				pizza=new Hamburger(pizza);
		
			else if(item.equals("Canadian Bacon"))
				pizza=new CanadianBacon(pizza);
		
			else if(item.equals("Onions"))
				pizza=new Onions(pizza);
		
			else if(item.equals("Black Olives"))
				pizza=new BlackOlives(pizza);
		
			else if(item.equals("Green Olives"))
				pizza=new GreenOlives(pizza);
		
			else if(item.equals("Mushrooms"))
				pizza=new Mushrooms(pizza);
		
			else if(item.equals("Anchovies"))
				pizza=new Anchovies(pizza);
		
			else if(item.equals("Beer"))
				pizza=new Beer(pizza);
		
			else if(item.equals("Green Pepper"))
				pizza=new GreenPepper(pizza);
		
			else if(item.equals("Sausage"))
				pizza=new Sausage(pizza);
		 
		
		
		return pizza;
	}

}


