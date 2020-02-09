package com.bdcom.tr069.monitor;

public class IntExt {
	private int current;
	private int last;

	public void backup() {
		last = current;
		current = 0;
	}

	public void addCurrent(int addition) {
		current += addition;
	}
	
	public int getCurrent() {
		return current;
	}

	public int getLast() {
		return last;
	}

	public int getDiff() {
		return current - last;
	}
}
