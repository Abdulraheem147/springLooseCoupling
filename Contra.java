package com.Abdul.SpringLooseCoupling;

import org.springframework.stereotype.Component;

@Component("abc")
public class Contra implements GameConsole {

	@Override
	public void up() {
		System.out.println("Contra up");
		
	}

	@Override
	public void down() {
		System.out.println("Contra down");
		
	}

	@Override
	public void left() {
		System.out.println("Contra lefft");
		
	}

	@Override
	public void right() {
		System.out.println("Contra right");
		
	}
	

}
