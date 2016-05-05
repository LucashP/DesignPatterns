package com.derek.banas.patterns.builder;

class Wrapper implements Packing {
	@Override
	public String pack() {
		return "Wrapper";
	}
}

class Bottle implements Packing {
	@Override
	public String pack() {
		return "Bottle";
	}
}
