package br.com.smssender;

import br.com.smssender.model.SMSFeedback;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    private static final String ACCOUNT_SID = "twilio account sid";
    private static final String TOKEN = "twilio token";


    @PostMapping("/sms")
    public void sendSMS(@RequestBody SMSFeedback smsFeedback){
        Twilio.init(ACCOUNT_SID, TOKEN);

        Message.creator(new PhoneNumber(smsFeedback.getToNumber()), new PhoneNumber("twilio phone number"), smsFeedback.getMessage()).create();
    }
}
