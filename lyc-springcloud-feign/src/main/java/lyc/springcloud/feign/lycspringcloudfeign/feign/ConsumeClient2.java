package lyc.springcloud.feign.lycspringcloudfeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "erk-client2")
public interface ConsumeClient2 {
    @RequestMapping(value = "/erkClient2",method = RequestMethod.GET)
    String hiFromClient2(@RequestParam(value = "name") String name);
}
