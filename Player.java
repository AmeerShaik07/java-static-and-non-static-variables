public class Player{
    static int totalPlayers = 0;
    String playerName;
    
    public Player(String name){
        this.playerName = name;
        totalPlayers++;
    }
    public static void main(String args[]){
        Player p1 = new Player("Ameer");
        Player p2 = new Player("Yash");
        System.out.println("Total Players : " + Player.totalPlayers);
        System.out.println("Player p1 : " + p1.playerName);
        System.out.println("Player p2 : " + p2.playerName);
    }
}