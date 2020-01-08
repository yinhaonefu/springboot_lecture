package com.test.spring.echo;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class EchoWebSocketHandler extends TextWebSocketHandler {

    private EchoService echoService;

    public EchoWebSocketHandler(EchoService echoService){
        this.echoService = echoService;
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("连接建立");
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        //接收到客户端传递的消息
        String echoMessage = this.echoService.getMessage(message.getPayload());
        System.out.println("接收到客户端消息 " + echoMessage);
        //向客户端返回消息
        session.sendMessage(new TextMessage(echoMessage));
        System.out.println("向客户端返回消息 " + echoMessage);
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        session.close(CloseStatus.SERVER_ERROR);
    }
}
