package com.derek.banas.patterns.builder;

abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}

abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
