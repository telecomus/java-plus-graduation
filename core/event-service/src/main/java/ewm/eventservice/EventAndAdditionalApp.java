package ewm.eventservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ConfigurationPropertiesScan
@EnableFeignClients(basePackages = {"ewm.client", "ewm.interaction.feign"})
@ComponentScan(basePackages = {"ewm.client", "ewm.eventservice"})
public class EventAndAdditionalApp {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(EventAndAdditionalApp.class, args);
    }
}