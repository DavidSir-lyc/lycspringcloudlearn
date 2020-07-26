package lyc.springcloud.erkclient2.lycspringclouderkclient2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class LycSpringcloudErkclient2Application {

    public static void main(String[] args) {
        SpringApplication.run(LycSpringcloudErkclient2Application.class, args);
    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/erkClient2")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

}