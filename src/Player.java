public abstract class Player {
    String name;
    char symbol;
    int score;
    int[][] position;
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
