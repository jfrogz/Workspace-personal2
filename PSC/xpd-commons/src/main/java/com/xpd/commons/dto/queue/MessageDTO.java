package com.xpd.commons.dto.queue;

public class MessageDTO {

	private String header;
	private String body;
	
	public MessageDTO( String header, String body ) {
		this.header = header;
		this.body = body;
	}
	
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
}
