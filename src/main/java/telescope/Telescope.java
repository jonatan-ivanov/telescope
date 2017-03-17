package telescope;

import be.ordina.msdashboard.EnableMicroservicesDashboardServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Jonatan Ivanov
 */
@EnableEurekaClient
@SpringBootApplication
@EnableMicroservicesDashboardServer
public class Telescope {
    public static void main(String[] args) {
        SpringApplication.run(Telescope.class, args);
    }
}
