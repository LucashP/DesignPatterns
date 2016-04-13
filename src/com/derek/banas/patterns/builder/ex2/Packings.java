package com.derek.banas.patterns.builder.ex2;

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
