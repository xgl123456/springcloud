package springcloudtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	public static void main(String[] args) {
//		int port = 8761;
//		if (!NetUtil.isUsableLocalPort(port)) {
//			System.err.printf("端口%d被占用了，无法启动%n", port );
//            System.exit(1);
//		}
//		new SpringApplicationBuilder(EurekaServerApplication.class).properties("server.prot=" + port).run(args);
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
