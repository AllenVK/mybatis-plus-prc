package com.paul.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


/**
 * Date: 2023-02-10 17:06
 * Author: Paul
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BaomidouDemo {

    //static Logger logger = LoggerFactory.getLogger(BaomidouDemo.class);

    public static void main(String[] args) {
        /*ConfigurableApplicationContext application = */SpringApplication.run(BaomidouDemo.class, args);
/*        Environment env = application.getEnvironment();
        String port = env.getProperty("server.port");
        logger.info("\n----------------------------------------------------------\n\t" +
                        "Application '{}' is running! Access URLs:\n\t" +
                        "Local: \t\thttp://localhost:{}\n\t" +
                        "External: \thttp://{}:{}\n\t" +
                        "Doc: \thttp://{}:{}/doc.html\n" +
                        "----------------------------------------------------------",
                env.getProperty("spring.application.name"), port,
                InetAddress.getLocalHost().getHostAddress(), port,
                InetAddress.getLocalHost().getHostAddress(), port);*/
    }

}
