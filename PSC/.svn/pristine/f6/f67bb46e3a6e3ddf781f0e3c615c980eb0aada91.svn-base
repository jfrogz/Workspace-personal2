package com.xpd.rabbitmq.client;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;
import com.xpd.commons.Constants;
import com.xpd.commons.dto.queue.CfdiDTO;
import com.xpd.commons.exception.XPDException;
import com.xpd.rabbitmq.client.util.MessageConverter;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MsgProducer, RabbitMQ Client
 */
public class MsgProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MsgProducer.class);

    private String queueHost;
    private String queueName;

    Connection connection;

    boolean durable = true;

    public MsgProducer() {
        this(Constants.COLA_ENVIO_IP, Constants.COLA_ENVIO_QUEUE_NAME);
    }

    public MsgProducer(String host, String name) {

        LOGGER.debug("MsgProducer");
        this.queueName = name;
        this.queueHost = host;
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(queueHost);
        try {
            connection = factory.newConnection();
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        } catch (TimeoutException e) {
            LOGGER.error(e.getMessage(), e);
        }

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        connection.close();
    }

    public void sendMessage(CfdiDTO messageDto) throws XPDException {
        //LOGGER.debug("sendMessage");
        String message = MessageConverter.toJsonCfdiDTO(messageDto);
        try {
            if (connection != null) {
                Channel channel = connection.createChannel();
                channel.queueDeclare(queueName, durable, false, false, null);
                channel.basicPublish("", queueName, MessageProperties.PERSISTENT_TEXT_PLAIN, message.getBytes("UTF-8"));
                //LOGGER.debug(" [x] Sent '" + message + "'");
                channel.close();
            }
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        } catch (TimeoutException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

}
