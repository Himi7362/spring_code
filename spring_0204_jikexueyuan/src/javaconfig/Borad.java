package javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Borad {

	private int bid ;
	@Autowired
	private Memory memory;
	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}
	public void run(){
		memory.setSize("16GB");
		memory.getSize();
	}
}
