public abstract class Player {
    private String name;
    private char symbol;
    public Player(String name,char symbol){
        this.name = name;
        this.symbol = symbol;
    }

    public abstract int [][] move(Board board);
    public String getName(){
        return name;
    }

    public char getSymbol(){
        return symbol;
    }
}
