package com.Abdul.SpringLooseCoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
//@Scope("prototype")
public class GameRunner {
	
	public GameRunner() {
		System.out.println("Sample");
	}
	
	
	@Autowired
	@Qualifier("abc")
	GameConsole obj;
	public GameRunner(GameConsole obj) {
		
		this.obj = obj;
	}
	public void run() {
		obj.up();
		obj.down();
		obj.left();
		obj.right();
		
		}
	

}
