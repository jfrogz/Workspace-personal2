package com.xpd.rabbitmq.client.logical;

import com.xpd.commons.dto.queue.MessageDTO;
import com.xpd.commons.exception.XPDException;
import org.apache.commons.lang3.StringUtils;

public class MessageLogical {

    public static void validateMessage(MessageDTO message) throws XPDException {
        if (message == null) {
            throw new XPDException("El mensaje que se va a enviar no puede ser null");
        }
        /**
         * validaciones de negocio
         *
         */
        if (StringUtils.isBlank(message.getHeader())) {
            throw new XPDException("El header del mensaje no puede ser vacio");
        }
        if (StringUtils.isBlank(message.getBody())) {
            throw new XPDException("El body del mensaje no puede ser vacio");
        }
    }
}
