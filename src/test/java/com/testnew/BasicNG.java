package com.testnew;

import org.testng.annotations.Test;

public class BasicNG {

	public void tt1() {
		System.out.println("A");

	}

	public void tt2() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		BasicNG basicNG = new BasicNG();
		basicNG.tt1();
		basicNG.tt2();
	}
}
