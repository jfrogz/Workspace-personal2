package com.xpd.wsclient.sat;

import com.xpd.wsclient.sat.autentica.AutenticaResponse;
import com.xpd.wsclient.sat.autentica.QuoteClient;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		QuoteClient quoteClient = new QuoteClient();
		AutenticaResponse response = quoteClient.getQuote("test");
		System.out.println(response.getAutenticaResult());
	}
}
