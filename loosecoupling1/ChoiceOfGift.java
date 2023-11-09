package com.loosecoupling1;

public class ChoiceOfGift implements Examination {
	private Examination g;
	ChoiceOfGift(Examination g){
		this.g=g;
	}
	public void gift() {
		g.gift();
	}
}
