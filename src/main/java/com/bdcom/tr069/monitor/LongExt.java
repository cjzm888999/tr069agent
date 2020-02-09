package com.bdcom.tr069.monitor;

public class LongExt {
	private long current;
	private long last;

	public void backup() {
		last = current;
		current = 0;
	}

	public void addCurrent(long addition) {
		current += addition;
	}

	public long getCurrent() {
		return current;
	}

	public long getLast() {
		return last;
	}

	public long getDiff() {
		return current - last;
	}
}
