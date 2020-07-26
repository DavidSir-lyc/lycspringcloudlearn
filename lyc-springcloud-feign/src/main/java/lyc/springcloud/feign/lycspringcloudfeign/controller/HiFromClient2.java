package lyc.springcloud.feign.lycspringcloudfeign.controller;
import lyc.springcloud.feign.lycspringcloudfeign.feign.ConsumeClient2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiFromClient2 {
    @Autowired
    ConsumeClient2 consumeClient2;

    @RequestMapping(value = "/hiFromClient2",method = RequestMethod.GET)
    public String hiFromClient2(@RequestParam String name){
        return consumeClient2.hiFromClient2(name);
    }
}
