import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class ptahaBOT extends TelegramLongPollingBot {

    final private String BotUserName = "ptaha_shop_bot";
    final private String BotToken = "5423354324:AAGzUePPclHbQuDnDtmloE2i4vhvaD17hKM";
    @Override
    public String getBotUsername() {
        return BotUserName;
    }

    @Override
    public String getBotToken() {
        return BotToken;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if(update.getMessage()!=null && update.hasMessage()){
            long chat_id = update.getMessage().getChatId();

            try {
                execute(new SendMessage(String.valueOf(chat_id),"etpizda"));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


