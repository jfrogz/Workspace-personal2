package com.xpd.rabbitmq.client;

import com.xpd.commons.dto.queue.MessageDTO;
import com.xpd.commons.exception.XPDException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MessageProducerTest extends TestCase {

	MsgProducer msgProducer;

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public MessageProducerTest(String testName) {
		super(testName);
		msgProducer = new MsgProducer("192.168.99.100", "testQueue");
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(MessageProducerTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		try {
			MessageDTO messageDto = new MessageDTO("header", "body...asdasdasd...");
			msgProducer.sendMessage(null);
		} catch (XPDException e) {
			e.printStackTrace();
			assertTrue(false);
		}
		assertTrue(true);
	}
}
