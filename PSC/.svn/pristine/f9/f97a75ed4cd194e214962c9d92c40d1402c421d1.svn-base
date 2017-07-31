package com.xpd.rabbitmq.client.util;

import com.google.gson.Gson;
import com.xpd.commons.dto.queue.CfdiDTO;
import com.xpd.commons.dto.queue.MessageDTO;

public class MessageConverter {

	private static Gson gson = new Gson();
	
	public static String toJson( MessageDTO message ){
		return gson.toJson(message);
	}
	
	public static MessageDTO fromJson( String jsonMessage ){
		return gson.fromJson( jsonMessage,  MessageDTO.class);
	}
	
	public static String toJsonCfdiDTO(CfdiDTO object){
		return gson.toJson(object);
	}
	public static CfdiDTO fromJsonCfdi( String jsonMessage ){
		return gson.fromJson( jsonMessage,  CfdiDTO.class);
	}
}
