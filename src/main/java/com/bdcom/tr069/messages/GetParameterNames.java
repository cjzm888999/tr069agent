package com.bdcom.tr069.messages;


import com.bdcom.tr069.cpe.Arguments;
import com.bdcom.tr069.cpe.HttpHandler;
import com.bdcom.tr069.monitor.Status;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class GetParameterNames {
	private static String response;

	public static String execute(Arguments args, HttpHandler httpHandler, Status status) throws IOException {
		String req = makeRequest();
		return httpHandler.send(req, args, status, "GPN");
	}

	private static String makeRequest() {
		if (response == null) {
			try {
				ClassLoader cl = GetParameterNames.class.getClassLoader();
				URL resource = cl.getResource("GPNResponse.txt");

				InputStream is = resource.openStream();
				InputStreamReader isr = new InputStreamReader(is);
				StringBuilder sb = new StringBuilder(100);
				while (true) {
					char[] cbuf = new char[100000];
					int charRead = isr.read(cbuf);
					sb.append(cbuf);
					if (charRead == -1)
						break;
				}
				response = sb.toString().trim();
			} catch (Throwable t) {

			}
		}
		return response;
	}

}
