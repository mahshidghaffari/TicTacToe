/**
 * This is the player class.
 * It contains the attributes that every player should have.
 */
public abstract class Player {
    /**
     * This is the name variable.
     * It contains the name of the symbol.
     */
    private String name;
    /**
     * This is the symbol variable.
     * It contains the symbol of the player.
     */
    private char symbol;

    /**
     * This is the constructor.
     *It sets the name and the symbol of the player.
     * @param name, not null
     * @param symbol, not null
     */
    public Player(String name,char symbol){
        this.name = name;
        this.symbol = symbol;
    }

    public abstract int [][] move(Board board);

    /**
     * This is the name getter class.
     * @return name of player, not null
     */
    public String getName(){
        return name;
    }

    /**
     * This is the symbol getter method.
     * @return symbol of player, not null
     */
    public char getSymbol(){
        return symbol;
    }
}
