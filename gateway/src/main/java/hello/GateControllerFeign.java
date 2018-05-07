package hello;

import hello.microservices.App1Client;
import hello.microservices.App2Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GateControllerFeign {

    @Autowired
    private App1Client app1Client;

    @Autowired
    private App2Client app2Client;

    @RequestMapping("/greeting2")
    public String greeting() {
        String greeting1 = this.app1Client.getGreeting();
        String greeting2 = this.app2Client.getGreeting();

        return String.format("Got app1 answer: %s , and app2 answer: %s", greeting1, greeting2);
    }
}
