package com.meditab.training.lsp.exercise;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        Duck electricDuck = new ElectronicDuck();
        quack(donaldDuck);
        swim(donaldDuck);
    }

    private void quack(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();

	electronic elec = new electronic();
	elec.run();
    }
}