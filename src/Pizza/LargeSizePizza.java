package Pizza;

import Factory.Pizza;

public class LargeSizePizza extends Pizza{
	
	public LargeSizePizza()
	{
		
		description="Large with ";
	}

	@Override
	public double getCost() {                                 //returns the cost of large size pizza
		
		return 12;
	}


}
