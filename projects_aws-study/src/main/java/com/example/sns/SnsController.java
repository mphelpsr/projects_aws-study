package com.example.sns;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sns")
public class SnsController {

    private final SnsPublisherService snsPublisherService;

    public SnsController(SnsPublisherService snsPublisherService) {
        this.snsPublisherService = snsPublisherService;
    }

    @PostMapping("/publish")
    public String publish(@RequestParam String message) {
        String topicArn = "arn:aws:sns:us-east-1:000000000000:meu-topico-sns";  // Atualizar com seu ARN real
        snsPublisherService.publishMessage(topicArn, message);
        return "Mensagem publicada no SNS!";
    }
}
