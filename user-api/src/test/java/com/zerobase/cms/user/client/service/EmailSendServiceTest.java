package com.zerobase.cms.user.client.service;

import com.zerobase.cms.user.client.MailgunClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailSendServiceTest {

    @Autowired
    private MailgunClient mailgunClient;

    @Test
    public void EmailTest() {
        // 숙제,
        mailgunClient.sendEmail(null);

//        Response response = emailSendService.sendEmail();
//        System.out.println(response);

    }
}