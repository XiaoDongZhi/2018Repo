package per.zad.zstore.zstoreadmin.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "phone")
public class ZstoreProperties {

    // 默认的配置的值
    private final static String ITEM = "iphone";

    // 由于在configuationProperties中配置了前缀，所以可以在application.properties中使用phone.item配置该值，如果application.proterties里面没有配置，
    //则使用ITEM默认值"iphone"
    private String item = ITEM;

    // 这里的get和set方法，是方便外部注入参数值用的，需要注意的是这里和StoreService不同，并没有让properties中的参数直接注入到StoreService中
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
