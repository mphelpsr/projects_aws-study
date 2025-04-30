package com.example.sns;

import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.sns.SnsClient;

@Service
public class SnsPublisherService {

    private final SnsClient snsClient;

    public SnsPublisherService(SnsClient snsClient) {
        this.snsClient = snsClient;
    }

    public void publishMessage(String topicArn, String message) {
        snsClient.publish(p -> p
                .topicArn(topicArn)
                .message(message)
        );
    }
}

