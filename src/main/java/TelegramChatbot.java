import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramChatbot extends TelegramLongPollingBot {

    private static final String BOT_ACCESS_KEY = "6385491986:AAEH8PlhwwFFWAJo3NYLJ-mcwjm1bwm9wEc";

    private static final String BOT_USERNAME = "nhat51bot";


    @Override
    public String getBotUsername() {
        return BOT_USERNAME;
    }

    @Override
    public String getBotToken() {
        return BOT_ACCESS_KEY;
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println("===============>" + update.getMessage().getText());
    }
}
