public class electronic
{
	public void run()
    	{
        	Duck electricDuck = new ElectronicDuck();
        	quack(electricDuck);
        	swim(electricDuck);
    	}

	private void quack(Duck... ducks)
    	{	
		if (elec._on){
        	for (Duck duck : ducks) {
            		duck.quack();
        	}}
		else
			System.out.println("Electronic duck is off");
    	}
	private void swim(Duck... ducks)
    	{
		if (elec._on){
        	for (Duck duck : ducks) {
           	 duck.swim();
        	}}
		else
			System.out.println("Electronic duck is off");
    	}
}