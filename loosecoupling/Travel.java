package com.loosecoupling;

public class Travel implements Itravel {
	private Transport t;
	Travel(Transport t){
		this.t=t;
	}
	public void show() {
		t.start();
	}
}
