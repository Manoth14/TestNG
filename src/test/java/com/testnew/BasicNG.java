package com.testnew;

import org.testng.annotations.Test;

public class BasicNG {

	public void tt1() {
		System.out.println("A");

	}

	public void tt2() {
		System.out.println("B");
	}

	private void tt3() {
		System.out.println("C");

	}

	private void tt5() {
		System.out.println("E");
	}

	private void tt6() {
		System.out.println("F");
	}

	public static void main(String[] args) {
		BasicNG basicNG = new BasicNG();
		basicNG.tt1();
		basicNG.tt2();
		basicNG.tt3();

	}
}
