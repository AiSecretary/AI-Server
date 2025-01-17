package server.server.global.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.theokanning.openai.service.OpenAiService;

import java.time.Duration;

@Slf4j
@Configuration
public class ChatGptConfig {
    @Value("${openai.api.key}")
    private String key;

    @Bean
    public OpenAiService openAiService() {
        log.info("token : {}을 활용한 OpenAiService 을 생성합니다.", key);
        return new OpenAiService(key, Duration.ofSeconds(60));
    }

}
