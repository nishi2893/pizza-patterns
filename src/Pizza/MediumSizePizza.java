package Pizza;

import Factory.Pizza;

public class MediumSizePizza extends Pizza{
	
	public MediumSizePizza()
	{
		
		description="Medium with ";
	}

	

	@Override
	public double getCost() {                                //returns the cost of medium size pizza
		
		return 10;
	}
	
	

}
