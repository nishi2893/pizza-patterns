package Pizza;

import Factory.Pizza;

public class SmallSizePizza extends Pizza {
	
	public SmallSizePizza()
	{
		
		description="Small with ";
	}

	

	@Override
	public double getCost() {                                      //returns the cost of small size pizza
		
		return 8;
	}
	
	

}
