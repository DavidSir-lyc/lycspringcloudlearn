package lyc.springcloud.feign.lycspringcloudfeign.controller;
import lyc.springcloud.feign.lycspringcloudfeign.feign.ConsumeClient1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiFromClient1 {
    @Autowired
    ConsumeClient1 consumeClient1;

    @RequestMapping(value = "/hiFromClient1",method = RequestMethod.GET)
    public String hiFromClient1(@RequestParam String name){
        return consumeClient1.hiFromClient1(name);
    }
}
