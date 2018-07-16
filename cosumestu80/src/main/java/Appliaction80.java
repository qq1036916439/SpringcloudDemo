
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.zzq.stu.consume")
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com"})
public class Appliaction80 {
    public static void main(String[] args) {
        SpringApplication.run(Appliaction80.class,args);
    }
}
