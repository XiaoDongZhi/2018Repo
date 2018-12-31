package per.zd.zstore.util;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryUtil {

    @Autowired
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String ip;

    @GetMapping("/client")
    public String client()
    {
        String services = "appName : "+appName+" ; Services: " + eurekaClient.getApplication(appName)+" ip :"+ip;
        System.out.println(services);
        return services;
    }
}
