package app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * sbootConfigClient 客户端主程序
 */
@SpringBootApplication
public class SbootConfigClient {
    private static final Logger logger = LoggerFactory.getLogger(SbootConfigClient.class);

    public static void main(String args[]){
        logger.info("sbootConfigClient 客户端主程序开始启动。。。。");
        SpringApplication.run(SbootConfigClient.class);
        logger.info("sbootConfigClient 客户端主程序结束启动。。。。");
    }
}
