package per.zad.zstore.zstoreadmin.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import per.zad.zstore.zstoreadmin.service.StoreService;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;


@Configuration
@EnableConfigurationProperties(ZstoreProperties.class)
@ConditionalOnClass(StoreService.class)
@ConditionalOnProperty(prefix = "phone",value = "huawei",matchIfMissing = true)
public class ZstoreProptertiesAutoConfig {
    @Autowired
    private ZstoreProperties zstoreProperties;

    @Bean
    @ConditionalOnMissingBean
    public StoreService storeService() {
        StoreService storeService = new StoreService();
        storeService.setItem(zstoreProperties.getItem());
        return storeService;
    }

}
