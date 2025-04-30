package com.example.sns;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class SqsListenerService {

    @SqsListener("minha-fila-sqs")
    public void receiveMessage(String message) {
        System.out.println("Mensagem recebida da fila SQS: " + message);
    }
}
