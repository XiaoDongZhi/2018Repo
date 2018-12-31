package per.zd.zstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OderApplication {
    public static void main(String args[]){
        SpringApplication.run(OderApplication.class, args);
    }
}
