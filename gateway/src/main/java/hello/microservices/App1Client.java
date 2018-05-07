package hello.microservices;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("app1")
public interface App1Client {
    @RequestMapping(method = RequestMethod.GET, value = "/greeting")
    String getGreeting();
}
