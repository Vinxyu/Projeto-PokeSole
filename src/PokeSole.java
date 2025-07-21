import java.util.Scanner;
import java.util.Random;
public class PokeSole {
    public static int pokeSelect;
    public static int secretScan;
    public static int enemySelector;
    public static Scanner scan = new Scanner(System.in);

    public static void pokemonSelector(){
        PokeGame.selector();
        if (pokeSelect == 98) {
            secretScan = scan.nextInt();
            PokeGame.secretSelector();
            PokeGame.selectorType();
            System.out.println(PokeGame.pokeballGoes);
        } else if (pokeSelect <= 30 && pokeSelect > 0) {
            PokeGame.selectorType();
            System.out.println(PokeGame.pokeballGoes);
        }
    };
    public static void main(String[] args) {
        PokeGame gameSystem = new PokeGame();
        Random random = new Random();
        System.out.println(gameSystem.title);
        System.out.println("\n Welcome to PokeSole write 'start' to continue ");
        String initscan = scan.nextLine();
        if (initscan.equals("start")) {
            System.out.println(gameSystem.pokePc);
        }
        else {
            System.out.println("Error! Try Again");
            return;
        }
        pokeSelect = scan.nextInt();
        pokemonSelector();
        enemySelector = random.nextInt(36)+ 1;
        System.out.println("\n The battle has started! \n Your enemy: ");
        PokeGame.selectorEnemy();
        System.out.println(PokeGame.pokeballGoes);
        PokeGame.battleTurn();


    }
}
