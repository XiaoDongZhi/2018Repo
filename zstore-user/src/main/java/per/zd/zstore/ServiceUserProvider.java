package per.zd.zstore;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceUserProvider {

    @RequestMapping(value="/zstore/login")
    public String login(String loginInfo)
    {
        System.out.print(loginInfo);
        return "hehe";
    }
}
