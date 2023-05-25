@Configuration
@Data
@PropertySource("config.properties")
public class BotConfig {
    @Value("${bot.name}") String botName;
    @Value("${bot.token}") String token;
    @Value("${bot.chatId}") String chatId;
}