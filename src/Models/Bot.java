package Models;

public class Bot extends Player{

    private BotDifficultLevel botDifficultLevel;

    public Bot(String name,Symbol symbol,PlayerType playerType,BotDifficultLevel botDifficultLevel) {
        super(name,symbol,playerType);
        this.botDifficultLevel = botDifficultLevel;
    }

    public BotDifficultLevel getBotDifficultLevel() {
        return botDifficultLevel;
    }

    public void setBotDifficultLevel(BotDifficultLevel botDifficultLevel) {
        this.botDifficultLevel = botDifficultLevel;
    }
}
