package lyc.springcloud.eurekaserevr.lycspringcloudeurekaserevr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LycSpringcloudEurekaserevrApplication {

    public static void main(String[] args) {
        SpringApplication.run(LycSpringcloudEurekaserevrApplication.class, args);
    }

}
