package lyc.springcloud.feign.lycspringcloudfeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "erk-client1")
public interface ConsumeClient1 {
    @RequestMapping(value = "/erkClient1",method = RequestMethod.GET)
    String hiFromClient1(@RequestParam(value = "name") String name);
}