package Pizza;

import Factory.Pizza;

public class FamilySizePizza extends Pizza{
	
	public FamilySizePizza()
	{
		
		description="Family with ";
	}

	@Override
	public double getCost() {                           //returns the cost of family size pizza
		
		return 16;
	}


}
