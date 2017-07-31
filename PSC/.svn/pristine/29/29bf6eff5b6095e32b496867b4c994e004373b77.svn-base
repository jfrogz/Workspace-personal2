package com.xpd.wsclient.sat.autentica;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class QuoteClient extends WebServiceGatewaySupport{

	public AutenticaResponse getQuote(String ticker) {

		ObjectFactory request = new ObjectFactory();
		request.createAutenticaResponseAutenticaResult("sfeqwmqgmqpormgpqrm");
		
		AutenticaResponse response = (AutenticaResponse) getWebServiceTemplate()
				.marshalSendAndReceive(QuoteClient.class.getClassLoader().getResource("Autenticacion.svc.wsdl"));

		return response;
	}
}
