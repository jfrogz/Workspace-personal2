package com.xpd.rabbitmq.client;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import com.xpd.rabbitmq.client.util.MessageConverter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MsgConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MsgConsumer.class);

    private String queueHost;
    private String queueName;
    boolean durable = true;
    int prefetchCount = 1;
    boolean autoAck = false;

    private static Properties prop = new Properties();

    static {
        InputStream input = null;
        try {
            prop.load(MsgConsumer.class.getClassLoader().getResourceAsStream("queueConfig.properties"));
        } catch (IOException ex) {
            LOGGER.error(ex.getMessage(), ex);
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    LOGGER.error(e.getMessage(), e);
                }
            }
        }
    }

    public MsgConsumer() {
        this.queueHost = prop.getProperty("com.xpd.rabbitmq.client.queue.host");
        this.queueName = prop.getProperty("com.xpd.rabbitmq.client.queue.name");
    }

    public void consume() {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost(queueHost);
            Connection connection = factory.newConnection();
            final Channel channel = connection.createChannel();

            channel.queueDeclare(queueName, durable, false, false, null);
            channel.basicQos(prefetchCount);
            LOGGER.info(" [W01] Waiting for messages.");

            channel.basicConsume(queueName, autoAck, "myConsumerTag", new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
                        throws IOException {
                    String message = new String(body, "UTF-8");
                    LOGGER.info(" [" + consumerTag + "] Received '" + message + "'");
                    MessageConverter.fromJsonCfdi(message).getRfcEmisor();
                    //ENVIAR INFORMACION AL SAT

                    try {
                        doWork(message);
                    } catch (InterruptedException e) {
                        LOGGER.error(e.getMessage(), e);
                    } finally {
                        LOGGER.info(" [" + consumerTag + "] Done");
                    }
                    channel.basicAck(envelope.getDeliveryTag(), false);
                }
            });

        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        } catch (TimeoutException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    private void doWork(String task) throws InterruptedException {
        for (char ch : task.toCharArray()) {
            if (ch == '.') {
                Thread.sleep(1000);
            }
        }
    }

    public static void main(String[] args) {
        (new MsgConsumer()).consume();
    }

}
