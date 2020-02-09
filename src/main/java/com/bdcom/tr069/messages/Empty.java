package com.bdcom.tr069.messages;


import com.bdcom.tr069.cpe.Arguments;
import com.bdcom.tr069.cpe.HttpHandler;
import com.bdcom.tr069.monitor.Status;

import java.io.IOException;

public class Empty {

	public static String execute(Arguments args, HttpHandler httpHandler, Status status) throws IOException {
		String req = null;
		return httpHandler.send(req, args, status, "EM");
	}
}
