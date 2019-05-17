package Factory;

//Pizza abstract class

public abstract class Pizza {
	
	
	
	protected String description="Unknown Pizza";
	
	protected double Cost=0.0;
	
	
	
	
	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
	}

	
	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	

}
